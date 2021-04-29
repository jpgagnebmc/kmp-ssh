package baremetalcloud.kmpssh

sealed class ExecResult {
    class ExecPart(val content: String) : ExecResult()
    class ExecEnd(val rc: Int) : ExecResult()
    class ExecTimeout : ExecResult()
}

