package com.baremetalcloud.kmpssh

import dev.affair.ssh.SshCmd

actual suspend fun com.baremetalcloud.kmpssh.Ssh.exec(cmd: String): SshResult = SshCmd(host = sshHost, identity = sshIdentity, options = sshOptions, cmd = cmd).result.await()
