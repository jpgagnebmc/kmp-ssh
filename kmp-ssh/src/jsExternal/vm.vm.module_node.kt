@file:JsModule("vm")
@file:JsNonModule
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package vm

import kotlin.js.*
import NodeJS.Dict
import Buffer

external interface Context : Dict<Any>

external interface BaseOptions {
    var filename: String?
        get() = definedExternally
        set(value) = definedExternally
    var lineOffset: Number?
        get() = definedExternally
        set(value) = definedExternally
    var columnOffset: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ScriptOptions : BaseOptions {
    var displayErrors: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var timeout: Number?
        get() = definedExternally
        set(value) = definedExternally
    var cachedData: Buffer?
        get() = definedExternally
        set(value) = definedExternally
    var produceCachedData: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface RunningScriptOptions : BaseOptions {
    var displayErrors: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var timeout: Number?
        get() = definedExternally
        set(value) = definedExternally
    var breakOnSigint: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var microtaskMode: String? /* "afterEvaluate" */
        get() = definedExternally
        set(value) = definedExternally
}

external interface CompileFunctionOptions : BaseOptions {
    var cachedData: Buffer?
        get() = definedExternally
        set(value) = definedExternally
    var produceCachedData: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var parsingContext: Context?
        get() = definedExternally
        set(value) = definedExternally
    var contextExtensions: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$73` {
    var strings: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var wasm: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CreateContextOptions {
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var origin: String?
        get() = definedExternally
        set(value) = definedExternally
    var codeGeneration: `T$73`?
        get() = definedExternally
        set(value) = definedExternally
    var microtaskMode: String? /* "afterEvaluate" */
        get() = definedExternally
        set(value) = definedExternally
}

external interface MeasureMemoryOptions {
    var mode: String? /* "summary" | "detailed" */
        get() = definedExternally
        set(value) = definedExternally
    var context: Context?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$74` {
    var jsMemoryEstimate: Number
    var jsMemoryRange: dynamic /* JsTuple<Number, Number> */
        get() = definedExternally
        set(value) = definedExternally
}

external interface MemoryMeasurement {
    var total: `T$74`
}

external open class Script(code: String, options: ScriptOptions = definedExternally) {
    open fun runInContext(contextifiedSandbox: Context, options: RunningScriptOptions = definedExternally): Any
    open fun runInNewContext(sandbox: Context = definedExternally, options: RunningScriptOptions = definedExternally): Any
    open fun runInThisContext(options: RunningScriptOptions = definedExternally): Any
    open fun createCachedData(): Buffer
    open var cachedDataRejected: Boolean
}

external fun createContext(sandbox: Context = definedExternally, options: CreateContextOptions = definedExternally): Context

external fun isContext(sandbox: Context): Boolean

external fun runInContext(code: String, contextifiedSandbox: Context, options: RunningScriptOptions = definedExternally): Any

external fun runInContext(code: String, contextifiedSandbox: Context): Any

external fun runInContext(code: String, contextifiedSandbox: Context, options: String = definedExternally): Any

external fun runInNewContext(code: String, sandbox: Context = definedExternally, options: RunningScriptOptions = definedExternally): Any

external fun runInNewContext(code: String): Any

external fun runInNewContext(code: String, sandbox: Context = definedExternally): Any

external fun runInNewContext(code: String, sandbox: Context = definedExternally, options: String = definedExternally): Any

external fun runInThisContext(code: String, options: RunningScriptOptions = definedExternally): Any

external fun runInThisContext(code: String): Any

external fun runInThisContext(code: String, options: String = definedExternally): Any

external fun compileFunction(code: String, params: Array<String> = definedExternally, options: CompileFunctionOptions = definedExternally): Function<*>

external fun measureMemory(options: MeasureMemoryOptions = definedExternally): Promise<MemoryMeasurement>