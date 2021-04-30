package com.baremetalcloud.kmpssh

import dev.affair.ssh.SshCmd

actual suspend fun com.baremetalcloud.kmpssh.Ssh.exec(cmd: String): SshResult = SshCmd(host = host, identity = identity, options = options, cmd = cmd).result.await()
