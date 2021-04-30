@file:JsModule("child_process")
@file:JsNonModule
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package child_process

import kotlin.js.*
import stream.internal.Writable
import stream.internal.Readable
import stream.internal.Pipe
import net.Socket
import net.Server
import process.global.NodeJS.ProcessEnv
import Buffer
import fs.BaseEncodingOptions

external interface ChildProcess : events.EventEmitter {
    var stdin: Writable?
    var stdout: Readable?
    var stderr: Readable?
    var channel: Pipe?
        get() = definedExternally
        set(value) = definedExternally
    var stdio: dynamic /* JsTuple<Writable?, Readable?, Readable?, dynamic, dynamic> */
        get() = definedExternally
        set(value) = definedExternally
    var killed: Boolean
    var pid: Number
    var connected: Boolean
    var exitCode: Number?
    var signalCode: String /* "SIGABRT" | "SIGALRM" | "SIGBUS" | "SIGCHLD" | "SIGCONT" | "SIGFPE" | "SIGHUP" | "SIGILL" | "SIGINT" | "SIGIO" | "SIGIOT" | "SIGKILL" | "SIGPIPE" | "SIGPOLL" | "SIGPROF" | "SIGPWR" | "SIGQUIT" | "SIGSEGV" | "SIGSTKFLT" | "SIGSTOP" | "SIGSYS" | "SIGTERM" | "SIGTRAP" | "SIGTSTP" | "SIGTTIN" | "SIGTTOU" | "SIGUNUSED" | "SIGURG" | "SIGUSR1" | "SIGUSR2" | "SIGVTALRM" | "SIGWINCH" | "SIGXCPU" | "SIGXFSZ" | "SIGBREAK" | "SIGLOST" | "SIGINFO" */
    var spawnargs: Array<String>
    var spawnfile: String
    fun kill(signal: Any /* "SIGABRT" | "SIGALRM" | "SIGBUS" | "SIGCHLD" | "SIGCONT" | "SIGFPE" | "SIGHUP" | "SIGILL" | "SIGINT" | "SIGIO" | "SIGIOT" | "SIGKILL" | "SIGPIPE" | "SIGPOLL" | "SIGPROF" | "SIGPWR" | "SIGQUIT" | "SIGSEGV" | "SIGSTKFLT" | "SIGSTOP" | "SIGSYS" | "SIGTERM" | "SIGTRAP" | "SIGTSTP" | "SIGTTIN" | "SIGTTOU" | "SIGUNUSED" | "SIGURG" | "SIGUSR1" | "SIGUSR2" | "SIGVTALRM" | "SIGWINCH" | "SIGXCPU" | "SIGXFSZ" | "SIGBREAK" | "SIGLOST" | "SIGINFO" | Number */ = definedExternally): Boolean
    fun send(message: String?, callback: (error: Error?) -> Unit = definedExternally): Boolean
    fun send(message: String?): Boolean
    fun send(message: Any?, callback: (error: Error?) -> Unit = definedExternally): Boolean
    fun send(message: Any?): Boolean
    fun send(message: Number?, callback: (error: Error?) -> Unit = definedExternally): Boolean
    fun send(message: Number?): Boolean
    fun send(message: Boolean?, callback: (error: Error?) -> Unit = definedExternally): Boolean
    fun send(message: Boolean?): Boolean
    fun send(message: String?, sendHandle: Socket = definedExternally, callback: (error: Error?) -> Unit = definedExternally): Boolean
    fun send(message: String?, sendHandle: Socket = definedExternally): Boolean
    fun send(message: String?, sendHandle: Server = definedExternally, callback: (error: Error?) -> Unit = definedExternally): Boolean
    fun send(message: String?, sendHandle: Server = definedExternally): Boolean
    fun send(message: Any?, sendHandle: Socket = definedExternally, callback: (error: Error?) -> Unit = definedExternally): Boolean
    fun send(message: Any?, sendHandle: Socket = definedExternally): Boolean
    fun send(message: Any?, sendHandle: Server = definedExternally, callback: (error: Error?) -> Unit = definedExternally): Boolean
    fun send(message: Any?, sendHandle: Server = definedExternally): Boolean
    fun send(message: Number?, sendHandle: Socket = definedExternally, callback: (error: Error?) -> Unit = definedExternally): Boolean
    fun send(message: Number?, sendHandle: Socket = definedExternally): Boolean
    fun send(message: Number?, sendHandle: Server = definedExternally, callback: (error: Error?) -> Unit = definedExternally): Boolean
    fun send(message: Number?, sendHandle: Server = definedExternally): Boolean
    fun send(message: Boolean?, sendHandle: Socket = definedExternally, callback: (error: Error?) -> Unit = definedExternally): Boolean
    fun send(message: Boolean?, sendHandle: Socket = definedExternally): Boolean
    fun send(message: Boolean?, sendHandle: Server = definedExternally, callback: (error: Error?) -> Unit = definedExternally): Boolean
    fun send(message: Boolean?, sendHandle: Server = definedExternally): Boolean
    fun send(message: String?, sendHandle: Socket = definedExternally, options: MessageOptions = definedExternally, callback: (error: Error?) -> Unit = definedExternally): Boolean
    fun send(message: String?, sendHandle: Socket = definedExternally, options: MessageOptions = definedExternally): Boolean
    fun send(message: String?, sendHandle: Server = definedExternally, options: MessageOptions = definedExternally, callback: (error: Error?) -> Unit = definedExternally): Boolean
    fun send(message: String?, sendHandle: Server = definedExternally, options: MessageOptions = definedExternally): Boolean
    fun send(message: Any?, sendHandle: Socket = definedExternally, options: MessageOptions = definedExternally, callback: (error: Error?) -> Unit = definedExternally): Boolean
    fun send(message: Any?, sendHandle: Socket = definedExternally, options: MessageOptions = definedExternally): Boolean
    fun send(message: Any?, sendHandle: Server = definedExternally, options: MessageOptions = definedExternally, callback: (error: Error?) -> Unit = definedExternally): Boolean
    fun send(message: Any?, sendHandle: Server = definedExternally, options: MessageOptions = definedExternally): Boolean
    fun send(message: Number?, sendHandle: Socket = definedExternally, options: MessageOptions = definedExternally, callback: (error: Error?) -> Unit = definedExternally): Boolean
    fun send(message: Number?, sendHandle: Socket = definedExternally, options: MessageOptions = definedExternally): Boolean
    fun send(message: Number?, sendHandle: Server = definedExternally, options: MessageOptions = definedExternally, callback: (error: Error?) -> Unit = definedExternally): Boolean
    fun send(message: Number?, sendHandle: Server = definedExternally, options: MessageOptions = definedExternally): Boolean
    fun send(message: Boolean?, sendHandle: Socket = definedExternally, options: MessageOptions = definedExternally, callback: (error: Error?) -> Unit = definedExternally): Boolean
    fun send(message: Boolean?, sendHandle: Socket = definedExternally, options: MessageOptions = definedExternally): Boolean
    fun send(message: Boolean?, sendHandle: Server = definedExternally, options: MessageOptions = definedExternally, callback: (error: Error?) -> Unit = definedExternally): Boolean
    fun send(message: Boolean?, sendHandle: Server = definedExternally, options: MessageOptions = definedExternally): Boolean
    fun disconnect()
    fun unref()
    fun ref()
    override fun addListener(event: String, listener: (args: Any) -> Unit): ChildProcess /* this */
    fun addListener(event: String /* "close" | "exit" */, listener: (code: Number?, signal: String /* "SIGABRT" | "SIGALRM" | "SIGBUS" | "SIGCHLD" | "SIGCONT" | "SIGFPE" | "SIGHUP" | "SIGILL" | "SIGINT" | "SIGIO" | "SIGIOT" | "SIGKILL" | "SIGPIPE" | "SIGPOLL" | "SIGPROF" | "SIGPWR" | "SIGQUIT" | "SIGSEGV" | "SIGSTKFLT" | "SIGSTOP" | "SIGSYS" | "SIGTERM" | "SIGTRAP" | "SIGTSTP" | "SIGTTIN" | "SIGTTOU" | "SIGUNUSED" | "SIGURG" | "SIGUSR1" | "SIGUSR2" | "SIGVTALRM" | "SIGWINCH" | "SIGXCPU" | "SIGXFSZ" | "SIGBREAK" | "SIGLOST" | "SIGINFO" */) -> Unit): ChildProcess /* this */
    fun addListener(event: String /* "disconnect" */, listener: () -> Unit): ChildProcess /* this */
    fun addListener(event: String /* "error" */, listener: (err: Error) -> Unit): ChildProcess /* this */
    fun addListener(event: String /* "message" */, listener: (message: Any? /* String? | Any? | Number? | Boolean? */, sendHandle: Any /* net.Socket | net.Server */) -> Unit): ChildProcess /* this */
    override fun emit(event: String, vararg args: Any): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    fun emit(event: String /* "close" | "exit" */, code: Number?, signal: String /* "SIGABRT" | "SIGALRM" | "SIGBUS" | "SIGCHLD" | "SIGCONT" | "SIGFPE" | "SIGHUP" | "SIGILL" | "SIGINT" | "SIGIO" | "SIGIOT" | "SIGKILL" | "SIGPIPE" | "SIGPOLL" | "SIGPROF" | "SIGPWR" | "SIGQUIT" | "SIGSEGV" | "SIGSTKFLT" | "SIGSTOP" | "SIGSYS" | "SIGTERM" | "SIGTRAP" | "SIGTSTP" | "SIGTTIN" | "SIGTTOU" | "SIGUNUSED" | "SIGURG" | "SIGUSR1" | "SIGUSR2" | "SIGVTALRM" | "SIGWINCH" | "SIGXCPU" | "SIGXFSZ" | "SIGBREAK" | "SIGLOST" | "SIGINFO" */): Boolean
    fun emit(event: String /* "disconnect" */): Boolean
    fun emit(event: String /* "error" */, err: Error): Boolean
    fun emit(event: String /* "message" */, message: String?, sendHandle: Socket): Boolean
    fun emit(event: String /* "message" */, message: String?, sendHandle: Server): Boolean
    fun emit(event: String /* "message" */, message: Any?, sendHandle: Socket): Boolean
    fun emit(event: String /* "message" */, message: Any?, sendHandle: Server): Boolean
    fun emit(event: String /* "message" */, message: Number?, sendHandle: Socket): Boolean
    fun emit(event: String /* "message" */, message: Number?, sendHandle: Server): Boolean
    fun emit(event: String /* "message" */, message: Boolean?, sendHandle: Socket): Boolean
    fun emit(event: String /* "message" */, message: Boolean?, sendHandle: Server): Boolean
    override fun on(event: String, listener: (args: Any) -> Unit): ChildProcess /* this */
    fun on(event: String /* "close" | "exit" */, listener: (code: Number?, signal: String /* "SIGABRT" | "SIGALRM" | "SIGBUS" | "SIGCHLD" | "SIGCONT" | "SIGFPE" | "SIGHUP" | "SIGILL" | "SIGINT" | "SIGIO" | "SIGIOT" | "SIGKILL" | "SIGPIPE" | "SIGPOLL" | "SIGPROF" | "SIGPWR" | "SIGQUIT" | "SIGSEGV" | "SIGSTKFLT" | "SIGSTOP" | "SIGSYS" | "SIGTERM" | "SIGTRAP" | "SIGTSTP" | "SIGTTIN" | "SIGTTOU" | "SIGUNUSED" | "SIGURG" | "SIGUSR1" | "SIGUSR2" | "SIGVTALRM" | "SIGWINCH" | "SIGXCPU" | "SIGXFSZ" | "SIGBREAK" | "SIGLOST" | "SIGINFO" */) -> Unit): ChildProcess /* this */
    fun on(event: String /* "disconnect" */, listener: () -> Unit): ChildProcess /* this */
    fun on(event: String /* "error" */, listener: (err: Error) -> Unit): ChildProcess /* this */
    fun on(event: String /* "message" */, listener: (message: Any? /* String? | Any? | Number? | Boolean? */, sendHandle: Any /* net.Socket | net.Server */) -> Unit): ChildProcess /* this */
    override fun once(event: String, listener: (args: Any) -> Unit): ChildProcess /* this */
    fun once(event: String /* "close" | "exit" */, listener: (code: Number?, signal: String /* "SIGABRT" | "SIGALRM" | "SIGBUS" | "SIGCHLD" | "SIGCONT" | "SIGFPE" | "SIGHUP" | "SIGILL" | "SIGINT" | "SIGIO" | "SIGIOT" | "SIGKILL" | "SIGPIPE" | "SIGPOLL" | "SIGPROF" | "SIGPWR" | "SIGQUIT" | "SIGSEGV" | "SIGSTKFLT" | "SIGSTOP" | "SIGSYS" | "SIGTERM" | "SIGTRAP" | "SIGTSTP" | "SIGTTIN" | "SIGTTOU" | "SIGUNUSED" | "SIGURG" | "SIGUSR1" | "SIGUSR2" | "SIGVTALRM" | "SIGWINCH" | "SIGXCPU" | "SIGXFSZ" | "SIGBREAK" | "SIGLOST" | "SIGINFO" */) -> Unit): ChildProcess /* this */
    fun once(event: String /* "disconnect" */, listener: () -> Unit): ChildProcess /* this */
    fun once(event: String /* "error" */, listener: (err: Error) -> Unit): ChildProcess /* this */
    fun once(event: String /* "message" */, listener: (message: Any? /* String? | Any? | Number? | Boolean? */, sendHandle: Any /* net.Socket | net.Server */) -> Unit): ChildProcess /* this */
    override fun prependListener(event: String, listener: (args: Any) -> Unit): ChildProcess /* this */
    fun prependListener(event: String /* "close" | "exit" */, listener: (code: Number?, signal: String /* "SIGABRT" | "SIGALRM" | "SIGBUS" | "SIGCHLD" | "SIGCONT" | "SIGFPE" | "SIGHUP" | "SIGILL" | "SIGINT" | "SIGIO" | "SIGIOT" | "SIGKILL" | "SIGPIPE" | "SIGPOLL" | "SIGPROF" | "SIGPWR" | "SIGQUIT" | "SIGSEGV" | "SIGSTKFLT" | "SIGSTOP" | "SIGSYS" | "SIGTERM" | "SIGTRAP" | "SIGTSTP" | "SIGTTIN" | "SIGTTOU" | "SIGUNUSED" | "SIGURG" | "SIGUSR1" | "SIGUSR2" | "SIGVTALRM" | "SIGWINCH" | "SIGXCPU" | "SIGXFSZ" | "SIGBREAK" | "SIGLOST" | "SIGINFO" */) -> Unit): ChildProcess /* this */
    fun prependListener(event: String /* "disconnect" */, listener: () -> Unit): ChildProcess /* this */
    fun prependListener(event: String /* "error" */, listener: (err: Error) -> Unit): ChildProcess /* this */
    fun prependListener(event: String /* "message" */, listener: (message: Any? /* String? | Any? | Number? | Boolean? */, sendHandle: Any /* net.Socket | net.Server */) -> Unit): ChildProcess /* this */
    override fun prependOnceListener(event: String, listener: (args: Any) -> Unit): ChildProcess /* this */
    fun prependOnceListener(event: String /* "close" | "exit" */, listener: (code: Number?, signal: String /* "SIGABRT" | "SIGALRM" | "SIGBUS" | "SIGCHLD" | "SIGCONT" | "SIGFPE" | "SIGHUP" | "SIGILL" | "SIGINT" | "SIGIO" | "SIGIOT" | "SIGKILL" | "SIGPIPE" | "SIGPOLL" | "SIGPROF" | "SIGPWR" | "SIGQUIT" | "SIGSEGV" | "SIGSTKFLT" | "SIGSTOP" | "SIGSYS" | "SIGTERM" | "SIGTRAP" | "SIGTSTP" | "SIGTTIN" | "SIGTTOU" | "SIGUNUSED" | "SIGURG" | "SIGUSR1" | "SIGUSR2" | "SIGVTALRM" | "SIGWINCH" | "SIGXCPU" | "SIGXFSZ" | "SIGBREAK" | "SIGLOST" | "SIGINFO" */) -> Unit): ChildProcess /* this */
    fun prependOnceListener(event: String /* "disconnect" */, listener: () -> Unit): ChildProcess /* this */
    fun prependOnceListener(event: String /* "error" */, listener: (err: Error) -> Unit): ChildProcess /* this */
    fun prependOnceListener(event: String /* "message" */, listener: (message: Any? /* String? | Any? | Number? | Boolean? */, sendHandle: Any /* net.Socket | net.Server */) -> Unit): ChildProcess /* this */
}

