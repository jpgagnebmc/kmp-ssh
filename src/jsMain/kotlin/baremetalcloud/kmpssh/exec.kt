package baremetalcloud.kmpssh

import dev.affair.ssh.SshCmd

actual suspend fun Ssh.exec(cmd: String): SshResult = SshCmd(host = host, identity = identity, options = options, cmd = cmd).result.await()
