@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")

import kotlin.js.*
import stream.internal.Transform

external interface Algorithms {
    var kex: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var cipher: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var serverHostKey: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var hmac: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var compress: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Header {
    var greeting: String?
        get() = definedExternally
        set(value) = definedExternally
    var identRaw: String
    var versions: Versions
    var comments: String
}

external interface Versions {
    var protocol: String
    var software: String
}

external interface Prompt {
    var prompt: String
    var echo: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class SFTPStream : Transform {
    constructor(remoteIdentRaw: String)
    constructor(cfg: SFTPStreamConfig = definedExternally, remoteIdentRaw: String = definedExternally)
    constructor()
    constructor(cfg: SFTPStreamConfig = definedExternally)
    open fun fastGet(remotePath: String, localPath: String, options: TransferOptions, callback: (err: Any) -> Unit)
    open fun fastGet(remotePath: String, localPath: String, callback: (err: Any) -> Unit)
    open fun fastPut(localPath: String, remotePath: String, options: TransferOptions, callback: (err: Any) -> Unit)
    open fun fastPut(localPath: String, remotePath: String, callback: (err: Any) -> Unit)
    open fun readFile(remotePath: String, options: ReadFileOptions, callback: (err: Any, handle: Buffer) -> Unit)
    open fun readFile(remotePath: String, encoding: String, callback: (err: Any, handle: Buffer) -> Unit)
    open fun readFile(remotePath: String, callback: (err: Any, handle: Buffer) -> Unit)
    open fun createReadStream(path: String, options: ReadStreamOptions = definedExternally): Readable
    open fun writeFile(remotePath: String, data: String, options: WriteFileOptions, callback: (err: Any) -> Unit = definedExternally)
    open fun writeFile(remotePath: String, data: String, options: WriteFileOptions)
    open fun writeFile(remotePath: String, data: Buffer, options: WriteFileOptions, callback: (err: Any) -> Unit = definedExternally)
    open fun writeFile(remotePath: String, data: Buffer, options: WriteFileOptions)
    open fun writeFile(remotePath: String, data: String, encoding: String, callback: (err: Any) -> Unit = definedExternally)
    open fun writeFile(remotePath: String, data: String, encoding: String)
    open fun writeFile(remotePath: String, data: Buffer, encoding: String, callback: (err: Any) -> Unit = definedExternally)
    open fun writeFile(remotePath: String, data: Buffer, encoding: String)
    open fun writeFile(remotePath: String, data: String, callback: (err: Any) -> Unit = definedExternally)
    open fun writeFile(remotePath: String, data: String)
    open fun writeFile(remotePath: String, data: Buffer, callback: (err: Any) -> Unit = definedExternally)
    open fun writeFile(remotePath: String, data: Buffer)
    open fun createWriteStream(path: String, options: WriteStreamOptions = definedExternally): Writable
    open fun open(filename: String, mode: String, attributes: InputAttributes, callback: (err: Any, handle: Buffer) -> Unit): Boolean
    open fun open(filename: String, mode: String, callback: (err: Any, handle: Buffer) -> Unit): Boolean
    open fun close(handle: Buffer, callback: (err: Any) -> Unit): Boolean
    open fun readData(handle: Buffer, buffer: Buffer, offset: Number, length: Number, position: Number, callback: (err: Any, bytesRead: Number, buffer: Buffer, position: Number) -> Unit): Boolean
    open fun writeData(handle: Buffer, buffer: Buffer, offset: Number, length: Number, position: Number, callback: (err: Any) -> Unit): Boolean
    open fun fstat(handle: Buffer, callback: (err: Any, stats: Stats) -> Unit): Boolean
    open fun fsetstat(handle: Buffer, attributes: InputAttributes, callback: (err: Any) -> Unit): Boolean
    open fun futimes(handle: Buffer, atime: Number, mtime: Number, callback: (err: Any) -> Unit): Boolean
    open fun futimes(handle: Buffer, atime: Number, mtime: Date, callback: (err: Any) -> Unit): Boolean
    open fun futimes(handle: Buffer, atime: Date, mtime: Number, callback: (err: Any) -> Unit): Boolean
    open fun futimes(handle: Buffer, atime: Date, mtime: Date, callback: (err: Any) -> Unit): Boolean
    open fun fchown(handle: Buffer, uid: Number, gid: Number, callback: (err: Any) -> Unit): Boolean
    open fun fchmod(handle: Buffer, mode: Number, callback: (err: Any) -> Unit): Boolean
    open fun fchmod(handle: Buffer, mode: String, callback: (err: Any) -> Unit): Boolean
    open fun opendir(path: String, callback: (err: Any, handle: Buffer) -> Unit): Boolean
    open fun readdir(location: String, callback: (err: Any, list: Array<FileEntry>) -> Unit): Boolean
    open fun readdir(location: Buffer, callback: (err: Any, list: Array<FileEntry>) -> Unit): Boolean
    open fun unlink(path: String, callback: (err: Any) -> Unit): Boolean
    open fun rename(srcPath: String, destPath: String, callback: (err: Any) -> Unit): Boolean
    open fun mkdir(path: String, attributes: InputAttributes, callback: (err: Any) -> Unit): Boolean
    open fun mkdir(path: String, callback: (err: Any) -> Unit): Boolean
    open fun rmdir(path: String, callback: (err: Any) -> Unit): Boolean
    open fun stat(path: String, callback: (err: Any, stats: Stats) -> Unit): Boolean
    open fun lstat(path: String, callback: (err: Any, stats: Stats) -> Unit): Boolean
    open fun setstat(path: String, attributes: InputAttributes, callback: (err: Any) -> Unit): Boolean
    open fun utimes(path: String, atime: Number, mtime: Number, callback: (err: Any) -> Unit): Boolean
    open fun utimes(path: String, atime: Number, mtime: Date, callback: (err: Any) -> Unit): Boolean
    open fun utimes(path: String, atime: Date, mtime: Number, callback: (err: Any) -> Unit): Boolean
    open fun utimes(path: String, atime: Date, mtime: Date, callback: (err: Any) -> Unit): Boolean
    open fun chown(path: String, uid: Number, gid: Number, callback: (err: Any) -> Unit): Boolean
    open fun chmod(path: String, mode: Number, callback: (err: Any) -> Unit): Boolean
    open fun chmod(path: String, mode: String, callback: (err: Any) -> Unit): Boolean
    open fun readlink(path: String, callback: (err: Any, target: String) -> Unit): Boolean
    open fun symlink(targetPath: String, linkPath: String, callback: (err: Any) -> Unit): Boolean
    open fun realpath(path: String, callback: (err: Any, absPath: String) -> Unit): Boolean
    open fun ext_openssh_rename(srcPath: String, destPath: String, callback: (err: Any) -> Unit): Boolean
    open fun ext_openssh_statvfs(path: String, callback: (err: Any, fsInfo: Any) -> Unit): Boolean
    open fun ext_openssh_fstatvfs(handle: Buffer, callback: (err: Any, fsInfo: Any) -> Unit): Boolean
    open fun ext_openssh_hardlink(targetPath: String, linkPath: String, callback: (err: Any) -> Unit): Boolean
    open fun ext_openssh_fsync(handle: Buffer, callback: (err: Any, fsInfo: Any) -> Unit): Boolean
    open fun status(reqID: Number, statusCode: Number, message: String = definedExternally): Boolean
    open fun handle(reqID: Number, handle: Buffer): Boolean
    open fun data(reqID: Number, data: String, encoding: String = definedExternally): Boolean
    open fun data(reqID: Number, data: String): Boolean
    open fun data(reqID: Number, data: Buffer, encoding: String = definedExternally): Boolean
    open fun data(reqID: Number, data: Buffer): Boolean
    open fun name(reqID: Number, names: Array<FileEntry>): Boolean
    open fun attrs(reqID: Number, attrs: Attributes): Boolean
    override fun on(event: String /* "ready" | "end" | "close" | "continue" */, listener: () -> Unit): SFTPStream /* this */
    open fun on(event: String /* "OPEN" */, listener: (reqID: Number, filename: String, flags: Number, attrs: InputAttributes) -> Unit): SFTPStream /* this */
    open fun on(event: String /* "READ" */, listener: (reqID: Number, handle: Buffer, offset: Number, length: Number) -> Unit): SFTPStream /* this */
    open fun on(event: String /* "WRITE" */, listener: (reqID: Number, handle: Buffer, offset: Number, data: Buffer) -> Unit): SFTPStream /* this */
    open fun on(event: String /* "FSTAT" | "CLOSE" | "READDIR" */, listener: (reqID: Number, handle: Buffer) -> Unit): SFTPStream /* this */
    open fun on(event: String /* "FSETSTAT" */, listener: (reqID: Number, handle: Buffer, attrs: InputAttributes) -> Unit): SFTPStream /* this */
    open fun on(event: String /* "OPENDIR" | "LSTAT" | "STAT" | "REMOVE" | "RMDIR" | "REALPATH" | "READLINK" */, listener: (reqID: Number, path: String) -> Unit): SFTPStream /* this */
    open fun on(event: String /* "SETSTAT" | "MKDIR" */, listener: (reqID: Number, path: String, attrs: InputAttributes) -> Unit): SFTPStream /* this */
    open fun on(event: String /* "RENAME" | "SYMLINK" */, listener: (reqID: Number, oldPath: String, newPath: String) -> Unit): SFTPStream /* this */
    override fun on(event: String /* "error" */, listener: (err: Any) -> Unit): SFTPStream /* this */
    open fun on(event: String, listener: Function<*>): SFTPStream /* this */
    open fun on(event: Any, listener: Function<*>): SFTPStream /* this */

    companion object {
        fun stringToFlags(flagsStr: String): Number
        fun flagsToString(flagsMask: Number): String
    }
}

external interface SFTPStreamConfig {
    var server: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var highWaterMark: Number?
        get() = definedExternally
        set(value) = definedExternally
    var debug: ((information: String) -> Any)?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TransferOptions {
    var concurrency: Number?
        get() = definedExternally
        set(value) = definedExternally
    var chunkSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var step: ((total_transferred: Number, chunk: Number, total: Number) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var mode: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface ReadStreamOptions {
    var flags: String?
        get() = definedExternally
        set(value) = definedExternally
    var encoding: String?
        get() = definedExternally
        set(value) = definedExternally
    var handle: Buffer?
        get() = definedExternally
        set(value) = definedExternally
    var mode: Number?
        get() = definedExternally
        set(value) = definedExternally
    var autoClose: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var start: Number?
        get() = definedExternally
        set(value) = definedExternally
    var end: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface WriteStreamOptions {
    var flags: String?
        get() = definedExternally
        set(value) = definedExternally
    var encoding: String?
        get() = definedExternally
        set(value) = definedExternally
    var mode: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface FileEntry {
    var filename: String
    var longname: String
    var attrs: Attributes
}

external interface InputAttributes {
    var mode: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var uid: Number?
        get() = definedExternally
        set(value) = definedExternally
    var gid: Number?
        get() = definedExternally
        set(value) = definedExternally
    var size: Number?
        get() = definedExternally
        set(value) = definedExternally
    var atime: dynamic /* Number? | Date? */
        get() = definedExternally
        set(value) = definedExternally
    var mtime: dynamic /* Number? | Date? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface Attributes {
    var mode: Number
    var uid: Number
    var gid: Number
    var size: Number
    var atime: Number
    var mtime: Number
}

external interface Stats : Attributes {
    fun isDirectory(): Boolean
    fun isFile(): Boolean
    fun isBlockDevice(): Boolean
    fun isCharacterDevice(): Boolean
    fun isSymbolicLink(): Boolean
    fun isFIFO(): Boolean
    fun isSocket(): Boolean
}

external interface ParsedKey {
    var type: String
    var comment: String
    fun getPrivatePEM(): String
    fun getPublicPEM(): String
    fun getPublicSSH(): String
    fun sign(data: String): dynamic /* Buffer | Error */
    fun sign(data: Buffer): dynamic /* Buffer | Error */
    fun verify(data: String, signature: Buffer): dynamic /* Boolean | Error */
    fun verify(data: Buffer, signature: Buffer): dynamic /* Boolean | Error */
}

external interface ReadFileOptions {
    var encoding: String?
        get() = definedExternally
        set(value) = definedExternally
    var flag: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface WriteFileOptions {
    var encoding: String?
        get() = definedExternally
        set(value) = definedExternally
    var mode: Number?
        get() = definedExternally
        set(value) = definedExternally
    var flag: String?
        get() = definedExternally
        set(value) = definedExternally
}