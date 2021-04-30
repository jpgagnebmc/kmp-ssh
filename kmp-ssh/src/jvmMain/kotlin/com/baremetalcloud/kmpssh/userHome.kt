package com.baremetalcloud.kmpssh

actual val Env.userHome: String
    get() = System.getenv().getOrElse("HOME") { throw Exception("environment variable HOME not found") }