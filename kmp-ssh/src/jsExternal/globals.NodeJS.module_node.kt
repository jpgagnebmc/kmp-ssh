@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package NodeJS

import kotlin.js.*
import org.khronos.webgl.*
import tsstdlib.MapConstructor
import tsstdlib.SetConstructor
import tsstdlib.WeakMapConstructor
import tsstdlib.WeakSetConstructor
import NodeModule
import tsstdlib.ReadonlySet

external interface InspectOptions {
    var getters: dynamic /* "get" | "set" | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var showHidden: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var depth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var colors: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var customInspect: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var showProxy: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var maxArrayLength: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maxStringLength: Number?
        get() = definedExternally
        set(value) = definedExternally
    var breakLength: Number?
        get() = definedExternally
        set(value) = definedExternally
    var compact: dynamic /* Boolean? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var sorted: dynamic /* Boolean? | ((a: String, b: String) -> Number)? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface CallSite {
    fun getThis(): Any
    fun getTypeName(): String?
    fun getFunction(): Function<*>?
    fun getFunctionName(): String?
    fun getMethodName(): String?
    fun getFileName(): String?
    fun getLineNumber(): Number?
    fun getColumnNumber(): Number?
    fun getEvalOrigin(): String?
    fun isToplevel(): Boolean
    fun isEval(): Boolean
    fun isNative(): Boolean
    fun isConstructor(): Boolean
}

typealias ErrnoException = Error

external interface `T$8` {
    var end: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ReadableStream : events.global.NodeJS.EventEmitter {
    var readable: Boolean
    fun read(size: Number = definedExternally): dynamic /* String | Buffer */
    fun setEncoding(encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */): ReadableStream /* this */
    fun pause(): ReadableStream /* this */
    fun resume(): ReadableStream /* this */
    fun isPaused(): Boolean
    fun <T : WritableStream> pipe(destination: T, options: `T$8` = definedExternally): T
    fun unpipe(destination: WritableStream = definedExternally): ReadableStream /* this */
    fun unshift(chunk: String, encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally)
    fun unshift(chunk: String)
    fun unshift(chunk: Uint8Array, encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally)
    fun unshift(chunk: Uint8Array)
    fun wrap(oldStream: ReadableStream): ReadableStream /* this */
}

