package baremetalcloud.kmpssh

import com.jcraft.jsch.ChannelExec
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.*
import java.nio.charset.Charset

class SSHExec(cmd: String, out: ExecResult.() -> Unit, err: ExecResult.() -> Unit, val sshSession: SshSession) : Closeable {
    private val channel: ChannelExec = sshSession.jschsession().openChannel("exec") as ChannelExec
    private val stdout: InputStream
    private val stderr: InputStream
    private val stdin: OutputStream

    init {
        channel.setCommand(cmd.toByteArray())
        stdout = channel.inputStream
        stderr = channel.errStream
        stdin = channel.outputStream
        channel.setPty(sshSession.options.execWithPty)
        channel.connect(sshSession.options.connectTimeout.toInt())
    }

    private val stdoutThread = InputStreamThread.Instance(channel, stdout, out, sshSession.options.charset.toCharset())
    private val stderrThread = InputStreamThread.Instance(channel, stderr, err, sshSession.options.charset.toCharset())
    private val timeoutThread = TimeoutManagerThread.Instance(sshSession.options.timeout) {
        stdoutThread.interrupt()
        stderrThread.interrupt()
    }

    /**
     * Writes [line] to stdin.
     */
    fun giveInputLine(line: String) {
        stdin.write(line.toByteArray())
        stdin.write("\n".toByteArray())
        stdin.flush()
    }

    /**
     * Waits for all output to finish.
     */
    fun waitForEnd() {
        stdoutThread.join()
        stderrThread.join()
        if (timeoutThread.interrupted) throw InterruptedException("Timeout reached")
        close()
    }

    suspend fun waitForEndS() {
        withContext(Dispatchers.IO) {
            stdoutThread.join()
            stderrThread.join()
            if (timeoutThread.interrupted) throw InterruptedException("Timeout reached")
            close()
        }

    }

    /**
     * Closes the exec channel and all open streams.
     */
    override fun close() {
        stdin.close()
        stdoutThread.interrupt()
        stderrThread.interrupt()
        channel.disconnect()
        timeoutThread.interrupt()
    }
}

fun String.toCharset(): Charset {
    return Charset.forName(this)
}
