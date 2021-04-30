package com.baremetalcloud.kmpssh

sealed class SshResult {
    abstract val err: String?
    abstract val out: String
    data class Success(override val out: String, override val err: String? = null) : SshResult()
    data class Failure(override val out: String, override val err: String, val exitCode: Int) : SshResult()
}