external interface WritableStream : events.global.NodeJS.EventEmitter {
    var writable: Boolean
    fun write(buffer: Uint8Array, cb: (err: Error?) -> Unit = definedExternally): Boolean
    fun write(buffer: Uint8Array): Boolean
    fun write(buffer: String, cb: (err: Error?) -> Unit = definedExternally): Boolean
    fun write(buffer: String): Boolean
    fun write(str: String, encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally, cb: (err: Error?) -> Unit = definedExternally): Boolean
    fun write(str: String, encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Boolean
    fun end(cb: () -> Unit = definedExternally)
    fun end()
    fun end(data: String, cb: () -> Unit = definedExternally)
    fun end(data: String)
    fun end(data: Uint8Array, cb: () -> Unit = definedExternally)
    fun end(data: Uint8Array)
    fun end(str: String, encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally, cb: () -> Unit = definedExternally)
    fun end(str: String, encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally)
}

external interface ReadWriteStream : ReadableStream, WritableStream

external interface Global {
    var process: process.global.NodeJS.Process
    var console: Any
    var AbortController: Any
    var AbortSignal: Any
    var Array: Any
    var ArrayBuffer: Any
    var Boolean: Any
    var Buffer: Any
    var DataView: Any
    var Date: Any
    var Error: Any
    var EvalError: Any
    var Float32Array: Any
    var Float64Array: Any
    var Function: Any
    var Infinity: Any
    var Int16Array: Any
    var Int32Array: Any
    var Int8Array: Any
    var Intl: Any
    var JSON: Any
    var Map: MapConstructor
    var Math: Any
    var NaN: Any
    var Number: Any
    var Object: Any
    var Promise: Any
    var RangeError: Any
    var ReferenceError: Any
    var RegExp: Any
    var Set: SetConstructor
    var String: Any
    var Symbol: Function<*>
    var SyntaxError: Any
    var TypeError: Any
    var URIError: Any
    var Uint16Array: Any
    var Uint32Array: Any
    var Uint8Array: Any
    var Uint8ClampedArray: Any
    var WeakMap: WeakMapConstructor
    var WeakSet: WeakSetConstructor
    var clearImmediate: (immediateId: Immediate) -> Unit
    var clearInterval: (intervalId: Timeout) -> Unit
    var clearTimeout: (timeoutId: Timeout) -> Unit
    var decodeURI: Any
    var decodeURIComponent: Any
    var encodeURI: Any
    var encodeURIComponent: Any
    var escape: (str: String) -> String
    var eval: Any
    var global: Global
    var isFinite: Any
    var isNaN: Any
    var parseFloat: Any
    var parseInt: Any
    var setImmediate: (callback: (args: Any) -> Unit, args: Any) -> Immediate
    var setInterval: (callback: (args: Any) -> Unit, ms: Number, args: Any) -> Timeout
    var setTimeout: (callback: (args: Any) -> Unit, ms: Number, args: Any) -> Timeout
    var queueMicrotask: Any
    var undefined: Any
    var unescape: (str: String) -> String
    var gc: () -> Unit
    var v8debug: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface RefCounted {
    fun ref(): RefCounted /* this */
    fun unref(): RefCounted /* this */
}

external interface Timer : RefCounted {
    fun hasRef(): Boolean
    fun refresh(): Timer /* this */
}

external interface Immediate : RefCounted {
    fun hasRef(): Boolean
    var _onImmediate: Function<*>
}

external interface Timeout : Timer {
    override fun hasRef(): Boolean
    override fun refresh(): Timeout /* this */
}

external interface Require {
    @nativeInvoke
    operator fun invoke(id: String): Any
    var resolve: RequireResolve
    var cache: Dict<NodeModule>
    var extensions: RequireExtensions
    var main: Module?
}

external interface `T$9` {
    var paths: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface RequireResolve {
    @nativeInvoke
    operator fun invoke(id: String, options: `T$9` = definedExternally): String
    fun paths(request: String): Array<String>?
}

external interface RequireExtensions : Dict<(m: Module, filename: String) -> Any> {
    @nativeGetter
    override operator fun get(key: String): ((m: Module, filename: String) -> Any)?
    @nativeSetter
    operator fun set(key: String, value: (m: Module, filename: String) -> Any)
}

external interface Module {
    var exports: Any
    var require: Require
    var id: String
    var filename: String
    var loaded: Boolean
    var parent: Module?
    var children: Array<Module>
    var path: String
    var paths: Array<String>
}

external interface Dict<T> {
    @nativeGetter
    operator fun get(key: String): T?
    @nativeSetter
    operator fun set(key: String, value: T?)
}

external interface ReadOnlyDict<T> {
    @nativeGetter
    operator fun get(key: String): T?
    @nativeSetter
    operator fun set(key: String, value: T?)
}

external interface ConsoleConstructorOptions {
    var stdout: WritableStream
    var stderr: WritableStream?
        get() = definedExternally
        set(value) = definedExternally
    var ignoreErrors: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var colorMode: dynamic /* Boolean? | "auto" */
        get() = definedExternally
        set(value) = definedExternally
    var inspectOptions: InspectOptions?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ConsoleConstructor {
    var prototype: Console
}

external interface Domain : events.global.NodeJS.EventEmitter {
    fun <T> run(fn: (args: Any) -> T, vararg args: Any): T
    fun add(emitter: events.global.NodeJS.EventEmitter)
    fun add(emitter: Timer)
    fun remove(emitter: events.global.NodeJS.EventEmitter)
    fun remove(emitter: Timer)
    fun <T : Function<*>> bind(cb: T): T
    fun <T : Function<*>> intercept(cb: T): T
}

external interface EventEmitter {
    fun addListener(event: String, listener: (args: Any) -> Unit): events.global.NodeJS.EventEmitter /* this */
    fun addListener(event: Any, listener: (args: Any) -> Unit): events.global.NodeJS.EventEmitter /* this */
    fun on(event: String, listener: (args: Any) -> Unit): events.global.NodeJS.EventEmitter /* this */
    fun on(event: Any, listener: (args: Any) -> Unit): events.global.NodeJS.EventEmitter /* this */
    fun once(event: String, listener: (args: Any) -> Unit): events.global.NodeJS.EventEmitter /* this */
    fun once(event: Any, listener: (args: Any) -> Unit): events.global.NodeJS.EventEmitter /* this */
    fun removeListener(event: String, listener: (args: Any) -> Unit): events.global.NodeJS.EventEmitter /* this */
    fun removeListener(event: Any, listener: (args: Any) -> Unit): events.global.NodeJS.EventEmitter /* this */
    fun off(event: String, listener: (args: Any) -> Unit): events.global.NodeJS.EventEmitter /* this */
    fun off(event: Any, listener: (args: Any) -> Unit): events.global.NodeJS.EventEmitter /* this */
    fun removeAllListeners(event: String = definedExternally): events.global.NodeJS.EventEmitter /* this */
    fun removeAllListeners(): events.global.NodeJS.EventEmitter /* this */
    fun removeAllListeners(event: Any = definedExternally): events.global.NodeJS.EventEmitter /* this */
    fun setMaxListeners(n: Number): events.global.NodeJS.EventEmitter /* this */
    fun getMaxListeners(): Number
    fun listeners(event: String): Array<Function<*>>
    fun listeners(event: Any): Array<Function<*>>
    fun rawListeners(event: String): Array<Function<*>>
    fun rawListeners(event: Any): Array<Function<*>>
    fun emit(event: String, vararg args: Any): Boolean
    fun emit(event: Any, vararg args: Any): Boolean
    fun listenerCount(event: String): Number
    fun listenerCount(event: Any): Number
    fun prependListener(event: String, listener: (args: Any) -> Unit): events.global.NodeJS.EventEmitter /* this */
    fun prependListener(event: Any, listener: (args: Any) -> Unit): events.global.NodeJS.EventEmitter /* this */
    fun prependOnceListener(event: String, listener: (args: Any) -> Unit): events.global.NodeJS.EventEmitter /* this */
    fun prependOnceListener(event: Any, listener: (args: Any) -> Unit): events.global.NodeJS.EventEmitter /* this */
    fun eventNames(): Array<dynamic /* String | Any */>
}

external interface ReadStream : tty.ReadStream

external interface WriteStream : tty.WriteStream

external interface MemoryUsage {
    var rss: Number
    var heapTotal: Number
    var heapUsed: Number
    var external: Number
    var arrayBuffers: Number
}

external interface CpuUsage {
    var user: Number
    var system: Number
}

external interface ProcessRelease {
    var name: String
    var sourceUrl: String?
        get() = definedExternally
        set(value) = definedExternally
    var headersUrl: String?
        get() = definedExternally
        set(value) = definedExternally
    var libUrl: String?
        get() = definedExternally
        set(value) = definedExternally
    var lts: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ProcessVersions : Dict<String> {
    var http_parser: String
    var node: String
    var v8: String
    var ares: String
    var uv: String
    var zlib: String
    var modules: String
    var openssl: String
}

typealias BeforeExitListener = (code: Number) -> Unit

typealias DisconnectListener = () -> Unit

typealias ExitListener = (code: Number) -> Unit

typealias RejectionHandledListener = (promise: Promise<Any>) -> Unit

typealias UncaughtExceptionListener = (error: Error) -> Unit

typealias UnhandledRejectionListener = (reason: Any?, promise: Promise<Any>) -> Unit

typealias WarningListener = (warning: Error) -> Unit

typealias MessageListener = (message: Any, sendHandle: Any) -> Unit

typealias SignalsListener = (signal: String /* "SIGABRT" | "SIGALRM" | "SIGBUS" | "SIGCHLD" | "SIGCONT" | "SIGFPE" | "SIGHUP" | "SIGILL" | "SIGINT" | "SIGIO" | "SIGIOT" | "SIGKILL" | "SIGPIPE" | "SIGPOLL" | "SIGPROF" | "SIGPWR" | "SIGQUIT" | "SIGSEGV" | "SIGSTKFLT" | "SIGSTOP" | "SIGSYS" | "SIGTERM" | "SIGTRAP" | "SIGTSTP" | "SIGTTIN" | "SIGTTOU" | "SIGUNUSED" | "SIGURG" | "SIGUSR1" | "SIGUSR2" | "SIGVTALRM" | "SIGWINCH" | "SIGXCPU" | "SIGXFSZ" | "SIGBREAK" | "SIGLOST" | "SIGINFO" */) -> Unit

typealias NewListenerListener = (type: dynamic /* String | Any */, listener: (args: Any) -> Unit) -> Unit

typealias RemoveListenerListener = (type: dynamic /* String | Any */, listener: (args: Any) -> Unit) -> Unit

typealias MultipleResolveListener = (type: String /* "resolve" | "reject" */, promise: Promise<Any>, value: Any) -> Unit

external interface Socket : ReadWriteStream {
    var isTTY: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ProcessEnv : Dict<String>

external interface HRTime {
    @nativeInvoke
    operator fun invoke(time: Any /* JsTuple<Number, Number> */ = definedExternally): dynamic /* JsTuple<Number, Number> */
    fun bigint(): Any
}

external interface ProcessReport {
    var directory: String
    var filename: String
    fun getReport(err: Error = definedExternally): String
    var reportOnFatalError: Boolean
    var reportOnSignal: Boolean
    var reportOnUncaughtException: Boolean
    var signal: String /* "SIGABRT" | "SIGALRM" | "SIGBUS" | "SIGCHLD" | "SIGCONT" | "SIGFPE" | "SIGHUP" | "SIGILL" | "SIGINT" | "SIGIO" | "SIGIOT" | "SIGKILL" | "SIGPIPE" | "SIGPOLL" | "SIGPROF" | "SIGPWR" | "SIGQUIT" | "SIGSEGV" | "SIGSTKFLT" | "SIGSTOP" | "SIGSYS" | "SIGTERM" | "SIGTRAP" | "SIGTSTP" | "SIGTTIN" | "SIGTTOU" | "SIGUNUSED" | "SIGURG" | "SIGUSR1" | "SIGUSR2" | "SIGVTALRM" | "SIGWINCH" | "SIGXCPU" | "SIGXFSZ" | "SIGBREAK" | "SIGLOST" | "SIGINFO" */
    fun writeReport(fileName: String = definedExternally): String
    fun writeReport(): String
    fun writeReport(error: Error = definedExternally): String
    fun writeReport(fileName: String = definedExternally, err: Error = definedExternally): String
}

external interface ResourceUsage {
    var fsRead: Number
    var fsWrite: Number
    var involuntaryContextSwitches: Number
    var ipcReceived: Number
    var ipcSent: Number
    var majorPageFault: Number
    var maxRSS: Number
    var minorPageFault: Number
    var sharedMemorySize: Number
    var signalsCount: Number
    var swappedOut: Number
    var systemCPUTime: Number
    var unsharedDataSize: Number
    var unsharedStackSize: Number
    var userCPUTime: Number
    var voluntaryContextSwitches: Number
}

external interface EmitWarningOptions {
    var type: String?
        get() = definedExternally
        set(value) = definedExternally
    var code: String?
        get() = definedExternally
        set(value) = definedExternally
    var ctor: Function<*>?
        get() = definedExternally
        set(value) = definedExternally
    var detail: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$10` {
    var fd: Number /* 1 */
}

external interface `T$11` {
    var fd: Number /* 2 */
}

external interface `T$12` {
    var fd: Number /* 0 */
}

external interface `T$13` {
    var cflags: Array<Any>
    var default_configuration: String
    var defines: Array<String>
    var include_dirs: Array<String>
    var libraries: Array<String>
}

external interface `T$14` {
    var clang: Number
    var host_arch: String
    var node_install_npm: Boolean
    var node_install_waf: Boolean
    var node_prefix: String
    var node_shared_openssl: Boolean
    var node_shared_v8: Boolean
    var node_shared_zlib: Boolean
    var node_use_dtrace: Boolean
    var node_use_etw: Boolean
    var node_use_openssl: Boolean
    var target_arch: String
    var v8_no_strict_aliasing: Number
    var v8_use_snapshot: Boolean
    var visibility: String
}

external interface `T$15` {
    var target_defaults: process.global.NodeJS.`T$13`
    var variables: process.global.NodeJS.`T$14`
}

external interface `T$16` {
    var inspector: Boolean
    var debug: Boolean
    var uv: Boolean
    var ipv6: Boolean
    var tls_alpn: Boolean
    var tls_sni: Boolean
    var tls_ocsp: Boolean
    var tls: Boolean
}

external interface `T$17` {
    var swallowErrors: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Process : events.global.NodeJS.EventEmitter {
    var stdout: process.global.NodeJS.WriteStream /* WriteStream & `T$10` */
    var stderr: process.global.NodeJS.WriteStream /* WriteStream & `T$11` */
    var stdin: process.global.NodeJS.ReadStream /* ReadStream & `T$12` */
    fun openStdin(): process.global.NodeJS.Socket
    var argv: Array<String>
    var argv0: String
    var execArgv: Array<String>
    var execPath: String
    fun abort(): Any
    fun chdir(directory: String)
    fun cwd(): String
    var debugPort: Number
    fun emitWarning(warning: String, ctor: Function<*> = definedExternally)
    fun emitWarning(warning: String)
    fun emitWarning(warning: Error, ctor: Function<*> = definedExternally)
    fun emitWarning(warning: Error)
    fun emitWarning(warning: String, type: String = definedExternally, ctor: Function<*> = definedExternally)
    fun emitWarning(warning: String, type: String = definedExternally)
    fun emitWarning(warning: Error, type: String = definedExternally, ctor: Function<*> = definedExternally)
    fun emitWarning(warning: Error, type: String = definedExternally)
    fun emitWarning(warning: String, type: String = definedExternally, code: String = definedExternally, ctor: Function<*> = definedExternally)
    fun emitWarning(warning: String, type: String = definedExternally, code: String = definedExternally)
    fun emitWarning(warning: Error, type: String = definedExternally, code: String = definedExternally, ctor: Function<*> = definedExternally)
    fun emitWarning(warning: Error, type: String = definedExternally, code: String = definedExternally)
    fun emitWarning(warning: String, options: process.global.NodeJS.EmitWarningOptions = definedExternally)
    fun emitWarning(warning: Error, options: process.global.NodeJS.EmitWarningOptions = definedExternally)
    var env: process.global.NodeJS.ProcessEnv
    fun exit(code: Number = definedExternally): Any
    var exitCode: Number?
        get() = definedExternally
        set(value) = definedExternally
    fun getgid(): Number
    fun setgid(id: Number)
    fun setgid(id: String)
    fun getuid(): Number
    fun setuid(id: Number)
    fun setuid(id: String)
    fun geteuid(): Number
    fun seteuid(id: Number)
    fun seteuid(id: String)
    fun getegid(): Number
    fun setegid(id: Number)
    fun setegid(id: String)
    fun getgroups(): Array<Number>
    fun setgroups(groups: Array<Any /* String | Number */>)
    fun setUncaughtExceptionCaptureCallback(cb: ((err: Error) -> Unit)?)
    fun hasUncaughtExceptionCaptureCallback(): Boolean
    var version: String
    var versions: process.global.NodeJS.ProcessVersions
    var config: process.global.NodeJS.`T$15`
    fun kill(pid: Number, signal: String = definedExternally): Boolean
    fun kill(pid: Number): Boolean
    fun kill(pid: Number, signal: Number = definedExternally): Boolean
    var pid: Number
    var ppid: Number
    var title: String
    var arch: String
    var platform: String /* "aix" | "android" | "darwin" | "freebsd" | "linux" | "openbsd" | "sunos" | "win32" | "cygwin" | "netbsd" */
    var mainModule: Module?
        get() = definedExternally
        set(value) = definedExternally
    fun memoryUsage(): process.global.NodeJS.MemoryUsage
    fun cpuUsage(previousValue: process.global.NodeJS.CpuUsage = definedExternally): process.global.NodeJS.CpuUsage
    fun nextTick(callback: Function<*>, vararg args: Any)
    var release: process.global.NodeJS.ProcessRelease
    var features: process.global.NodeJS.`T$16`
    fun umask(): Number
    fun umask(mask: String): Number
    fun umask(mask: Number): Number
    fun uptime(): Number
    var hrtime: process.global.NodeJS.HRTime
    var domain: domain.global.NodeJS.Domain
    val send: ((message: Any, sendHandle: Any, options: process.global.NodeJS.`T$17`, callback: (error: Error?) -> Unit) -> Boolean)?
    fun disconnect()
    var connected: Boolean
    var allowedNodeEnvironmentFlags: ReadonlySet<String>
    var report: process.global.NodeJS.ProcessReport?
        get() = definedExternally
        set(value) = definedExternally
    fun resourceUsage(): process.global.NodeJS.ResourceUsage
    var traceDeprecation: Boolean
    fun addListener(event: String /* "beforeExit" | "exit" */, listener: process.global.NodeJS.BeforeExitListener): process.global.NodeJS.Process /* this */
    fun addListener(event: String /* "disconnect" */, listener: process.global.NodeJS.DisconnectListener): process.global.NodeJS.Process /* this */
    fun addListener(event: String /* "rejectionHandled" */, listener: process.global.NodeJS.RejectionHandledListener): process.global.NodeJS.Process /* this */
    fun addListener(event: String /* "uncaughtException" | "uncaughtExceptionMonitor" | "warning" */, listener: process.global.NodeJS.UncaughtExceptionListener): process.global.NodeJS.Process /* this */
    fun addListener(event: String /* "unhandledRejection" */, listener: process.global.NodeJS.UnhandledRejectionListener): process.global.NodeJS.Process /* this */
    fun addListener(event: String /* "message" */, listener: process.global.NodeJS.MessageListener): process.global.NodeJS.Process /* this */
    fun addListener(event: String /* "SIGABRT" | "SIGALRM" | "SIGBUS" | "SIGCHLD" | "SIGCONT" | "SIGFPE" | "SIGHUP" | "SIGILL" | "SIGINT" | "SIGIO" | "SIGIOT" | "SIGKILL" | "SIGPIPE" | "SIGPOLL" | "SIGPROF" | "SIGPWR" | "SIGQUIT" | "SIGSEGV" | "SIGSTKFLT" | "SIGSTOP" | "SIGSYS" | "SIGTERM" | "SIGTRAP" | "SIGTSTP" | "SIGTTIN" | "SIGTTOU" | "SIGUNUSED" | "SIGURG" | "SIGUSR1" | "SIGUSR2" | "SIGVTALRM" | "SIGWINCH" | "SIGXCPU" | "SIGXFSZ" | "SIGBREAK" | "SIGLOST" | "SIGINFO" */, listener: process.global.NodeJS.SignalsListener): process.global.NodeJS.Process /* this */
    fun addListener(event: String /* "newListener" | "removeListener" */, listener: process.global.NodeJS.NewListenerListener): process.global.NodeJS.Process /* this */
    fun addListener(event: String /* "multipleResolves" */, listener: process.global.NodeJS.MultipleResolveListener): process.global.NodeJS.Process /* this */
    fun emit(event: String /* "beforeExit" | "exit" */, code: Number): Boolean
    override fun emit(event: String, vararg args: Any): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    fun emit(event: String /* "disconnect" */): Boolean
    fun emit(event: String /* "rejectionHandled" */, promise: Promise<Any>): Boolean
    fun emit(event: String /* "uncaughtException" | "uncaughtExceptionMonitor" | "warning" */, error: Error): Boolean
    fun emit(event: String /* "unhandledRejection" */, reason: Any, promise: Promise<Any>): Boolean
    fun emit(event: String /* "message" */, message: Any, sendHandle: Any): process.global.NodeJS.Process /* this */
    fun emit(event: String /* "SIGABRT" | "SIGALRM" | "SIGBUS" | "SIGCHLD" | "SIGCONT" | "SIGFPE" | "SIGHUP" | "SIGILL" | "SIGINT" | "SIGIO" | "SIGIOT" | "SIGKILL" | "SIGPIPE" | "SIGPOLL" | "SIGPROF" | "SIGPWR" | "SIGQUIT" | "SIGSEGV" | "SIGSTKFLT" | "SIGSTOP" | "SIGSYS" | "SIGTERM" | "SIGTRAP" | "SIGTSTP" | "SIGTTIN" | "SIGTTOU" | "SIGUNUSED" | "SIGURG" | "SIGUSR1" | "SIGUSR2" | "SIGVTALRM" | "SIGWINCH" | "SIGXCPU" | "SIGXFSZ" | "SIGBREAK" | "SIGLOST" | "SIGINFO" */, signal: String /* "SIGABRT" | "SIGALRM" | "SIGBUS" | "SIGCHLD" | "SIGCONT" | "SIGFPE" | "SIGHUP" | "SIGILL" | "SIGINT" | "SIGIO" | "SIGIOT" | "SIGKILL" | "SIGPIPE" | "SIGPOLL" | "SIGPROF" | "SIGPWR" | "SIGQUIT" | "SIGSEGV" | "SIGSTKFLT" | "SIGSTOP" | "SIGSYS" | "SIGTERM" | "SIGTRAP" | "SIGTSTP" | "SIGTTIN" | "SIGTTOU" | "SIGUNUSED" | "SIGURG" | "SIGUSR1" | "SIGUSR2" | "SIGVTALRM" | "SIGWINCH" | "SIGXCPU" | "SIGXFSZ" | "SIGBREAK" | "SIGLOST" | "SIGINFO" */): Boolean
    fun emit(event: String /* "newListener" | "removeListener" */, eventName: String, listener: (args: Any) -> Unit): process.global.NodeJS.Process /* this */
    fun emit(event: String /* "newListener" */, eventName: Any, listener: (args: Any) -> Unit): process.global.NodeJS.Process /* this */
    fun emit(event: String /* "multipleResolves" */, listener: process.global.NodeJS.MultipleResolveListener): process.global.NodeJS.Process /* this */
    fun on(event: String /* "beforeExit" | "exit" */, listener: process.global.NodeJS.BeforeExitListener): process.global.NodeJS.Process /* this */
    fun on(event: String /* "disconnect" */, listener: process.global.NodeJS.DisconnectListener): process.global.NodeJS.Process /* this */
    fun on(event: String /* "rejectionHandled" */, listener: process.global.NodeJS.RejectionHandledListener): process.global.NodeJS.Process /* this */
    fun on(event: String /* "uncaughtException" | "uncaughtExceptionMonitor" | "warning" */, listener: process.global.NodeJS.UncaughtExceptionListener): process.global.NodeJS.Process /* this */
    fun on(event: String /* "unhandledRejection" */, listener: process.global.NodeJS.UnhandledRejectionListener): process.global.NodeJS.Process /* this */
    fun on(event: String /* "message" */, listener: process.global.NodeJS.MessageListener): process.global.NodeJS.Process /* this */
    fun on(event: String /* "SIGABRT" | "SIGALRM" | "SIGBUS" | "SIGCHLD" | "SIGCONT" | "SIGFPE" | "SIGHUP" | "SIGILL" | "SIGINT" | "SIGIO" | "SIGIOT" | "SIGKILL" | "SIGPIPE" | "SIGPOLL" | "SIGPROF" | "SIGPWR" | "SIGQUIT" | "SIGSEGV" | "SIGSTKFLT" | "SIGSTOP" | "SIGSYS" | "SIGTERM" | "SIGTRAP" | "SIGTSTP" | "SIGTTIN" | "SIGTTOU" | "SIGUNUSED" | "SIGURG" | "SIGUSR1" | "SIGUSR2" | "SIGVTALRM" | "SIGWINCH" | "SIGXCPU" | "SIGXFSZ" | "SIGBREAK" | "SIGLOST" | "SIGINFO" */, listener: process.global.NodeJS.SignalsListener): process.global.NodeJS.Process /* this */
    fun on(event: String /* "newListener" | "removeListener" */, listener: process.global.NodeJS.NewListenerListener): process.global.NodeJS.Process /* this */
    fun on(event: String /* "multipleResolves" */, listener: process.global.NodeJS.MultipleResolveListener): process.global.NodeJS.Process /* this */
    override fun on(event: String, listener: (args: Any) -> Unit): process.global.NodeJS.Process /* this */
    override fun on(event: Any, listener: (args: Any) -> Unit): process.global.NodeJS.Process /* this */
    fun once(event: String /* "beforeExit" | "exit" */, listener: process.global.NodeJS.BeforeExitListener): process.global.NodeJS.Process /* this */
    fun once(event: String /* "disconnect" */, listener: process.global.NodeJS.DisconnectListener): process.global.NodeJS.Process /* this */
    fun once(event: String /* "rejectionHandled" */, listener: process.global.NodeJS.RejectionHandledListener): process.global.NodeJS.Process /* this */
    fun once(event: String /* "uncaughtException" | "uncaughtExceptionMonitor" | "warning" */, listener: process.global.NodeJS.UncaughtExceptionListener): process.global.NodeJS.Process /* this */
    fun once(event: String /* "unhandledRejection" */, listener: process.global.NodeJS.UnhandledRejectionListener): process.global.NodeJS.Process /* this */
    fun once(event: String /* "message" */, listener: process.global.NodeJS.MessageListener): process.global.NodeJS.Process /* this */
    fun once(event: String /* "SIGABRT" | "SIGALRM" | "SIGBUS" | "SIGCHLD" | "SIGCONT" | "SIGFPE" | "SIGHUP" | "SIGILL" | "SIGINT" | "SIGIO" | "SIGIOT" | "SIGKILL" | "SIGPIPE" | "SIGPOLL" | "SIGPROF" | "SIGPWR" | "SIGQUIT" | "SIGSEGV" | "SIGSTKFLT" | "SIGSTOP" | "SIGSYS" | "SIGTERM" | "SIGTRAP" | "SIGTSTP" | "SIGTTIN" | "SIGTTOU" | "SIGUNUSED" | "SIGURG" | "SIGUSR1" | "SIGUSR2" | "SIGVTALRM" | "SIGWINCH" | "SIGXCPU" | "SIGXFSZ" | "SIGBREAK" | "SIGLOST" | "SIGINFO" */, listener: process.global.NodeJS.SignalsListener): process.global.NodeJS.Process /* this */
    fun once(event: String /* "newListener" | "removeListener" */, listener: process.global.NodeJS.NewListenerListener): process.global.NodeJS.Process /* this */
    fun once(event: String /* "multipleResolves" */, listener: process.global.NodeJS.MultipleResolveListener): process.global.NodeJS.Process /* this */
    fun prependListener(event: String /* "beforeExit" | "exit" */, listener: process.global.NodeJS.BeforeExitListener): process.global.NodeJS.Process /* this */
    fun prependListener(event: String /* "disconnect" */, listener: process.global.NodeJS.DisconnectListener): process.global.NodeJS.Process /* this */
    fun prependListener(event: String /* "rejectionHandled" */, listener: process.global.NodeJS.RejectionHandledListener): process.global.NodeJS.Process /* this */
    fun prependListener(event: String /* "uncaughtException" | "uncaughtExceptionMonitor" | "warning" */, listener: process.global.NodeJS.UncaughtExceptionListener): process.global.NodeJS.Process /* this */
    fun prependListener(event: String /* "unhandledRejection" */, listener: process.global.NodeJS.UnhandledRejectionListener): process.global.NodeJS.Process /* this */
    fun prependListener(event: String /* "message" */, listener: process.global.NodeJS.MessageListener): process.global.NodeJS.Process /* this */
    fun prependListener(event: String /* "SIGABRT" | "SIGALRM" | "SIGBUS" | "SIGCHLD" | "SIGCONT" | "SIGFPE" | "SIGHUP" | "SIGILL" | "SIGINT" | "SIGIO" | "SIGIOT" | "SIGKILL" | "SIGPIPE" | "SIGPOLL" | "SIGPROF" | "SIGPWR" | "SIGQUIT" | "SIGSEGV" | "SIGSTKFLT" | "SIGSTOP" | "SIGSYS" | "SIGTERM" | "SIGTRAP" | "SIGTSTP" | "SIGTTIN" | "SIGTTOU" | "SIGUNUSED" | "SIGURG" | "SIGUSR1" | "SIGUSR2" | "SIGVTALRM" | "SIGWINCH" | "SIGXCPU" | "SIGXFSZ" | "SIGBREAK" | "SIGLOST" | "SIGINFO" */, listener: process.global.NodeJS.SignalsListener): process.global.NodeJS.Process /* this */
    fun prependListener(event: String /* "newListener" | "removeListener" */, listener: process.global.NodeJS.NewListenerListener): process.global.NodeJS.Process /* this */
    fun prependListener(event: String /* "multipleResolves" */, listener: process.global.NodeJS.MultipleResolveListener): process.global.NodeJS.Process /* this */
    fun prependOnceListener(event: String /* "beforeExit" | "exit" */, listener: process.global.NodeJS.BeforeExitListener): process.global.NodeJS.Process /* this */
    fun prependOnceListener(event: String /* "disconnect" */, listener: process.global.NodeJS.DisconnectListener): process.global.NodeJS.Process /* this */
    fun prependOnceListener(event: String /* "rejectionHandled" */, listener: process.global.NodeJS.RejectionHandledListener): process.global.NodeJS.Process /* this */
    fun prependOnceListener(event: String /* "uncaughtException" | "uncaughtExceptionMonitor" | "warning" */, listener: process.global.NodeJS.UncaughtExceptionListener): process.global.NodeJS.Process /* this */
    fun prependOnceListener(event: String /* "unhandledRejection" */, listener: process.global.NodeJS.UnhandledRejectionListener): process.global.NodeJS.Process /* this */
    fun prependOnceListener(event: String /* "message" */, listener: process.global.NodeJS.MessageListener): process.global.NodeJS.Process /* this */
    fun prependOnceListener(event: String /* "SIGABRT" | "SIGALRM" | "SIGBUS" | "SIGCHLD" | "SIGCONT" | "SIGFPE" | "SIGHUP" | "SIGILL" | "SIGINT" | "SIGIO" | "SIGIOT" | "SIGKILL" | "SIGPIPE" | "SIGPOLL" | "SIGPROF" | "SIGPWR" | "SIGQUIT" | "SIGSEGV" | "SIGSTKFLT" | "SIGSTOP" | "SIGSYS" | "SIGTERM" | "SIGTRAP" | "SIGTSTP" | "SIGTTIN" | "SIGTTOU" | "SIGUNUSED" | "SIGURG" | "SIGUSR1" | "SIGUSR2" | "SIGVTALRM" | "SIGWINCH" | "SIGXCPU" | "SIGXFSZ" | "SIGBREAK" | "SIGLOST" | "SIGINFO" */, listener: process.global.NodeJS.SignalsListener): process.global.NodeJS.Process /* this */
    fun prependOnceListener(event: String /* "newListener" | "removeListener" */, listener: process.global.NodeJS.NewListenerListener): process.global.NodeJS.Process /* this */
    fun prependOnceListener(event: String /* "multipleResolves" */, listener: process.global.NodeJS.MultipleResolveListener): process.global.NodeJS.Process /* this */
    override fun listeners(event: String /* "beforeExit" | "disconnect" | "exit" | "rejectionHandled" | "uncaughtException" | "uncaughtExceptionMonitor" | "unhandledRejection" | "warning" | "message" | "SIGABRT" | "SIGALRM" | "SIGBUS" | "SIGCHLD" | "SIGCONT" | "SIGFPE" | "SIGHUP" | "SIGILL" | "SIGINT" | "SIGIO" | "SIGIOT" | "SIGKILL" | "SIGPIPE" | "SIGPOLL" | "SIGPROF" | "SIGPWR" | "SIGQUIT" | "SIGSEGV" | "SIGSTKFLT" | "SIGSTOP" | "SIGSYS" | "SIGTERM" | "SIGTRAP" | "SIGTSTP" | "SIGTTIN" | "SIGTTOU" | "SIGUNUSED" | "SIGURG" | "SIGUSR1" | "SIGUSR2" | "SIGVTALRM" | "SIGWINCH" | "SIGXCPU" | "SIGXFSZ" | "SIGBREAK" | "SIGLOST" | "SIGINFO" | "newListener" | "removeListener" | "multipleResolves" */): dynamic /* Array */
}