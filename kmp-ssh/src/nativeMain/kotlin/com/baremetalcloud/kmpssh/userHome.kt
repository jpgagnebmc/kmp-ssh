package com.baremetalcloud.kmpssh

import kotlinx.cinterop.toKString
import platform.posix.getenv

actual val Env.userHome: String
    get() = getenv("HOME")!!.toKString()