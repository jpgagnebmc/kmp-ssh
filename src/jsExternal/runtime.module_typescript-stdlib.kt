@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")

import kotlin.js.*
import org.w3c.dom.url.*
import tsstdlib.Record

external interface Env {
    fun get(key: String): String?
    fun set(key: String, value: String)
    fun delete(key: String)
    fun toObject(): Record<String, String>
}

external interface InspectOptions {
    var colors: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var compact: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var depth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var showProxy: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var sorted: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var getters: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$77` {
    var os: String
}

external interface Runtime {
    var build: `T$77`
    var customInspect: Any
    var env: Env
    var noColor: Boolean
    fun exit(code: Number = definedExternally): Any
    fun inspect(value: Any, options: InspectOptions = definedExternally): String
    fun isatty(rid: Number): Boolean
    fun readTextFileSync(path: String): String
    fun readTextFileSync(path: URL): String
}