package baremetalcloud.kmpssh.test

import baremetalcloud.kmpfile.File
import baremetalcloud.kmpfile.readText
import baremetalcloud.kmpssh.*
import baremetalcloud.runblocking.runBlockingCommon

import kotlinx.coroutines.*
import kotlinx.serialization.json.Json
import kotlin.test.Test
import kotlin.test.assertTrue


class TestSsh : CoroutineScope by GlobalScope {

    @Test
    fun helloWorld() = runBlockingCommon {
        val config = Json.decodeFromString(TestSshConfig.serializer(), File("/home/jp/.affair/TestSshConfig.json").readText())
        println("helloWorld START $config")

        val client = Ssh(
            host = SshHostImpl(hostname = config.hostname),
            identity = SshIdentity.Password(username = config.username, password = config.password),
            options = SshOptionsImpl(),
        )
        println(client)
        client.exec("echo 'hello world'").apply {
            println("exec returned $out")
            assertTrue(out.trim() == "hello world")
        }
        println("helloWorld END")
    }
}
