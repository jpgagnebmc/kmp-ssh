@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")

import kotlin.js.*
import stream.internal.Duplex
import stream.internal.Readable
import stream.internal.Writable
import NodeJS.ReadableStream
import process.global.NodeJS.ProcessEnv
import net.Socket
import net.ListenOptions

external interface Channel : Duplex {
    var allowHalfOpen: Boolean
    var stdin: Channel /* this */
    var stdout: Channel /* this */
    var stderr: dynamic /* stream.Readable | stream.Writable */
        get() = definedExternally
        set(value) = definedExternally
    var server: Boolean
    var type: String?
    var subtype: String?
    fun eof(): Boolean
    fun close(): Boolean
    fun destroy()
}

external interface ClientChannel : Channel {
    override var stderr: Readable
    override var server: Boolean
    fun setWindow(rows: Number, cols: Number, height: Number, width: Number): Boolean
    fun signal(signalName: String): Boolean
    override fun on(event: String /* "close" */, listener: () -> Unit): ClientChannel /* this */
    fun on(event: String /* "exit" */, listener: (exitCode: Number?, signalName: String, didCoreDump: Boolean, description: String) -> Unit): ClientChannel /* this */
    fun on(event: String, listener: Function<*>): ClientChannel /* this */
    fun on(event: Any, listener: Function<*>): ClientChannel /* this */
}

external interface ServerChannel : Channel {
    override var stderr: Writable
    override var server: Boolean
    fun exit(exitCode: Number): Boolean
    fun exit(name: String, coreDumped: Boolean, msg: String): Boolean
    override fun on(event: String /* "close" */, listener: () -> Unit): ServerChannel /* this */
    fun on(event: String, listener: Function<*>): ServerChannel /* this */
    fun on(event: Any, listener: Function<*>): ServerChannel /* this */
}
@JsModule("ssh2")
@JsNonModule
external open class Client : events.EventEmitter {
    open fun on(event: String /* "banner" | "greeting" */, listener: (message: String) -> Unit): Client /* this */
    open fun on(event: String /* "ready" | "continue" | "end" | "timeout" | "connect" */, listener: () -> Unit): Client /* this */
    open fun on(event: String /* "tcp connection" */, listener: (details: TcpConnectionDetails, accept: () -> ClientChannel, reject: () -> Unit) -> Unit): Client /* this */
    open fun on(event: String /* "x11" */, listener: (details: X11Details, accept: () -> ClientChannel, reject: () -> Unit) -> Unit): Client /* this */
    open fun on(event: String /* "keyboard-interactive" */, listener: (name: String, instructions: String, lang: String, prompts: Array<Prompt>, finish: (responses: Array<String>) -> Unit) -> Unit): Client /* this */
    open fun on(event: String /* "change password" */, listener: (message: String, lang: String, done: (password: String) -> Unit) -> Unit): Client /* this */
    open fun on(event: String /* "error" */, listener: (err: Error /* Error & ClientErrorExtensions */) -> Unit): Client /* this */
    open fun on(event: String /* "close" */, listener: (hadError: Boolean) -> Unit): Client /* this */
    open fun on(event: String, listener: Function<*>): Client /* this */
    open fun on(event: Any, listener: Function<*>): Client /* this */
    open fun connect(config: ConnectConfig)
    open fun exec(command: String, options: ExecOptions, callback: (err: Error?, channel: ClientChannel) -> Unit): Boolean
    open fun exec(command: String, callback: (err: Error?, channel: ClientChannel) -> Unit): Boolean
    open fun shell(window: PseudoTtyOptions, options: ShellOptions, callback: (err: Error?, channel: ClientChannel) -> Unit): Boolean
    open fun shell(window: Boolean, options: ShellOptions, callback: (err: Error?, channel: ClientChannel) -> Unit): Boolean
    open fun shell(window: PseudoTtyOptions, callback: (err: Error?, channel: ClientChannel) -> Unit): Boolean
    open fun shell(window: Boolean, callback: (err: Error?, channel: ClientChannel) -> Unit): Boolean
    open fun shell(options: ShellOptions, callback: (err: Error?, channel: ClientChannel) -> Unit): Boolean
    open fun shell(callback: (err: Error?, channel: ClientChannel) -> Unit): Boolean
    open fun forwardIn(remoteAddr: String, remotePort: Number, callback: (err: Error?, bindPort: Number) -> Unit = definedExternally): Boolean
    open fun unforwardIn(remoteAddr: String, remotePort: Number, callback: (err: Error?) -> Unit = definedExternally): Boolean
    open fun forwardOut(srcIP: String, srcPort: Number, dstIP: String, dstPort: Number, callback: (err: Error?, channel: ClientChannel) -> Unit): Boolean
    open fun sftp(callback: (err: Error?, sftp: SFTPWrapper) -> Unit): Boolean
    open fun subsys(subsystem: String, callback: (err: Error?, channel: ClientChannel) -> Unit): Boolean
    open fun end()
    open fun destroy()
    open fun openssh_noMoreSessions(callback: (err: Error?) -> Unit = definedExternally): Boolean
    open fun openssh_forwardInStreamLocal(socketPath: String, callback: (err: Error?) -> Unit = definedExternally): Boolean
    open fun openssh_unforwardInStreamLocal(socketPath: String, callback: (err: Error?) -> Unit = definedExternally): Boolean
    open fun openssh_forwardOutStreamLocal(socketPath: String, callback: (err: Error?, channel: ClientChannel) -> Unit = definedExternally): Boolean
}