external interface ChildProcessWithoutNullStreams : ChildProcess {
    override var stdio: dynamic /* JsTuple<Writable, Readable, Readable, dynamic, dynamic> */
        get() = definedExternally
        set(value) = definedExternally
}

external interface ChildProcessByStdio<I : Writable?, O : Readable?, E : Readable?> : ChildProcess {
    override var stdio: dynamic /* JsTuple<I, O, E, dynamic, dynamic> */
        get() = definedExternally
        set(value) = definedExternally
}

external interface MessageOptions {
    var keepOpen: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface MessagingOptions {
    var serialization: String? /* "json" | "advanced" */
        get() = definedExternally
        set(value) = definedExternally
}

external interface ProcessEnvOptions {
    var uid: Number?
        get() = definedExternally
        set(value) = definedExternally
    var gid: Number?
        get() = definedExternally
        set(value) = definedExternally
    var cwd: String?
        get() = definedExternally
        set(value) = definedExternally
    var env: ProcessEnv?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CommonOptions : ProcessEnvOptions {
    var windowsHide: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var timeout: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CommonSpawnOptions : CommonOptions, MessagingOptions {
    var argv0: String?
        get() = definedExternally
        set(value) = definedExternally
    var stdio: dynamic /* "pipe" | "ignore" | "inherit" | Array<dynamic /* "pipe" | "ipc" | "ignore" | "inherit" | Stream? | Number? */>? */
        get() = definedExternally
        set(value) = definedExternally
    var shell: dynamic /* Boolean? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var windowsVerbatimArguments: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SpawnOptions : CommonSpawnOptions {
    var detached: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SpawnOptionsWithoutStdio : SpawnOptions {
    override var stdio: dynamic /* "pipe" | Array<String /* "pipe" */>? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface SpawnOptionsWithStdioTuple<Stdin, Stdout, Stderr> : SpawnOptions {
    override var stdio: dynamic /* JsTuple<Stdin, Stdout, Stderr> */
        get() = definedExternally
        set(value) = definedExternally
}

external fun spawn(command: String, options: SpawnOptionsWithoutStdio = definedExternally): ChildProcessWithoutNullStreams

external fun spawn(command: String): ChildProcessWithoutNullStreams

external fun spawn(command: String, options: SpawnOptionsWithStdioTuple<String /* "pipe" */, String /* "pipe" */, String /* "pipe" */>): ChildProcessByStdio<Writable, Readable, Readable>

external fun spawn(command: String, options: SpawnOptionsWithStdioTuple<String /* "pipe" */, String /* "pipe" */, Any /* "inherit" | "ignore" | Stream */>): ChildProcessByStdio<Writable, Readable, Nothing?>

external fun spawn(command: String, options: SpawnOptionsWithStdioTuple<String /* "pipe" */, Any /* "inherit" | "ignore" | Stream */, String /* "pipe" */>): ChildProcessByStdio<Writable, Nothing?, Readable>

external fun spawn(command: String, options: SpawnOptionsWithStdioTuple<Any /* "inherit" | "ignore" | Stream */, String /* "pipe" */, String /* "pipe" */>): ChildProcessByStdio<Nothing?, Readable, Readable>

external fun spawn(command: String, options: SpawnOptionsWithStdioTuple<String /* "pipe" */, Any /* "inherit" | "ignore" | Stream */, Any /* "inherit" | "ignore" | Stream */>): ChildProcessByStdio<Writable, Nothing?, Nothing?>

external fun spawn(command: String, options: SpawnOptionsWithStdioTuple<Any /* "inherit" | "ignore" | Stream */, String /* "pipe" */, Any /* "inherit" | "ignore" | Stream */>): ChildProcessByStdio<Nothing?, Readable, Nothing?>

external fun spawn(command: String, options: SpawnOptionsWithStdioTuple<Any /* "inherit" | "ignore" | Stream */, Any /* "inherit" | "ignore" | Stream */, String /* "pipe" */>): ChildProcessByStdio<Nothing?, Nothing?, Readable>

external fun spawn(command: String, options: SpawnOptionsWithStdioTuple<Any /* "inherit" | "ignore" | Stream */, Any /* "inherit" | "ignore" | Stream */, Any /* "inherit" | "ignore" | Stream */>): ChildProcessByStdio<Nothing?, Nothing?, Nothing?>

external fun spawn(command: String, options: SpawnOptions): ChildProcess

external fun spawn(command: String, args: Array<String> = definedExternally, options: SpawnOptionsWithoutStdio = definedExternally): ChildProcessWithoutNullStreams

external fun spawn(command: String, args: Array<String> = definedExternally): ChildProcessWithoutNullStreams

external fun spawn(command: String, args: Array<String>, options: SpawnOptionsWithStdioTuple<String /* "pipe" */, String /* "pipe" */, String /* "pipe" */>): ChildProcessByStdio<Writable, Readable, Readable>

external fun spawn(command: String, args: Array<String>, options: SpawnOptionsWithStdioTuple<String /* "pipe" */, String /* "pipe" */, Any /* "inherit" | "ignore" | Stream */>): ChildProcessByStdio<Writable, Readable, Nothing?>

external fun spawn(command: String, args: Array<String>, options: SpawnOptionsWithStdioTuple<String /* "pipe" */, Any /* "inherit" | "ignore" | Stream */, String /* "pipe" */>): ChildProcessByStdio<Writable, Nothing?, Readable>

external fun spawn(command: String, args: Array<String>, options: SpawnOptionsWithStdioTuple<Any /* "inherit" | "ignore" | Stream */, String /* "pipe" */, String /* "pipe" */>): ChildProcessByStdio<Nothing?, Readable, Readable>

external fun spawn(command: String, args: Array<String>, options: SpawnOptionsWithStdioTuple<String /* "pipe" */, Any /* "inherit" | "ignore" | Stream */, Any /* "inherit" | "ignore" | Stream */>): ChildProcessByStdio<Writable, Nothing?, Nothing?>

external fun spawn(command: String, args: Array<String>, options: SpawnOptionsWithStdioTuple<Any /* "inherit" | "ignore" | Stream */, String /* "pipe" */, Any /* "inherit" | "ignore" | Stream */>): ChildProcessByStdio<Nothing?, Readable, Nothing?>

external fun spawn(command: String, args: Array<String>, options: SpawnOptionsWithStdioTuple<Any /* "inherit" | "ignore" | Stream */, Any /* "inherit" | "ignore" | Stream */, String /* "pipe" */>): ChildProcessByStdio<Nothing?, Nothing?, Readable>

external fun spawn(command: String, args: Array<String>, options: SpawnOptionsWithStdioTuple<Any /* "inherit" | "ignore" | Stream */, Any /* "inherit" | "ignore" | Stream */, Any /* "inherit" | "ignore" | Stream */>): ChildProcessByStdio<Nothing?, Nothing?, Nothing?>

external fun spawn(command: String, args: Array<String>, options: SpawnOptions): ChildProcess

external interface ExecOptions : CommonOptions {
    var shell: String?
        get() = definedExternally
        set(value) = definedExternally
    var maxBuffer: Number?
        get() = definedExternally
        set(value) = definedExternally
    var killSignal: dynamic /* "SIGABRT" | "SIGALRM" | "SIGBUS" | "SIGCHLD" | "SIGCONT" | "SIGFPE" | "SIGHUP" | "SIGILL" | "SIGINT" | "SIGIO" | "SIGIOT" | "SIGKILL" | "SIGPIPE" | "SIGPOLL" | "SIGPROF" | "SIGPWR" | "SIGQUIT" | "SIGSEGV" | "SIGSTKFLT" | "SIGSTOP" | "SIGSYS" | "SIGTERM" | "SIGTRAP" | "SIGTSTP" | "SIGTTIN" | "SIGTTOU" | "SIGUNUSED" | "SIGURG" | "SIGUSR1" | "SIGUSR2" | "SIGVTALRM" | "SIGWINCH" | "SIGXCPU" | "SIGXFSZ" | "SIGBREAK" | "SIGLOST" | "SIGINFO" | Number? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface ExecOptionsWithStringEncoding : ExecOptions {
    var encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */
}

external interface ExecOptionsWithBufferEncoding : ExecOptions {
    var encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */
}

external fun exec(command: String, callback: (error: ExecException?, stdout: String, stderr: String) -> Unit = definedExternally): ChildProcess

external fun exec(command: String): ChildProcess

external interface `T$25` {
    var encoding: String /* "buffer" */
}

external fun exec(command: String, options: `T$25` /* `T$25` & ExecOptions */, callback: (error: ExecException?, stdout: Buffer, stderr: Buffer) -> Unit = definedExternally): ChildProcess

external fun exec(command: String, options: `T$25` /* `T$25` & ExecOptions */): ChildProcess

external interface `T$26` {
    var encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */
}

external fun exec(command: String, options: `T$26` /* `T$26` & ExecOptions */, callback: (error: ExecException?, stdout: String, stderr: String) -> Unit = definedExternally): ChildProcess

external fun exec(command: String, options: `T$26` /* `T$26` & ExecOptions */): ChildProcess

external fun exec(command: String, options: `T$26` /* `T$26` & ExecOptions */, callback: (error: ExecException?, stdout: Any /* String | Buffer */, stderr: Any /* String | Buffer */) -> Unit = definedExternally): ChildProcess

external fun exec(command: String, options: ExecOptions, callback: (error: ExecException?, stdout: String, stderr: String) -> Unit = definedExternally): ChildProcess

external fun exec(command: String, options: ExecOptions): ChildProcess

external fun exec(command: String, options: BaseEncodingOptions /* BaseEncodingOptions & ExecOptions */, callback: (error: ExecException?, stdout: Any /* String | Buffer */, stderr: Any /* String | Buffer */) -> Unit = definedExternally): ChildProcess

external fun exec(command: String, options: BaseEncodingOptions /* BaseEncodingOptions & ExecOptions */): ChildProcess

external interface PromiseWithChild<T> : Promise<T> {
    var child: ChildProcess
}

external interface ExecFileOptions : CommonOptions {
    var maxBuffer: Number?
        get() = definedExternally
        set(value) = definedExternally
    var killSignal: dynamic /* "SIGABRT" | "SIGALRM" | "SIGBUS" | "SIGCHLD" | "SIGCONT" | "SIGFPE" | "SIGHUP" | "SIGILL" | "SIGINT" | "SIGIO" | "SIGIOT" | "SIGKILL" | "SIGPIPE" | "SIGPOLL" | "SIGPROF" | "SIGPWR" | "SIGQUIT" | "SIGSEGV" | "SIGSTKFLT" | "SIGSTOP" | "SIGSYS" | "SIGTERM" | "SIGTRAP" | "SIGTSTP" | "SIGTTIN" | "SIGTTOU" | "SIGUNUSED" | "SIGURG" | "SIGUSR1" | "SIGUSR2" | "SIGVTALRM" | "SIGWINCH" | "SIGXCPU" | "SIGXFSZ" | "SIGBREAK" | "SIGLOST" | "SIGINFO" | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var windowsVerbatimArguments: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var shell: dynamic /* Boolean? | String? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface ExecFileOptionsWithStringEncoding : ExecFileOptions {
    var encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */
}

external interface ExecFileOptionsWithBufferEncoding : ExecFileOptions {
    var encoding: String /* "buffer" */
}

external interface ExecFileOptionsWithOtherEncoding : ExecFileOptions {
    var encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */
}

external fun execFile(file: String): ChildProcess

external fun execFile(file: String, options: BaseEncodingOptions /* BaseEncodingOptions & ExecFileOptions */): ChildProcess

external fun execFile(file: String, args: Array<String>? = definedExternally): ChildProcess

external fun execFile(file: String, args: Array<String>?, options: BaseEncodingOptions /* BaseEncodingOptions & ExecFileOptions */): ChildProcess

external fun execFile(file: String, callback: (error: ExecException /* ExecException & NodeJS.ErrnoException */, stdout: String, stderr: String) -> Unit): ChildProcess

external fun execFile(file: String, args: Array<String>?, callback: (error: ExecException /* ExecException & NodeJS.ErrnoException */, stdout: String, stderr: String) -> Unit): ChildProcess

external fun execFile(file: String, options: ExecFileOptionsWithBufferEncoding, callback: (error: ExecException /* ExecException & NodeJS.ErrnoException */, stdout: Buffer, stderr: Buffer) -> Unit): ChildProcess

external fun execFile(file: String, args: Array<String>?, options: ExecFileOptionsWithBufferEncoding, callback: (error: ExecException /* ExecException & NodeJS.ErrnoException */, stdout: Buffer, stderr: Buffer) -> Unit): ChildProcess

external fun execFile(file: String, options: ExecFileOptionsWithStringEncoding, callback: (error: ExecException /* ExecException & NodeJS.ErrnoException */, stdout: String, stderr: String) -> Unit): ChildProcess

external fun execFile(file: String, args: Array<String>?, options: ExecFileOptionsWithStringEncoding, callback: (error: ExecException /* ExecException & NodeJS.ErrnoException */, stdout: String, stderr: String) -> Unit): ChildProcess

external fun execFile(file: String, options: ExecFileOptionsWithOtherEncoding, callback: (error: ExecException /* ExecException & NodeJS.ErrnoException */, stdout: Any /* String | Buffer */, stderr: Any /* String | Buffer */) -> Unit): ChildProcess

external fun execFile(file: String, args: Array<String>?, options: ExecFileOptionsWithOtherEncoding, callback: (error: ExecException /* ExecException & NodeJS.ErrnoException */, stdout: Any /* String | Buffer */, stderr: Any /* String | Buffer */) -> Unit): ChildProcess

external fun execFile(file: String, options: ExecFileOptions, callback: (error: ExecException /* ExecException & NodeJS.ErrnoException */, stdout: String, stderr: String) -> Unit): ChildProcess

external fun execFile(file: String, args: Array<String>?, options: ExecFileOptions, callback: (error: ExecException /* ExecException & NodeJS.ErrnoException */, stdout: String, stderr: String) -> Unit): ChildProcess

external fun execFile(file: String, options: BaseEncodingOptions /* BaseEncodingOptions & ExecFileOptions */, callback: ((error: ExecException /* ExecException & NodeJS.ErrnoException */, stdout: Any /* String | Buffer */, stderr: Any /* String | Buffer */) -> Unit)?): ChildProcess

external fun execFile(file: String, args: Array<String>?, options: BaseEncodingOptions /* BaseEncodingOptions & ExecFileOptions */, callback: ((error: ExecException /* ExecException & NodeJS.ErrnoException */, stdout: Any /* String | Buffer */, stderr: Any /* String | Buffer */) -> Unit)?): ChildProcess

external interface ForkOptions : ProcessEnvOptions, MessagingOptions {
    var execPath: String?
        get() = definedExternally
        set(value) = definedExternally
    var execArgv: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var silent: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var stdio: dynamic /* "pipe" | "ignore" | "inherit" | Array<dynamic /* "pipe" | "ipc" | "ignore" | "inherit" | Stream? | Number? */>? */
        get() = definedExternally
        set(value) = definedExternally
    var detached: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var windowsVerbatimArguments: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external fun fork(modulePath: String, options: ForkOptions = definedExternally): ChildProcess

external fun fork(modulePath: String): ChildProcess

external fun fork(modulePath: String, args: Array<String> = definedExternally, options: ForkOptions = definedExternally): ChildProcess

external fun fork(modulePath: String, args: Array<String> = definedExternally): ChildProcess

external interface SpawnSyncOptions : CommonSpawnOptions {
    var input: dynamic /* String? | Uint8Array? | Uint8ClampedArray? | Uint16Array? | Uint32Array? | Int8Array? | Int16Array? | Int32Array? | BigUint64Array? | BigInt64Array? | Float32Array? | Float64Array? | DataView? */
        get() = definedExternally
        set(value) = definedExternally
    var killSignal: dynamic /* "SIGABRT" | "SIGALRM" | "SIGBUS" | "SIGCHLD" | "SIGCONT" | "SIGFPE" | "SIGHUP" | "SIGILL" | "SIGINT" | "SIGIO" | "SIGIOT" | "SIGKILL" | "SIGPIPE" | "SIGPOLL" | "SIGPROF" | "SIGPWR" | "SIGQUIT" | "SIGSEGV" | "SIGSTKFLT" | "SIGSTOP" | "SIGSYS" | "SIGTERM" | "SIGTRAP" | "SIGTSTP" | "SIGTTIN" | "SIGTTOU" | "SIGUNUSED" | "SIGURG" | "SIGUSR1" | "SIGUSR2" | "SIGVTALRM" | "SIGWINCH" | "SIGXCPU" | "SIGXFSZ" | "SIGBREAK" | "SIGLOST" | "SIGINFO" | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var maxBuffer: Number?
        get() = definedExternally
        set(value) = definedExternally
    var encoding: String? /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" | "buffer" */
        get() = definedExternally
        set(value) = definedExternally
}

external interface SpawnSyncOptionsWithStringEncoding : SpawnSyncOptions

external interface SpawnSyncOptionsWithBufferEncoding : SpawnSyncOptions {
    override var encoding: String? /* "buffer" */
        get() = definedExternally
        set(value) = definedExternally
}

external interface SpawnSyncReturns<T> {
    var pid: Number
    var output: Array<String>
    var stdout: T
    var stderr: T
    var status: Number?
    var signal: String /* "SIGABRT" | "SIGALRM" | "SIGBUS" | "SIGCHLD" | "SIGCONT" | "SIGFPE" | "SIGHUP" | "SIGILL" | "SIGINT" | "SIGIO" | "SIGIOT" | "SIGKILL" | "SIGPIPE" | "SIGPOLL" | "SIGPROF" | "SIGPWR" | "SIGQUIT" | "SIGSEGV" | "SIGSTKFLT" | "SIGSTOP" | "SIGSYS" | "SIGTERM" | "SIGTRAP" | "SIGTSTP" | "SIGTTIN" | "SIGTTOU" | "SIGUNUSED" | "SIGURG" | "SIGUSR1" | "SIGUSR2" | "SIGVTALRM" | "SIGWINCH" | "SIGXCPU" | "SIGXFSZ" | "SIGBREAK" | "SIGLOST" | "SIGINFO" */
    var error: Error?
        get() = definedExternally
        set(value) = definedExternally
}

external fun spawnSync(command: String): dynamic /* SpawnSyncReturns */

external fun spawnSync(command: String, options: SpawnSyncOptionsWithStringEncoding = definedExternally): SpawnSyncReturns<String>

external fun spawnSync(command: String, options: SpawnSyncOptionsWithBufferEncoding = definedExternally): SpawnSyncReturns<Buffer>

external fun spawnSync(command: String, options: SpawnSyncOptions = definedExternally): SpawnSyncReturns<Buffer>

external fun spawnSync(command: String, args: Array<String> = definedExternally, options: SpawnSyncOptionsWithStringEncoding = definedExternally): SpawnSyncReturns<String>

external fun spawnSync(command: String, args: Array<String> = definedExternally): dynamic /* SpawnSyncReturns */

external fun spawnSync(command: String, args: Array<String> = definedExternally, options: SpawnSyncOptionsWithBufferEncoding = definedExternally): SpawnSyncReturns<Buffer>

external fun spawnSync(command: String, args: Array<String> = definedExternally, options: SpawnSyncOptions = definedExternally): SpawnSyncReturns<Buffer>

external interface ExecSyncOptions : CommonOptions {
    var input: dynamic /* String? | Uint8Array? */
        get() = definedExternally
        set(value) = definedExternally
    var stdio: dynamic /* "pipe" | "ignore" | "inherit" | Array<dynamic /* "pipe" | "ipc" | "ignore" | "inherit" | Stream? | Number? */>? */
        get() = definedExternally
        set(value) = definedExternally
    var shell: String?
        get() = definedExternally
        set(value) = definedExternally
    var killSignal: dynamic /* "SIGABRT" | "SIGALRM" | "SIGBUS" | "SIGCHLD" | "SIGCONT" | "SIGFPE" | "SIGHUP" | "SIGILL" | "SIGINT" | "SIGIO" | "SIGIOT" | "SIGKILL" | "SIGPIPE" | "SIGPOLL" | "SIGPROF" | "SIGPWR" | "SIGQUIT" | "SIGSEGV" | "SIGSTKFLT" | "SIGSTOP" | "SIGSYS" | "SIGTERM" | "SIGTRAP" | "SIGTSTP" | "SIGTTIN" | "SIGTTOU" | "SIGUNUSED" | "SIGURG" | "SIGUSR1" | "SIGUSR2" | "SIGVTALRM" | "SIGWINCH" | "SIGXCPU" | "SIGXFSZ" | "SIGBREAK" | "SIGLOST" | "SIGINFO" | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var maxBuffer: Number?
        get() = definedExternally
        set(value) = definedExternally
    var encoding: String? /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" | "buffer" */
        get() = definedExternally
        set(value) = definedExternally
}

external interface ExecSyncOptionsWithStringEncoding : ExecSyncOptions

external interface ExecSyncOptionsWithBufferEncoding : ExecSyncOptions {
    override var encoding: String? /* "buffer" */
        get() = definedExternally
        set(value) = definedExternally
}

external fun execSync(command: String): dynamic /* Buffer */

external fun execSync(command: String, options: ExecSyncOptionsWithStringEncoding = definedExternally): String

external fun execSync(command: String, options: ExecSyncOptionsWithBufferEncoding = definedExternally): Buffer

external fun execSync(command: String, options: ExecSyncOptions = definedExternally): Buffer

external interface ExecFileSyncOptions : CommonOptions {
    var input: dynamic /* String? | Uint8Array? | Uint8ClampedArray? | Uint16Array? | Uint32Array? | Int8Array? | Int16Array? | Int32Array? | BigUint64Array? | BigInt64Array? | Float32Array? | Float64Array? | DataView? */
        get() = definedExternally
        set(value) = definedExternally
    var stdio: dynamic /* "pipe" | "ignore" | "inherit" | Array<dynamic /* "pipe" | "ipc" | "ignore" | "inherit" | Stream? | Number? */>? */
        get() = definedExternally
        set(value) = definedExternally
    var killSignal: dynamic /* "SIGABRT" | "SIGALRM" | "SIGBUS" | "SIGCHLD" | "SIGCONT" | "SIGFPE" | "SIGHUP" | "SIGILL" | "SIGINT" | "SIGIO" | "SIGIOT" | "SIGKILL" | "SIGPIPE" | "SIGPOLL" | "SIGPROF" | "SIGPWR" | "SIGQUIT" | "SIGSEGV" | "SIGSTKFLT" | "SIGSTOP" | "SIGSYS" | "SIGTERM" | "SIGTRAP" | "SIGTSTP" | "SIGTTIN" | "SIGTTOU" | "SIGUNUSED" | "SIGURG" | "SIGUSR1" | "SIGUSR2" | "SIGVTALRM" | "SIGWINCH" | "SIGXCPU" | "SIGXFSZ" | "SIGBREAK" | "SIGLOST" | "SIGINFO" | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var maxBuffer: Number?
        get() = definedExternally
        set(value) = definedExternally
    var encoding: String? /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */
        get() = definedExternally
        set(value) = definedExternally
    var shell: dynamic /* Boolean? | String? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface ExecFileSyncOptionsWithStringEncoding : ExecFileSyncOptions

external interface ExecFileSyncOptionsWithBufferEncoding : ExecFileSyncOptions

external fun execFileSync(command: String): dynamic /* Buffer */

external fun execFileSync(command: String, options: ExecFileSyncOptionsWithStringEncoding = definedExternally): String

external fun execFileSync(command: String, options: ExecFileSyncOptionsWithBufferEncoding = definedExternally): Buffer

external fun execFileSync(command: String, options: ExecFileSyncOptions = definedExternally): Buffer

external fun execFileSync(command: String, args: Array<String> = definedExternally, options: ExecFileSyncOptionsWithStringEncoding = definedExternally): String

external fun execFileSync(command: String, args: Array<String> = definedExternally): dynamic /* Buffer */

external fun execFileSync(command: String, args: Array<String> = definedExternally, options: ExecFileSyncOptionsWithBufferEncoding = definedExternally): Buffer

external fun execFileSync(command: String, args: Array<String> = definedExternally, options: ExecFileSyncOptions = definedExternally): Buffer