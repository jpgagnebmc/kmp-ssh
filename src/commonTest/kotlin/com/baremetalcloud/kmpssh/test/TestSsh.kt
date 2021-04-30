package com.baremetalcloud.kmpssh.test


import baremetalcloud.runblockingcommon.runBlockingCommon
import com.baremetalcloud.kmpfile.File
import com.baremetalcloud.kmpfile.readText
import com.baremetalcloud.kmpssh.*

import kotlinx.coroutines.*
import kotlinx.serialization.json.Json
import kotlin.jvm.JvmStatic
import kotlin.test.*

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
