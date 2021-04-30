package com.baremetalcloud.kmpssh

external val process: Process

external interface Process {
    val env: dynamic
}


actual val Env.userHome: String
    get() = process.env["HOME"] as String