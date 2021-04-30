package com.baremetalcloud.testserver

import com.baremetalcloud.testserverconfig.TestSshIdentity
import com.baremetalcloud.testserverconfig.allTestServerConfigs
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.apache.sshd.server.SshServer
import org.apache.sshd.server.auth.password.PasswordAuthenticator
import org.apache.sshd.server.command.CommandFactory
import org.apache.sshd.server.keyprovider.SimpleGeneratorHostKeyProvider
import org.apache.sshd.server.shell.*


fun main() {
    allTestServerConfigs.map {
        SshServer.setUpDefaultServer().apply {
            port = it.port
            keyPairProvider = SimpleGeneratorHostKeyProvider()
            passwordAuthenticator = PasswordAuthenticator { username, password, session ->
                it.identities.filterIsInstance<TestSshIdentity.Password>().count { it.username == username && it.password == password } > 0
//                true
            }
            shellFactory = ProcessShellFactory("/bin/sh", "-i", "-l")
            commandFactory = ProcessShellCommandFactory()
//
//            shellFactory = ShellFactory {
//                it
//            }
//            commandFactory = CommandFactory { channel, command ->
//
//                UnknownCommand(command)
//            }
//            setCommandFactory { channel, command ->
//                when(command) {
//                    else -> println("----------- $command $channel")
//                }
//
//            }
//            setShellFactory(ProcessShellFactory("/bin/bash"))
//            shellFactory = ProcessShellFactory("/bin/bash", "-i", "-l")


            start()
            println("sshd.isStarted ${it.port} isStarted")
        }
    }
    runBlocking {
        while (true) {
            delay(1000)
        }
    }

    println("done")
//    exitProcess(0)
}