package com.baremetalcloud.kmpssh.test


import baremetalcloud.runblockingcommon.runBlockingCommon
import com.baremetalcloud.kmpssh.*
import com.baremetalcloud.testserverconfig.TestSshIdentity
import com.baremetalcloud.testserverconfig.basicAuthSshServer
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.GlobalScope
import kotlin.test.Test
import kotlin.test.assertTrue

class TestSshClient : CoroutineScope by GlobalScope {
    @Test
    fun helloWorld() = runBlockingCommon {
        println("Env.userHome ${Env.userHome}")
        with(basicAuthSshServer) {
            val client = Ssh(
                sshHost = SshHostImpl(hostname = hostname, port = port),
                sshIdentity = identities.first().toSshIdentity(),
                sshOptions = SshOptionsImpl(),
            )
            println(client)
            client.exec("echo 'hello world'").apply {
                println("exec returned $out")
                assertTrue(out.trim() == "hello world")
            }
        }


        println("helloWorld END")
    }
}

private fun TestSshIdentity.toSshIdentity(): SshIdentity  = when(this) {
    is TestSshIdentity.Password -> SshIdentity.Password(username = username, password = password)
    is TestSshIdentity.Key.Root -> SshIdentity.Key.Root(username = username, privateKey = privateKey, passphrase = passphrase)
    is TestSshIdentity.Key.User -> SshIdentity.Key.User(username = username, privateKey = privateKey, passphrase = passphrase)
}
