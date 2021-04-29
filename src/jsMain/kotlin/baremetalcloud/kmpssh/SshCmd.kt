package dev.affair.ssh

import Client
import baremetalcloud.kmpssh.*
import kotlinx.coroutines.CompletableDeferred

data class SshCmd(val host: SshHost, val identity: SshIdentity, val options: SshOptions, val cmd: String) {
    val result = CompletableDeferred<SshResult>()

    var outBuf = ""
    var errBuf = ""

    val c = Client().apply {
        val config = JsConnectConfig(
            host = host.hostname,
            username = identity.username,
            password = identity.password,
            port = host.port,
            debug = { println(it) }
        )
        on("ready") { message ->
            println(message)
            exec(cmd) { err, stream ->
                stream.on("data") { data ->
                    println("stream.data $data")
                    outBuf += data.toString()
                }
                stream.stderr.on("data") { data ->
                    errBuf = data.toString()
                }
                stream.on("close", { code: Int, signal: Int ->
                    println("stream.close $code $signal")
                    end()
                    result.complete(
                        when (code) {
                            0 -> SshResult.Success(outBuf)
                            else -> SshResult.Failure(outBuf, errBuf, code)
                        }
                    )
                })
            }
        }
        connect(config)
//        exec("echo 1")
    }
}
