package com.baremetalcloud.kmpssh

import com.jcraft.jsch.*


actual data class SshSession(val host: com.baremetalcloud.kmpssh.SshHost, val identity: SshIdentity, val options: SshOptions) {
    private val jsch: JSch = JSch()
    lateinit var checkedsession: Session
    private fun buildSession(): Session {

        when (identity) {
            is SshIdentity.Key -> jsch.addIdentity(identity.privateKey, identity.passphrase)
        }

//        if (options.openSSHConfig != null) {
//            jsch.configRepository = OpenSSHConfig.parseFile(options.openSSHConfig)
//        }
//
//        if (options.knownHostsFile != null) {
//            jsch.setKnownHosts(options.knownHostsFile)
//        }

        val ses = jsch.getSession(identity.username, host.hostname, host.port)

//        if (options.proxy != null) {
//            ses.setProxy(options.proxy)
//        }
        ses.serverAliveInterval = 5000
        ses.serverAliveCountMax = 5
        ses.timeout = options.connectTimeout.toInt()
        ses.setConfig("PreferredAuthentications", "publickey,keyboard-interactive,password")
        ses.userInfo = SshUserInfo(identity.password, identity.passphrase)

//        for ((k, v) in options.sessionConfig) {
//            ses.setConfig(k, v)
//        }
        ses.connect(options.connectTimeout.toInt())
        return ses
    }

    fun jschsession(): Session {
        if (!::checkedsession.isInitialized) {
            checkedsession = buildSession()
        }
        try {
            checkedsession.sendKeepAliveMsg()
            val testChannel = checkedsession.openChannel("exec") as ChannelExec
            testChannel.setCommand("true")
            testChannel.connect()
            testChannel.disconnect()
        } catch (ex: Exception) {
            try {
                checkedsession.disconnect()
            } catch (e: Exception) {
            }
            println("Session is KO, reconnecting...")
            checkedsession = buildSession()
        }
        return checkedsession
    }
}
private fun com.baremetalcloud.kmpssh.Ssh.toSession() =
    SshSession(host = host, identity = identity, options = options)

actual suspend fun com.baremetalcloud.kmpssh.Ssh.exec(cmd: String): SshResult {
    val stdout = StringBuilder()
    val stderr = StringBuilder()
    var exitCode = -1
    val outputReceiver = fun(buffer: StringBuilder): ExecResult.() -> Unit = {
        when (this) {
            is ExecResult.ExecPart -> {
                if (buffer.isNotEmpty()) buffer.append("\n")
                buffer.append(content)
                println(content)
            }
            is ExecResult.ExecEnd -> exitCode = rc
            else -> Unit
        }
    }

    var runner: SSHExec? = null
    try {
        runner = SSHExec(cmd, outputReceiver(stdout), outputReceiver(stderr), this.toSession())
        runner.waitForEndS()
    } catch (e: InterruptedException) {
        throw SSHTimeoutException(stdout.toString(), stderr.toString())
    } finally {
        runner?.close()
    }
    return if (exitCode == 0) {
        SshResult.Success(stdout.toString(), stderr.toString())
    } else {
        SshResult.Failure(stdout.toString(), stderr.toString(), exitCode = exitCode)

    }
}

class SSHTimeoutException(val stdout: String, val stderr: String) : Exception("kossh.impl.SSH Timeout")
