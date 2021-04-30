package com.baremetalcloud.kmpssh
class TimeoutManagerThread(val timeout: Long, val todo: () -> Any) : Thread() {
    var interrupted = false

    companion object {
        fun Instance(timeout: Long, todo: () -> Any): TimeoutManagerThread {
            val newthread = TimeoutManagerThread(timeout, todo)
            newthread.start()
            return newthread
        }
    }

    override fun run() {
        if (timeout > 0) {
            try {
                sleep(timeout)
                interrupted = true
                todo()
            } catch (e: InterruptedException) {
            }
        }
    }
}
