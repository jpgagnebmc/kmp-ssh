package com.baremetalcloud.kmpssh

import com.jcraft.jsch.ChannelExec
import java.io.InputStream
import java.io.InterruptedIOException
import java.nio.Buffer
import java.nio.ByteBuffer
import java.nio.charset.Charset

class InputStreamThread(
    val channel: ChannelExec,
    val input: InputStream,
    val output: ExecResult.() -> Unit,
    val charset: Charset
) : Thread() {
    companion object {
        fun Instance(
            channel: ChannelExec,
            input: InputStream,
            output: ExecResult.() -> Unit,
            charset: Charset
        ): InputStreamThread {
            val newthread = InputStreamThread(channel, input, output, charset)
            newthread.start()
            return newthread
        }
    }

    override fun run() {
        val bufsize = 16 * 1024
        val binput = input.buffered()
        val bytes = ByteArray(bufsize)
        val buffer = ByteBuffer.allocate(bufsize)
        val appender = StringBuilder()
        var eofreached = false

        try {
            do {
                val howmany = binput.read(bytes, 0, bufsize)
                if (howmany == -1) eofreached = true
                if (howmany > 0) {
                    buffer.put(bytes, 0, howmany)
                    (buffer as Buffer).flip()
                    val cbOut = charset.decode(buffer)
                    buffer.compact()
                    appender.append(cbOut.toString())
                    var s = 0
                    var e: Int
                    do {
                        e = appender.indexOf("\n", s)
                        if (e >= 0) {
                            ExecResult.ExecPart(appender.substring(s, e)).output()
                            s = e + 1
                        }
                    } while (e != -1)
                    appender.delete(0, s)
                }
            } while (!eofreached)

            if (appender.isNotEmpty()) {
                ExecResult.ExecPart(appender.toString()).output()
            }
            ExecResult.ExecEnd(channel.exitStatus).output()
        } catch (e: InterruptedIOException) {
            ExecResult.ExecTimeout().output()
        } catch (e: InterruptedException) {
            ExecResult.ExecTimeout().output()
        }
    }
}