external interface ConnectConfig {
    var host: String?
        get() = definedExternally
        set(value) = definedExternally
    var port: Number?
        get() = definedExternally
        set(value) = definedExternally
    var forceIPv4: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var forceIPv6: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var hostHash: String? /* "md5" | "sha1" */
        get() = definedExternally
        set(value) = definedExternally
    var hostVerifier: ((keyHash: String) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var username: String?
        get() = definedExternally
        set(value) = definedExternally
    var password: String?
        get() = definedExternally
        set(value) = definedExternally
    var agent: String?
        get() = definedExternally
        set(value) = definedExternally
    var privateKey: dynamic /* Buffer? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var passphrase: String?
        get() = definedExternally
        set(value) = definedExternally
    var localHostname: String?
        get() = definedExternally
        set(value) = definedExternally
    var localUsername: String?
        get() = definedExternally
        set(value) = definedExternally
    var tryKeyboard: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var keepaliveInterval: Number?
        get() = definedExternally
        set(value) = definedExternally
    var keepaliveCountMax: Number?
        get() = definedExternally
        set(value) = definedExternally
    var readyTimeout: Number?
        get() = definedExternally
        set(value) = definedExternally
    var strictVendor: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var sock: ReadableStream?
        get() = definedExternally
        set(value) = definedExternally
    var agentForward: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var algorithms: Algorithms?
        get() = definedExternally
        set(value) = definedExternally
    var compress: dynamic /* Boolean? | "force" */
        get() = definedExternally
        set(value) = definedExternally
    var debug: ((information: String) -> Any)?
        get() = definedExternally
        set(value) = definedExternally
    var authHandler: ((methodsLeft: Array<String>?, partialSuccess: Boolean?, callback: Function<*>) -> Any)?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TcpConnectionDetails {
    var srcIP: String
    var srcPort: Number
    var destIP: String
    var destPort: Number
}

external interface X11Details {
    var srcIP: String
    var srcPort: Number
}

external interface ClientErrorExtensions {
    var level: String?
        get() = definedExternally
        set(value) = definedExternally
    var description: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ExecOptions {
    var env: ProcessEnv?
        get() = definedExternally
        set(value) = definedExternally
    var pty: dynamic /* Boolean? | PseudoTtyOptions? */
        get() = definedExternally
        set(value) = definedExternally
    var x11: dynamic /* Boolean? | Number? | X11Options? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface ShellOptions {
    var env: ProcessEnv?
        get() = definedExternally
        set(value) = definedExternally
    var x11: dynamic /* Boolean? | Number? | X11Options? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface X11Options {
    var single: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var screen: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface PseudoTtyOptions {
    var rows: Number?
        get() = definedExternally
        set(value) = definedExternally
    var cols: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var term: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$0` {
    var fd: Number
}

external interface `T$1` {
    var port: Number
    var family: String
    var address: String
}

external open class Server(config: ServerConfig, connectionListener: (client: Connection, info: ClientInfo) -> Unit = definedExternally) : events.EventEmitter {
    open fun on(event: String /* "connection" */, listener: (client: Connection, info: ClientInfo) -> Unit): Server /* this */
    open fun on(event: String /* "error" */, listener: (err: Error) -> Unit): Server /* this */
    open fun on(event: String /* "listening" | "close" */, listener: () -> Unit): Server /* this */
    open fun on(event: String, listener: Function<*>): Server /* this */
    open fun on(event: Any, listener: Function<*>): Server /* this */
    open fun listen(path: String, backlog: Number = definedExternally, callback: () -> Unit = definedExternally): Server /* this */
    open fun listen(path: String): Server /* this */
    open fun listen(path: String, backlog: Number = definedExternally): Server /* this */
    open fun listen(path: String, callback: () -> Unit = definedExternally): Server /* this */
    open fun listen(handle: net.Server, backlog: Number = definedExternally, callback: () -> Unit = definedExternally): Server /* this */
    open fun listen(handle: net.Server): Server /* this */
    open fun listen(handle: net.Server, backlog: Number = definedExternally): Server /* this */
    open fun listen(handle: Socket, backlog: Number = definedExternally, callback: () -> Unit = definedExternally): Server /* this */
    open fun listen(handle: Socket): Server /* this */
    open fun listen(handle: Socket, backlog: Number = definedExternally): Server /* this */
    open fun listen(handle: `T$0`, backlog: Number = definedExternally, callback: () -> Unit = definedExternally): Server /* this */
    open fun listen(handle: `T$0`): Server /* this */
    open fun listen(handle: `T$0`, backlog: Number = definedExternally): Server /* this */
    open fun listen(handle: net.Server, callback: () -> Unit = definedExternally): Server /* this */
    open fun listen(handle: Socket, callback: () -> Unit = definedExternally): Server /* this */
    open fun listen(handle: `T$0`, callback: () -> Unit = definedExternally): Server /* this */
    open fun listen(options: ListenOptions, callback: () -> Unit = definedExternally): Server /* this */
    open fun listen(options: ListenOptions): Server /* this */
    open fun listen(port: Number, hostname: String = definedExternally, backlog: Number = definedExternally, callback: () -> Unit = definedExternally): Server /* this */
    open fun listen(port: Number): Server /* this */
    open fun listen(port: Number, hostname: String = definedExternally): Server /* this */
    open fun listen(port: Number, hostname: String = definedExternally, backlog: Number = definedExternally): Server /* this */
    open fun listen(port: Number, hostname: String = definedExternally, callback: () -> Unit = definedExternally): Server /* this */
    open fun listen(port: Number, backlog: Number = definedExternally, callback: () -> Unit = definedExternally): Server /* this */
    open fun listen(port: Number, backlog: Number = definedExternally): Server /* this */
    open fun listen(port: Number, callback: () -> Unit = definedExternally): Server /* this */
    open fun listen(callback: () -> Unit = definedExternally): Server /* this */
    open fun listen(): Server /* this */
    open fun address(): `T$1`
    open fun getConnections(callback: (err: Error?, count: Number) -> Unit)
    open fun close(callback: (err: Error?) -> Unit = definedExternally): Server /* this */
    open fun ref()
    open fun unref()

    companion object {
        var KEEPALIVE_INTERVAL: Number
        var KEEPALIVE_CLIENT_INTERVAL: Number
        var KEEPALIVE_CLIENT_COUNT_MAX: Number
        fun createServer(config: ServerConfig, connectionListener: (client: Connection, info: ClientInfo) -> Unit = definedExternally): Server
    }
}

external interface ServerConfig {
    var hostKeys: Array<dynamic /* Buffer | String | EncryptedPrivateKey */>
    var algorithms: Algorithms?
        get() = definedExternally
        set(value) = definedExternally
    var greeting: String?
        get() = definedExternally
        set(value) = definedExternally
    var banner: String?
        get() = definedExternally
        set(value) = definedExternally
    var ident: String?
        get() = definedExternally
        set(value) = definedExternally
    var highWaterMark: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maxPacketSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var debug: ((information: String) -> Any)?
        get() = definedExternally
        set(value) = definedExternally
}

external interface EncryptedPrivateKey {
    var key: dynamic /* Buffer | String */
        get() = definedExternally
        set(value) = definedExternally
    var passphrase: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ClientInfo {
    var ip: String
    var header: Header
}

external interface Connection : events.EventEmitter {
   override  fun on(event: String /* "authentication" */, listener: (authCtx: Any /* KeyboardAuthContext | PublicKeyAuthContext | HostbasedAuthContext | PasswordAuthContext | NoneAuthContext */) -> Unit): Connection /* this */
    fun on(event: String /* "ready" | "rekey" | "continue" | "end" */, listener: () -> Unit): Connection /* this */
    fun on(event: String /* "session" */, listener: (accept: () -> Session, reject: () -> Boolean) -> Unit): Connection /* this */
    fun on(event: String /* "tcpip" */, listener: (accept: () -> ServerChannel, reject: () -> Boolean, info: TcpipRequestInfo) -> Unit): Connection /* this */
    fun on(event: String /* "openssh.streamlocal" */, listener: (accept: () -> ServerChannel, reject: () -> Boolean, info: SocketRequestInfo) -> Unit): Connection /* this */
    fun on(event: String /* "request" */, listener: (accept: ((chosenPort: Number) -> Unit)?, reject: (() -> Unit)?, name: String /* "tcpip-forward" | "cancel-tcpip-forward" */, info: TcpipBindInfo) -> Unit): Connection /* this */
    fun on(event: String /* "request" */, listener: (accept: (() -> Unit)?, reject: () -> Unit, name: String /* "streamlocal-forward@openssh.com" | "cancel-streamlocal-forward@openssh.com" */, info: SocketBindInfo) -> Unit): Connection /* this */
    fun on(event: String /* "request" */, listener: (accept: ((chosenPort: Number) -> Unit)?, reject: (() -> Unit)?, name: String, info: Any /* TcpipBindInfo | SocketBindInfo */) -> Unit): Connection /* this */
    fun on(event: String /* "error" */, listener: (err: Error) -> Unit): Connection /* this */
    fun on(event: String /* "close" */, listener: (hadError: Boolean) -> Unit): Connection /* this */
    fun on(event: String, listener: Function<*>): Connection /* this */
    fun on(event: Any, listener: Function<*>): Connection /* this */
    var noMoreSessions: Boolean
    var authenticated: Boolean
    fun end(): Boolean
    fun x11(originAddr: String, originPort: Number, callback: (err: Error?, channel: ServerChannel) -> Unit): Boolean
    fun forwardOut(boundAddr: String, boundPort: Number, remoteAddr: String, remotePort: Number, callback: (err: Error?, channel: ServerChannel) -> Unit): Boolean
    fun rekey(callback: (err: Error?) -> Unit = definedExternally): Boolean
    fun openssh_forwardOutStreamLocal(socketPath: String, callback: (err: Error, channel: ServerChannel) -> Unit): Boolean
}

external interface AuthContextBase : events.EventEmitter {
    var username: String
    var service: String
    var method: String
    fun accept()
    fun reject()
    fun reject(isPartialSuccess: Boolean)
    fun reject(authMethodsLeft: Array<String> = definedExternally, isPartialSuccess: Boolean = definedExternally)
    fun reject(authMethodsLeft: Array<String> = definedExternally)
    fun on(event: String /* "abort" */, listener: () -> Unit): AuthContextBase /* this */
    fun on(event: String, listener: Function<*>): AuthContextBase /* this */
    fun on(event: Any, listener: Function<*>): AuthContextBase /* this */
}

external interface KeyboardAuthContext : AuthContextBase {
    override var method: String /* "keyboard-interactive" */
    var submethods: Array<String>
    fun prompt(prompts: String, callback: () -> Unit)
    fun prompt(prompts: Prompt, callback: () -> Unit)
    fun prompt(prompts: Array<Any /* String | Prompt */>, callback: () -> Unit)
    fun prompt(prompts: String, title: String, callback: () -> Unit)
    fun prompt(prompts: Prompt, title: String, callback: () -> Unit)
    fun prompt(prompts: Array<Any /* String | Prompt */>, title: String, callback: () -> Unit)
    fun prompt(prompts: String, title: String, instructions: String, callback: () -> Unit)
    fun prompt(prompts: Prompt, title: String, instructions: String, callback: () -> Unit)
    fun prompt(prompts: Array<Any /* String | Prompt */>, title: String, instructions: String, callback: () -> Unit)
}

external interface PublicKeyAuthContext : AuthContextBase {
    override var method: String /* "publickey" */
    var key: PublicKey
    var signature: Buffer?
    var sigAlgo: String
    var blob: Buffer
}

external interface PublicKey {
    var algo: String
    var data: Buffer
}

external interface HostbasedAuthContext : AuthContextBase {
    override var method: String /* "hostbased" */
    var key: PublicKey
    var signature: Buffer?
    var sigAlgo: String
    var blob: Buffer
    var localHostname: String
    var localUsername: String
}

external interface PasswordAuthContext : AuthContextBase {
    override var method: String /* "password" */
    var password: String
}

external interface NoneAuthContext : AuthContextBase {
    override var method: String /* "none" */
}

external interface TcpipRequestInfo {
    var srcIP: String
    var srcPort: Number
    var destIP: String
    var destPort: Number
}

external interface SocketRequestInfo {
    var socketPath: String
}

external interface TcpipBindInfo {
    var bindAddr: String
    var bindPort: Number
}

external interface SocketBindInfo {
    var socketPath: String
}

external interface Session : events.EventEmitter {
    fun on(event: String /* "pty" */, listener: (accept: (() -> Boolean)?, reject: (() -> Boolean)?, info: PseudoTtyInfo) -> Unit): Session /* this */
    fun on(event: String /* "window-change" */, listener: (accept: (() -> Boolean)?, reject: (() -> Boolean)?, info: WindowChangeInfo) -> Unit): Session /* this */
    fun on(event: String /* "x11" */, listener: (accept: (() -> Boolean)?, reject: (() -> Boolean)?, info: X11Info) -> Unit): Session /* this */
    fun on(event: String /* "env" */, listener: (accept: (() -> Boolean)?, reject: (() -> Boolean)?, info: SetEnvInfo) -> Unit): Session /* this */
    fun on(event: String /* "signal" */, listener: (accept: (() -> Boolean)?, reject: (() -> Boolean)?, info: SignalInfo) -> Unit): Session /* this */
    fun on(event: String /* "auth-agent" */, listener: (accept: (() -> Boolean)?, reject: (() -> Boolean)?) -> Unit): Session /* this */
    fun on(event: String /* "shell" */, listener: (accept: () -> ServerChannel, reject: (() -> Boolean)?) -> Unit): Session /* this */
    fun on(event: String /* "exec" */, listener: (accept: () -> ServerChannel, reject: (() -> Boolean)?, info: ExecInfo) -> Unit): Session /* this */
    fun on(event: String /* "sftp" */, listener: (accept: () -> SFTPStream, reject: (() -> Boolean)?) -> Unit): Session /* this */
    fun on(event: String /* "subsystem" */, listener: (accept: () -> ServerChannel, reject: (() -> Boolean)?, info: SubsystemInfo) -> Unit): Session /* this */
    fun on(event: String /* "close" */, listener: () -> Unit): Session /* this */
    fun on(event: String, listener: Function<*>): Session /* this */
    fun on(event: Any, listener: Function<*>): Session /* this */
}

external interface PseudoTtyInfo {
    var cols: Number
    var rows: Number
    var width: Number
    var height: Number
    var modes: TerminalModes
}

external interface TerminalModes {
    @nativeGetter
    operator fun get(mode: String): Number?
    @nativeSetter
    operator fun set(mode: String, value: Number?)
    var VINTR: Number?
        get() = definedExternally
        set(value) = definedExternally
    var VQUIT: Number?
        get() = definedExternally
        set(value) = definedExternally
    var VERASE: Number?
        get() = definedExternally
        set(value) = definedExternally
    var VKILL: Number?
        get() = definedExternally
        set(value) = definedExternally
    var VEOF: Number?
        get() = definedExternally
        set(value) = definedExternally
    var VEOL: Number?
        get() = definedExternally
        set(value) = definedExternally
    var VEOL2: Number?
        get() = definedExternally
        set(value) = definedExternally
    var VSTART: Number?
        get() = definedExternally
        set(value) = definedExternally
    var VSTOP: Number?
        get() = definedExternally
        set(value) = definedExternally
    var VSUSP: Number?
        get() = definedExternally
        set(value) = definedExternally
    var VDSUSP: Number?
        get() = definedExternally
        set(value) = definedExternally
    var VREPRINT: Number?
        get() = definedExternally
        set(value) = definedExternally
    var VWERASE: Number?
        get() = definedExternally
        set(value) = definedExternally
    var VLNEXT: Number?
        get() = definedExternally
        set(value) = definedExternally
    var VFLUSH: Number?
        get() = definedExternally
        set(value) = definedExternally
    var VSWTCH: Number?
        get() = definedExternally
        set(value) = definedExternally
    var VSTATUS: Number?
        get() = definedExternally
        set(value) = definedExternally
    var VDISCARD: Number?
        get() = definedExternally
        set(value) = definedExternally
    var IGNPAR: Number? /* 0 | 1 */
        get() = definedExternally
        set(value) = definedExternally
    var PARMRK: Number? /* 0 | 1 */
        get() = definedExternally
        set(value) = definedExternally
    var INPCK: Number? /* 0 | 1 */
        get() = definedExternally
        set(value) = definedExternally
    var ISTRIP: Number? /* 0 | 1 */
        get() = definedExternally
        set(value) = definedExternally
    var INLCR: Number? /* 0 | 1 */
        get() = definedExternally
        set(value) = definedExternally
    var IGNCR: Number? /* 0 | 1 */
        get() = definedExternally
        set(value) = definedExternally
    var ICRNL: Number? /* 0 | 1 */
        get() = definedExternally
        set(value) = definedExternally
    var IUCLC: Number? /* 0 | 1 */
        get() = definedExternally
        set(value) = definedExternally
    var IXON: Number? /* 0 | 1 */
        get() = definedExternally
        set(value) = definedExternally
    var IXANY: Number? /* 0 | 1 */
        get() = definedExternally
        set(value) = definedExternally
    var IXOFF: Number? /* 0 | 1 */
        get() = definedExternally
        set(value) = definedExternally
    var IMAXBEL: Number? /* 0 | 1 */
        get() = definedExternally
        set(value) = definedExternally
    var ISIG: Number? /* 0 | 1 */
        get() = definedExternally
        set(value) = definedExternally
    var ICANON: Number? /* 0 | 1 */
        get() = definedExternally
        set(value) = definedExternally
    var XCASE: Number? /* 0 | 1 */
        get() = definedExternally
        set(value) = definedExternally
    var ECHO: Number? /* 0 | 1 */
        get() = definedExternally
        set(value) = definedExternally
    var ECHOE: Number? /* 0 | 1 */
        get() = definedExternally
        set(value) = definedExternally
    var ECHOK: Number? /* 0 | 1 */
        get() = definedExternally
        set(value) = definedExternally
    var ECHONL: Number? /* 0 | 1 */
        get() = definedExternally
        set(value) = definedExternally
    var NOFLSH: Number? /* 0 | 1 */
        get() = definedExternally
        set(value) = definedExternally
    var TOSTOP: Number? /* 0 | 1 */
        get() = definedExternally
        set(value) = definedExternally
    var IEXTEN: Number? /* 0 | 1 */
        get() = definedExternally
        set(value) = definedExternally
    var ECHOCTL: Number? /* 0 | 1 */
        get() = definedExternally
        set(value) = definedExternally
    var ECHOKE: Number? /* 0 | 1 */
        get() = definedExternally
        set(value) = definedExternally
    var PENDIN: Number? /* 0 | 1 */
        get() = definedExternally
        set(value) = definedExternally
    var OPOST: Number? /* 0 | 1 */
        get() = definedExternally
        set(value) = definedExternally
    var OLCUC: Number? /* 0 | 1 */
        get() = definedExternally
        set(value) = definedExternally
    var ONLCR: Number? /* 0 | 1 */
        get() = definedExternally
        set(value) = definedExternally
    var OCRNL: Number? /* 0 | 1 */
        get() = definedExternally
        set(value) = definedExternally
    var ONOCR: Number? /* 0 | 1 */
        get() = definedExternally
        set(value) = definedExternally
    var ONLRET: Number? /* 0 | 1 */
        get() = definedExternally
        set(value) = definedExternally
    var CS7: Number? /* 0 | 1 */
        get() = definedExternally
        set(value) = definedExternally
    var CS8: Number? /* 0 | 1 */
        get() = definedExternally
        set(value) = definedExternally
    var PARENB: Number? /* 0 | 1 */
        get() = definedExternally
        set(value) = definedExternally
    var PARODD: Number? /* 0 | 1 */
        get() = definedExternally
        set(value) = definedExternally
    var TTY_OP_ISPEED: Number?
        get() = definedExternally
        set(value) = definedExternally
    var TTY_OP_OSPEED: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface WindowChangeInfo {
    var cols: Number
    var rows: Number
    var width: Number
    var height: Number
}

external interface X11Info {
    var single: Boolean
    var protocol: String
    var cookie: String
    var screen: Number
}

external interface SetEnvInfo {
    var key: String
    var value: String
}

external interface SignalInfo {
    var name: String
}

external interface ExecInfo {
    var command: String
}

external interface SubsystemInfo {
    var name: String
}

external interface SFTPWrapper : events.EventEmitter {
    fun fastGet(remotePath: String, localPath: String, options: TransferOptions, callback: (err: Any) -> Unit)
    fun fastGet(remotePath: String, localPath: String, callback: (err: Any) -> Unit)
    fun fastPut(localPath: String, remotePath: String, options: TransferOptions, callback: (err: Any) -> Unit)
    fun fastPut(localPath: String, remotePath: String, callback: (err: Any) -> Unit)
    fun readFile(remotePath: String, options: ReadFileOptions, callback: (err: Any, handle: Buffer) -> Unit)
    fun readFile(remotePath: String, encoding: String, callback: (err: Any, handle: Buffer) -> Unit)
    fun readFile(remotePath: String, callback: (err: Any, handle: Buffer) -> Unit)
    fun createReadStream(path: String, options: ReadStreamOptions = definedExternally): Readable
    fun writeFile(remotePath: String, data: String, options: WriteFileOptions, callback: (err: Any) -> Unit = definedExternally)
    fun writeFile(remotePath: String, data: String, options: WriteFileOptions)
    fun writeFile(remotePath: String, data: Buffer, options: WriteFileOptions, callback: (err: Any) -> Unit = definedExternally)
    fun writeFile(remotePath: String, data: Buffer, options: WriteFileOptions)
    fun writeFile(remotePath: String, data: String, encoding: String, callback: (err: Any) -> Unit = definedExternally)
    fun writeFile(remotePath: String, data: String, encoding: String)
    fun writeFile(remotePath: String, data: Buffer, encoding: String, callback: (err: Any) -> Unit = definedExternally)
    fun writeFile(remotePath: String, data: Buffer, encoding: String)
    fun writeFile(remotePath: String, data: String, callback: (err: Any) -> Unit = definedExternally)
    fun writeFile(remotePath: String, data: String)
    fun writeFile(remotePath: String, data: Buffer, callback: (err: Any) -> Unit = definedExternally)
    fun writeFile(remotePath: String, data: Buffer)
    fun createWriteStream(path: String, options: WriteStreamOptions = definedExternally): Writable
    fun open(filename: String, mode: String, attributes: InputAttributes, callback: (err: Any, handle: Buffer) -> Unit): Boolean
    fun open(filename: String, mode: String, callback: (err: Any, handle: Buffer) -> Unit): Boolean
    fun close(handle: Buffer, callback: (err: Any) -> Unit): Boolean
    fun read(handle: Buffer, buffer: Buffer, offset: Number, length: Number, position: Number, callback: (err: Any, bytesRead: Number, buffer: Buffer, position: Number) -> Unit): Boolean
    fun write(handle: Buffer, buffer: Buffer, offset: Number, length: Number, position: Number, callback: (err: Any) -> Unit): Boolean
    fun fstat(handle: Buffer, callback: (err: Any, stats: Stats) -> Unit): Boolean
    fun fsetstat(handle: Buffer, attributes: InputAttributes, callback: (err: Any) -> Unit): Boolean
    fun futimes(handle: Buffer, atime: Number, mtime: Number, callback: (err: Any) -> Unit): Boolean
    fun futimes(handle: Buffer, atime: Number, mtime: Date, callback: (err: Any) -> Unit): Boolean
    fun futimes(handle: Buffer, atime: Date, mtime: Number, callback: (err: Any) -> Unit): Boolean
    fun futimes(handle: Buffer, atime: Date, mtime: Date, callback: (err: Any) -> Unit): Boolean
    fun fchown(handle: Buffer, uid: Number, gid: Number, callback: (err: Any) -> Unit): Boolean
    fun fchmod(handle: Buffer, mode: Number, callback: (err: Any) -> Unit): Boolean
    fun fchmod(handle: Buffer, mode: String, callback: (err: Any) -> Unit): Boolean
    fun opendir(path: String, callback: (err: Any, handle: Buffer) -> Unit): Boolean
    fun readdir(location: String, callback: (err: Any, list: Array<FileEntry>) -> Unit): Boolean
    fun readdir(location: Buffer, callback: (err: Any, list: Array<FileEntry>) -> Unit): Boolean
    fun unlink(path: String, callback: (err: Any) -> Unit): Boolean
    fun rename(srcPath: String, destPath: String, callback: (err: Any) -> Unit): Boolean
    fun mkdir(path: String, attributes: InputAttributes, callback: (err: Any) -> Unit): Boolean
    fun mkdir(path: String, callback: (err: Any) -> Unit): Boolean
    fun rmdir(path: String, callback: (err: Any) -> Unit): Boolean
    fun stat(path: String, callback: (err: Any, stats: Stats) -> Unit): Boolean
    fun exists(path: String, callback: (err: Any) -> Unit): Boolean
    fun lstat(path: String, callback: (err: Any, stats: Stats) -> Unit): Boolean
    fun setstat(path: String, attributes: InputAttributes, callback: (err: Any) -> Unit): Boolean
    fun utimes(path: String, atime: Number, mtime: Number, callback: (err: Any) -> Unit): Boolean
    fun utimes(path: String, atime: Number, mtime: Date, callback: (err: Any) -> Unit): Boolean
    fun utimes(path: String, atime: Date, mtime: Number, callback: (err: Any) -> Unit): Boolean
    fun utimes(path: String, atime: Date, mtime: Date, callback: (err: Any) -> Unit): Boolean
    fun chown(path: String, uid: Number, gid: Number, callback: (err: Any) -> Unit): Boolean
    fun chmod(path: String, mode: Number, callback: (err: Any) -> Unit): Boolean
    fun chmod(path: String, mode: String, callback: (err: Any) -> Unit): Boolean
    fun readlink(path: String, callback: (err: Any, target: String) -> Unit): Boolean
    fun symlink(targetPath: String, linkPath: String, callback: (err: Any) -> Unit): Boolean
    fun realpath(path: String, callback: (err: Any, absPath: String) -> Unit): Boolean
    fun ext_openssh_rename(srcPath: String, destPath: String, callback: (err: Any) -> Unit): Boolean
    fun ext_openssh_statvfs(path: String, callback: (err: Any, fsInfo: Any) -> Unit): Boolean
    fun ext_openssh_fstatvfs(handle: Buffer, callback: (err: Any, fsInfo: Any) -> Unit): Boolean
    fun ext_openssh_hardlink(targetPath: String, linkPath: String, callback: (err: Any) -> Unit): Boolean
    fun ext_openssh_fsync(handle: Buffer, callback: (err: Any, fsInfo: Any) -> Unit): Boolean
    fun end()
    override  fun on(event: String /* "error" */, listener: (err: Any) -> Unit): SFTPWrapper /* this */
    fun on(event: String /* "end" | "close" | "continue" */, listener: () -> Unit): SFTPWrapper /* this */
    fun on(event: String, listener: Function<*>): SFTPWrapper /* this */
    fun on(event: Any, listener: Function<*>): SFTPWrapper /* this */
}