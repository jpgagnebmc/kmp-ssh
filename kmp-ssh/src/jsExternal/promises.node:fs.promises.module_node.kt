@file:JsModule("node:fs/promises")
@file:JsNonModule
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package node.fs.promises

import kotlin.js.*
import org.khronos.webgl.*
import fs.read.`T$41`
import Buffer
import fs.BaseEncodingOptions
import fs.StatOptions
import fs.write.`T$39`
import fs.write.`T$40`
import fs.WriteVResult
import fs.ReadVResult
import url.URL
import fs.RmDirOptions
import fs.RmOptions
import fs.MakeDirectoryOptions
import fs.`T$36`
import fs.Dirent
import fs.`T$30`
import fs.OpenDirOptions
import fs.Dir

external interface `T$64` {
    var mode: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var flag: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$65` {
    var encoding: Any?
        get() = definedExternally
        set(value) = definedExternally
    var flag: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$66` {
    var encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */
    var flag: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$67` {
    var flag: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface FileHandle {
    var fd: Number
    fun appendFile(data: String, options: Any? /* BaseEncodingOptions & `T$64` | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Promise<Unit>
    fun appendFile(data: String): Promise<Unit>
    fun appendFile(data: Uint8Array, options: Any? /* BaseEncodingOptions & `T$64` | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Promise<Unit>
    fun appendFile(data: Uint8Array): Promise<Unit>
    fun chown(uid: Number, gid: Number): Promise<Unit>
    fun chmod(mode: Number): Promise<Unit>
    fun chmod(mode: String): Promise<Unit>
    fun datasync(): Promise<Unit>
    fun sync(): Promise<Unit>
    fun <TBuffer : Uint8Array> read(buffer: TBuffer, offset: Number? = definedExternally, length: Number? = definedExternally, position: Number? = definedExternally): Promise<`T$41`<TBuffer>>
    fun readFile(options: `T$65`? = definedExternally): Promise<Buffer>
    fun readFile(): dynamic /* Promise */
    fun readFile(options: `T$66`): Promise<String>
    fun readFile(options: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */): dynamic /* Promise */
    fun readFile(options: BaseEncodingOptions /* BaseEncodingOptions & `T$67` */ = definedExternally): Promise<dynamic /* String | Buffer */>
    fun stat(opts: StatOptions /* StatOptions & `T$31` | StatOptions & `T$32` */ = definedExternally): dynamic /* Promise */
    fun stat(): dynamic /* Promise | Promise */
    fun truncate(len: Number = definedExternally): Promise<Unit>
    fun utimes(atime: String, mtime: String): Promise<Unit>
    fun utimes(atime: String, mtime: Number): Promise<Unit>
    fun utimes(atime: String, mtime: Date): Promise<Unit>
    fun utimes(atime: Number, mtime: String): Promise<Unit>
    fun utimes(atime: Number, mtime: Number): Promise<Unit>
    fun utimes(atime: Number, mtime: Date): Promise<Unit>
    fun utimes(atime: Date, mtime: String): Promise<Unit>
    fun utimes(atime: Date, mtime: Number): Promise<Unit>
    fun utimes(atime: Date, mtime: Date): Promise<Unit>
    fun <TBuffer : Uint8Array> write(buffer: TBuffer, offset: Number? = definedExternally, length: Number? = definedExternally, position: Number? = definedExternally): Promise<`T$39`<TBuffer>>
    fun <TBuffer : Uint8Array> write(buffer: TBuffer): Promise<`T$39`<TBuffer>>
    fun <TBuffer : Uint8Array> write(buffer: TBuffer, offset: Number? = definedExternally): Promise<`T$39`<TBuffer>>
    fun <TBuffer : Uint8Array> write(buffer: TBuffer, offset: Number? = definedExternally, length: Number? = definedExternally): Promise<`T$39`<TBuffer>>
    fun write(data: String, position: Number? = definedExternally, encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Promise<`T$40`>
    fun write(data: String): Promise<`T$40`>
    fun write(data: String, position: Number? = definedExternally): Promise<`T$40`>
    fun write(data: Uint8Array, position: Number? = definedExternally, encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Promise<`T$40`>
    fun write(data: Uint8Array): Promise<`T$40`>
    fun write(data: Uint8Array, position: Number? = definedExternally): Promise<`T$40`>
    fun writeFile(data: String, options: Any? /* BaseEncodingOptions & `T$64` | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Promise<Unit>
    fun writeFile(data: String): Promise<Unit>
    fun writeFile(data: Uint8Array, options: Any? /* BaseEncodingOptions & `T$64` | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Promise<Unit>
    fun writeFile(data: Uint8Array): Promise<Unit>
    fun writev(buffers: Array<Any /* Uint8Array | Uint8ClampedArray | Uint16Array | Uint32Array | Int8Array | Int16Array | Int32Array | BigUint64Array | BigInt64Array | Float32Array | Float64Array | DataView */>, position: Number = definedExternally): Promise<WriteVResult>
    fun readv(buffers: Array<Any /* Uint8Array | Uint8ClampedArray | Uint16Array | Uint32Array | Int8Array | Int16Array | Int32Array | BigUint64Array | BigInt64Array | Float32Array | Float64Array | DataView */>, position: Number = definedExternally): Promise<ReadVResult>
    fun close(): Promise<Unit>
}

external fun access(path: String, mode: Number = definedExternally): Promise<Unit>

external fun access(path: String): Promise<Unit>

external fun access(path: Buffer, mode: Number = definedExternally): Promise<Unit>

external fun access(path: Buffer): Promise<Unit>

external fun access(path: URL, mode: Number = definedExternally): Promise<Unit>

external fun access(path: URL): Promise<Unit>

external fun copyFile(src: String, dest: String, flags: Number = definedExternally): Promise<Unit>

external fun copyFile(src: String, dest: String): Promise<Unit>

external fun copyFile(src: String, dest: Buffer, flags: Number = definedExternally): Promise<Unit>

external fun copyFile(src: String, dest: Buffer): Promise<Unit>

external fun copyFile(src: String, dest: URL, flags: Number = definedExternally): Promise<Unit>

external fun copyFile(src: String, dest: URL): Promise<Unit>

external fun copyFile(src: Buffer, dest: String, flags: Number = definedExternally): Promise<Unit>

external fun copyFile(src: Buffer, dest: String): Promise<Unit>

external fun copyFile(src: Buffer, dest: Buffer, flags: Number = definedExternally): Promise<Unit>

external fun copyFile(src: Buffer, dest: Buffer): Promise<Unit>

external fun copyFile(src: Buffer, dest: URL, flags: Number = definedExternally): Promise<Unit>

external fun copyFile(src: Buffer, dest: URL): Promise<Unit>

external fun copyFile(src: URL, dest: String, flags: Number = definedExternally): Promise<Unit>

external fun copyFile(src: URL, dest: String): Promise<Unit>

external fun copyFile(src: URL, dest: Buffer, flags: Number = definedExternally): Promise<Unit>

external fun copyFile(src: URL, dest: Buffer): Promise<Unit>

external fun copyFile(src: URL, dest: URL, flags: Number = definedExternally): Promise<Unit>

external fun copyFile(src: URL, dest: URL): Promise<Unit>

external fun open(path: String, flags: String, mode: Number = definedExternally): Promise<FileHandle>

external fun open(path: String, flags: String): Promise<FileHandle>

external fun open(path: String, flags: String, mode: String = definedExternally): Promise<FileHandle>

external fun open(path: String, flags: Number, mode: Number = definedExternally): Promise<FileHandle>

external fun open(path: String, flags: Number): Promise<FileHandle>

external fun open(path: String, flags: Number, mode: String = definedExternally): Promise<FileHandle>

external fun open(path: Buffer, flags: String, mode: Number = definedExternally): Promise<FileHandle>

external fun open(path: Buffer, flags: String): Promise<FileHandle>

external fun open(path: Buffer, flags: String, mode: String = definedExternally): Promise<FileHandle>

external fun open(path: Buffer, flags: Number, mode: Number = definedExternally): Promise<FileHandle>

external fun open(path: Buffer, flags: Number): Promise<FileHandle>

external fun open(path: Buffer, flags: Number, mode: String = definedExternally): Promise<FileHandle>

external fun open(path: URL, flags: String, mode: Number = definedExternally): Promise<FileHandle>

external fun open(path: URL, flags: String): Promise<FileHandle>

external fun open(path: URL, flags: String, mode: String = definedExternally): Promise<FileHandle>

external fun open(path: URL, flags: Number, mode: Number = definedExternally): Promise<FileHandle>

external fun open(path: URL, flags: Number): Promise<FileHandle>

external fun open(path: URL, flags: Number, mode: String = definedExternally): Promise<FileHandle>

external fun <TBuffer : Uint8Array> read(handle: FileHandle, buffer: TBuffer, offset: Number? = definedExternally, length: Number? = definedExternally, position: Number? = definedExternally): Promise<`T$41`<TBuffer>>

external fun <TBuffer : Uint8Array> write(handle: FileHandle, buffer: TBuffer, offset: Number? = definedExternally, length: Number? = definedExternally, position: Number? = definedExternally): Promise<`T$39`<TBuffer>>

external fun <TBuffer : Uint8Array> write(handle: FileHandle, buffer: TBuffer): Promise<`T$39`<TBuffer>>

external fun <TBuffer : Uint8Array> write(handle: FileHandle, buffer: TBuffer, offset: Number? = definedExternally): Promise<`T$39`<TBuffer>>

external fun <TBuffer : Uint8Array> write(handle: FileHandle, buffer: TBuffer, offset: Number? = definedExternally, length: Number? = definedExternally): Promise<`T$39`<TBuffer>>

external fun write(handle: FileHandle, string: String, position: Number? = definedExternally, encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Promise<`T$40`>

external fun write(handle: FileHandle, string: String): Promise<`T$40`>

external fun write(handle: FileHandle, string: String, position: Number? = definedExternally): Promise<`T$40`>

external fun rename(oldPath: String, newPath: String): Promise<Unit>

external fun rename(oldPath: String, newPath: Buffer): Promise<Unit>

external fun rename(oldPath: String, newPath: URL): Promise<Unit>

external fun rename(oldPath: Buffer, newPath: String): Promise<Unit>

external fun rename(oldPath: Buffer, newPath: Buffer): Promise<Unit>

external fun rename(oldPath: Buffer, newPath: URL): Promise<Unit>

external fun rename(oldPath: URL, newPath: String): Promise<Unit>

external fun rename(oldPath: URL, newPath: Buffer): Promise<Unit>

external fun rename(oldPath: URL, newPath: URL): Promise<Unit>

external fun truncate(path: String, len: Number = definedExternally): Promise<Unit>

external fun truncate(path: String): Promise<Unit>

external fun truncate(path: Buffer, len: Number = definedExternally): Promise<Unit>

external fun truncate(path: Buffer): Promise<Unit>

external fun truncate(path: URL, len: Number = definedExternally): Promise<Unit>

external fun truncate(path: URL): Promise<Unit>

external fun ftruncate(handle: FileHandle, len: Number = definedExternally): Promise<Unit>

external fun rmdir(path: String, options: RmDirOptions = definedExternally): Promise<Unit>

external fun rmdir(path: String): Promise<Unit>

external fun rmdir(path: Buffer, options: RmDirOptions = definedExternally): Promise<Unit>

external fun rmdir(path: Buffer): Promise<Unit>

external fun rmdir(path: URL, options: RmDirOptions = definedExternally): Promise<Unit>

external fun rmdir(path: URL): Promise<Unit>

external fun rm(path: String, options: RmOptions = definedExternally): Promise<Unit>

external fun rm(path: String): Promise<Unit>

external fun rm(path: Buffer, options: RmOptions = definedExternally): Promise<Unit>

external fun rm(path: Buffer): Promise<Unit>

external fun rm(path: URL, options: RmOptions = definedExternally): Promise<Unit>

external fun rm(path: URL): Promise<Unit>

external fun fdatasync(handle: FileHandle): Promise<Unit>

external fun fsync(handle: FileHandle): Promise<Unit>

external fun mkdir(path: String, options: MakeDirectoryOptions /* MakeDirectoryOptions & `T$33` | MakeDirectoryOptions & `T$34` */): dynamic /* Promise | Promise */

external fun mkdir(path: Buffer, options: MakeDirectoryOptions /* MakeDirectoryOptions & `T$33` | MakeDirectoryOptions & `T$34` */): dynamic /* Promise | Promise */

external fun mkdir(path: URL, options: MakeDirectoryOptions /* MakeDirectoryOptions & `T$33` | MakeDirectoryOptions & `T$34` */): dynamic /* Promise | Promise */

external fun mkdir(path: String, options: Number? = definedExternally): dynamic /* Promise | Promise */

external fun mkdir(path: String): dynamic /* Promise */

external fun mkdir(path: String, options: String? = definedExternally): dynamic /* Promise | Promise */

external fun mkdir(path: Buffer, options: Number? = definedExternally): dynamic /* Promise | Promise */

external fun mkdir(path: Buffer): dynamic /* Promise */

external fun mkdir(path: Buffer, options: String? = definedExternally): dynamic /* Promise | Promise */

external fun mkdir(path: URL, options: Number? = definedExternally): dynamic /* Promise | Promise */

external fun mkdir(path: URL): dynamic /* Promise */

external fun mkdir(path: URL, options: String? = definedExternally): dynamic /* Promise | Promise */

external fun mkdir(path: String, options: MakeDirectoryOptions? = definedExternally): Promise<String?>

external fun mkdir(path: Buffer, options: MakeDirectoryOptions? = definedExternally): Promise<String?>

external fun mkdir(path: URL, options: MakeDirectoryOptions? = definedExternally): Promise<String?>

external fun readdir(path: String, options: Any? /* BaseEncodingOptions & `T$37` | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): dynamic /* Promise | Promise */

external fun readdir(path: String): dynamic /* Promise | Promise */

external fun readdir(path: Buffer, options: Any? /* BaseEncodingOptions & `T$37` | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): dynamic /* Promise | Promise */

external fun readdir(path: Buffer): dynamic /* Promise | Promise */

external fun readdir(path: URL, options: Any? /* BaseEncodingOptions & `T$37` | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): dynamic /* Promise | Promise */

external fun readdir(path: URL): dynamic /* Promise | Promise */

external fun readdir(path: String, options: `T$36`): Promise<Array<Buffer>>

external fun readdir(path: String, options: String /* "buffer" */): Promise<Array<Buffer>>

external fun readdir(path: Buffer, options: `T$36`): Promise<Array<Buffer>>

external fun readdir(path: Buffer, options: String /* "buffer" */): Promise<Array<Buffer>>

external fun readdir(path: URL, options: `T$36`): Promise<Array<Buffer>>

external fun readdir(path: URL, options: String /* "buffer" */): Promise<Array<Buffer>>

external fun readdir(path: String, options: BaseEncodingOptions /* BaseEncodingOptions & `T$38` */): Promise<Array<Dirent>>

external fun readdir(path: Buffer, options: BaseEncodingOptions /* BaseEncodingOptions & `T$38` */): Promise<Array<Dirent>>

external fun readdir(path: URL, options: BaseEncodingOptions /* BaseEncodingOptions & `T$38` */): Promise<Array<Dirent>>

external fun readlink(path: String, options: Any? /* BaseEncodingOptions? | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Promise<String>

external fun readlink(path: String): dynamic /* Promise */

external fun readlink(path: Buffer, options: Any? /* BaseEncodingOptions? | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Promise<String>

external fun readlink(path: Buffer): dynamic /* Promise */

external fun readlink(path: URL, options: Any? /* BaseEncodingOptions? | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Promise<String>

external fun readlink(path: URL): dynamic /* Promise */

external fun readlink(path: String, options: String /* "buffer" */): Promise<Buffer>

external fun readlink(path: String, options: `T$30`): Promise<Buffer>

external fun readlink(path: Buffer, options: String /* "buffer" */): Promise<Buffer>

external fun readlink(path: Buffer, options: `T$30`): Promise<Buffer>

external fun readlink(path: URL, options: String /* "buffer" */): Promise<Buffer>

external fun readlink(path: URL, options: `T$30`): Promise<Buffer>

external fun readlink(path: String, options: BaseEncodingOptions? = definedExternally): Promise<dynamic /* String | Buffer */>

external fun readlink(path: String, options: String? = definedExternally): Promise<dynamic /* String | Buffer */>

external fun readlink(path: Buffer, options: BaseEncodingOptions? = definedExternally): Promise<dynamic /* String | Buffer */>

external fun readlink(path: Buffer, options: String? = definedExternally): Promise<dynamic /* String | Buffer */>

external fun readlink(path: URL, options: BaseEncodingOptions? = definedExternally): Promise<dynamic /* String | Buffer */>

external fun readlink(path: URL, options: String? = definedExternally): Promise<dynamic /* String | Buffer */>

external fun symlink(target: String, path: String, type: String? = definedExternally): Promise<Unit>

external fun symlink(target: String, path: String): Promise<Unit>

external fun symlink(target: String, path: Buffer, type: String? = definedExternally): Promise<Unit>

external fun symlink(target: String, path: Buffer): Promise<Unit>

external fun symlink(target: String, path: URL, type: String? = definedExternally): Promise<Unit>

external fun symlink(target: String, path: URL): Promise<Unit>

external fun symlink(target: Buffer, path: String, type: String? = definedExternally): Promise<Unit>

external fun symlink(target: Buffer, path: String): Promise<Unit>

external fun symlink(target: Buffer, path: Buffer, type: String? = definedExternally): Promise<Unit>

external fun symlink(target: Buffer, path: Buffer): Promise<Unit>

external fun symlink(target: Buffer, path: URL, type: String? = definedExternally): Promise<Unit>

external fun symlink(target: Buffer, path: URL): Promise<Unit>

external fun symlink(target: URL, path: String, type: String? = definedExternally): Promise<Unit>

external fun symlink(target: URL, path: String): Promise<Unit>

external fun symlink(target: URL, path: Buffer, type: String? = definedExternally): Promise<Unit>

external fun symlink(target: URL, path: Buffer): Promise<Unit>

external fun symlink(target: URL, path: URL, type: String? = definedExternally): Promise<Unit>

external fun symlink(target: URL, path: URL): Promise<Unit>

external fun lstat(path: String, opts: StatOptions /* StatOptions & `T$31` | StatOptions & `T$32` */ = definedExternally): dynamic /* Promise */

external fun lstat(path: String): dynamic /* Promise | Promise */

external fun lstat(path: Buffer, opts: StatOptions /* StatOptions & `T$31` | StatOptions & `T$32` */ = definedExternally): dynamic /* Promise */

external fun lstat(path: Buffer): dynamic /* Promise | Promise */

external fun lstat(path: URL, opts: StatOptions /* StatOptions & `T$31` | StatOptions & `T$32` */ = definedExternally): dynamic /* Promise */

external fun lstat(path: URL): dynamic /* Promise | Promise */

external fun stat(path: String, opts: StatOptions /* StatOptions & `T$31` | StatOptions & `T$32` */ = definedExternally): dynamic /* Promise */

external fun stat(path: String): dynamic /* Promise | Promise */

external fun stat(path: Buffer, opts: StatOptions /* StatOptions & `T$31` | StatOptions & `T$32` */ = definedExternally): dynamic /* Promise */

external fun stat(path: Buffer): dynamic /* Promise | Promise */

external fun stat(path: URL, opts: StatOptions /* StatOptions & `T$31` | StatOptions & `T$32` */ = definedExternally): dynamic /* Promise */

external fun stat(path: URL): dynamic /* Promise | Promise */

external fun link(existingPath: String, newPath: String): Promise<Unit>

external fun link(existingPath: String, newPath: Buffer): Promise<Unit>

external fun link(existingPath: String, newPath: URL): Promise<Unit>

external fun link(existingPath: Buffer, newPath: String): Promise<Unit>

external fun link(existingPath: Buffer, newPath: Buffer): Promise<Unit>

external fun link(existingPath: Buffer, newPath: URL): Promise<Unit>

external fun link(existingPath: URL, newPath: String): Promise<Unit>

external fun link(existingPath: URL, newPath: Buffer): Promise<Unit>

external fun link(existingPath: URL, newPath: URL): Promise<Unit>

external fun unlink(path: String): Promise<Unit>

external fun unlink(path: Buffer): Promise<Unit>

external fun unlink(path: URL): Promise<Unit>

external fun fchmod(handle: FileHandle, mode: Number): Promise<Unit>

external fun fchmod(handle: FileHandle, mode: String): Promise<Unit>

external fun chmod(path: String, mode: Number): Promise<Unit>

external fun chmod(path: String, mode: String): Promise<Unit>

external fun chmod(path: Buffer, mode: Number): Promise<Unit>

external fun chmod(path: Buffer, mode: String): Promise<Unit>

external fun chmod(path: URL, mode: Number): Promise<Unit>

external fun chmod(path: URL, mode: String): Promise<Unit>

external fun lchmod(path: String, mode: Number): Promise<Unit>

external fun lchmod(path: String, mode: String): Promise<Unit>

external fun lchmod(path: Buffer, mode: Number): Promise<Unit>

external fun lchmod(path: Buffer, mode: String): Promise<Unit>

external fun lchmod(path: URL, mode: Number): Promise<Unit>

external fun lchmod(path: URL, mode: String): Promise<Unit>

external fun lchown(path: String, uid: Number, gid: Number): Promise<Unit>

external fun lchown(path: Buffer, uid: Number, gid: Number): Promise<Unit>

external fun lchown(path: URL, uid: Number, gid: Number): Promise<Unit>

external fun lutimes(path: String, atime: String, mtime: Any /* String | Number | Date */): Promise<Unit>

external fun lutimes(path: String, atime: Number, mtime: Any /* String | Number | Date */): Promise<Unit>

external fun lutimes(path: String, atime: Date, mtime: Any /* String | Number | Date */): Promise<Unit>

external fun lutimes(path: Buffer, atime: String, mtime: Any /* String | Number | Date */): Promise<Unit>

external fun lutimes(path: Buffer, atime: Number, mtime: Any /* String | Number | Date */): Promise<Unit>

external fun lutimes(path: Buffer, atime: Date, mtime: Any /* String | Number | Date */): Promise<Unit>

external fun lutimes(path: URL, atime: String, mtime: Any /* String | Number | Date */): Promise<Unit>

external fun lutimes(path: URL, atime: Number, mtime: Any /* String | Number | Date */): Promise<Unit>

external fun lutimes(path: URL, atime: Date, mtime: Any /* String | Number | Date */): Promise<Unit>

external fun fchown(handle: FileHandle, uid: Number, gid: Number): Promise<Unit>

external fun chown(path: String, uid: Number, gid: Number): Promise<Unit>

external fun chown(path: Buffer, uid: Number, gid: Number): Promise<Unit>

external fun chown(path: URL, uid: Number, gid: Number): Promise<Unit>

external fun utimes(path: String, atime: String, mtime: Any /* String | Number | Date */): Promise<Unit>

external fun utimes(path: String, atime: Number, mtime: Any /* String | Number | Date */): Promise<Unit>

external fun utimes(path: String, atime: Date, mtime: Any /* String | Number | Date */): Promise<Unit>

external fun utimes(path: Buffer, atime: String, mtime: Any /* String | Number | Date */): Promise<Unit>

external fun utimes(path: Buffer, atime: Number, mtime: Any /* String | Number | Date */): Promise<Unit>

external fun utimes(path: Buffer, atime: Date, mtime: Any /* String | Number | Date */): Promise<Unit>

external fun utimes(path: URL, atime: String, mtime: Any /* String | Number | Date */): Promise<Unit>

external fun utimes(path: URL, atime: Number, mtime: Any /* String | Number | Date */): Promise<Unit>

external fun utimes(path: URL, atime: Date, mtime: Any /* String | Number | Date */): Promise<Unit>

external fun futimes(handle: FileHandle, atime: String, mtime: String): Promise<Unit>

external fun futimes(handle: FileHandle, atime: String, mtime: Number): Promise<Unit>

external fun futimes(handle: FileHandle, atime: String, mtime: Date): Promise<Unit>

external fun futimes(handle: FileHandle, atime: Number, mtime: String): Promise<Unit>

external fun futimes(handle: FileHandle, atime: Number, mtime: Number): Promise<Unit>

external fun futimes(handle: FileHandle, atime: Number, mtime: Date): Promise<Unit>

external fun futimes(handle: FileHandle, atime: Date, mtime: String): Promise<Unit>

external fun futimes(handle: FileHandle, atime: Date, mtime: Number): Promise<Unit>

external fun futimes(handle: FileHandle, atime: Date, mtime: Date): Promise<Unit>

external fun realpath(path: String, options: Any? /* BaseEncodingOptions? | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): dynamic /* Promise | Promise */

external fun realpath(path: String): dynamic /* Promise | Promise */

external fun realpath(path: Buffer, options: Any? /* BaseEncodingOptions? | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): dynamic /* Promise | Promise */

external fun realpath(path: Buffer): dynamic /* Promise | Promise */

external fun realpath(path: URL, options: Any? /* BaseEncodingOptions? | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): dynamic /* Promise | Promise */

external fun realpath(path: URL): dynamic /* Promise | Promise */

external fun realpath(path: String, options: String /* "buffer" */): Promise<Buffer>

external fun realpath(path: String, options: `T$30`): Promise<Buffer>

external fun realpath(path: Buffer, options: String /* "buffer" */): Promise<Buffer>

external fun realpath(path: Buffer, options: `T$30`): Promise<Buffer>

external fun realpath(path: URL, options: String /* "buffer" */): Promise<Buffer>

external fun realpath(path: URL, options: `T$30`): Promise<Buffer>

external fun mkdtemp(prefix: String, options: BaseEncodingOptions? = definedExternally): dynamic /* Promise | Promise */

external fun mkdtemp(prefix: String): dynamic /* Promise */

external fun mkdtemp(prefix: String, options: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" | "buffer" | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): dynamic /* Promise */

external fun mkdtemp(prefix: String, options: `T$30`): Promise<Buffer>

external fun writeFile(path: String, data: String, options: Any? /* BaseEncodingOptions & `T$64` | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Promise<Unit>

external fun writeFile(path: String, data: String): Promise<Unit>

external fun writeFile(path: String, data: Uint8Array, options: Any? /* BaseEncodingOptions & `T$64` | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Promise<Unit>

external fun writeFile(path: String, data: Uint8Array): Promise<Unit>

external fun writeFile(path: Buffer, data: String, options: Any? /* BaseEncodingOptions & `T$64` | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Promise<Unit>

external fun writeFile(path: Buffer, data: String): Promise<Unit>

external fun writeFile(path: Buffer, data: Uint8Array, options: Any? /* BaseEncodingOptions & `T$64` | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Promise<Unit>

external fun writeFile(path: Buffer, data: Uint8Array): Promise<Unit>

external fun writeFile(path: URL, data: String, options: Any? /* BaseEncodingOptions & `T$64` | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Promise<Unit>

external fun writeFile(path: URL, data: String): Promise<Unit>

external fun writeFile(path: URL, data: Uint8Array, options: Any? /* BaseEncodingOptions & `T$64` | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Promise<Unit>

external fun writeFile(path: URL, data: Uint8Array): Promise<Unit>

external fun writeFile(path: FileHandle, data: String, options: Any? /* BaseEncodingOptions & `T$64` | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Promise<Unit>

external fun writeFile(path: FileHandle, data: String): Promise<Unit>

external fun writeFile(path: FileHandle, data: Uint8Array, options: Any? /* BaseEncodingOptions & `T$64` | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Promise<Unit>

external fun writeFile(path: FileHandle, data: Uint8Array): Promise<Unit>

external fun appendFile(path: String, data: String, options: Any? /* BaseEncodingOptions & `T$64` | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Promise<Unit>

external fun appendFile(path: String, data: String): Promise<Unit>

external fun appendFile(path: String, data: Uint8Array, options: Any? /* BaseEncodingOptions & `T$64` | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Promise<Unit>

external fun appendFile(path: String, data: Uint8Array): Promise<Unit>

external fun appendFile(path: Buffer, data: String, options: Any? /* BaseEncodingOptions & `T$64` | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Promise<Unit>

external fun appendFile(path: Buffer, data: String): Promise<Unit>

external fun appendFile(path: Buffer, data: Uint8Array, options: Any? /* BaseEncodingOptions & `T$64` | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Promise<Unit>

external fun appendFile(path: Buffer, data: Uint8Array): Promise<Unit>

external fun appendFile(path: URL, data: String, options: Any? /* BaseEncodingOptions & `T$64` | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Promise<Unit>

external fun appendFile(path: URL, data: String): Promise<Unit>

external fun appendFile(path: URL, data: Uint8Array, options: Any? /* BaseEncodingOptions & `T$64` | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Promise<Unit>

external fun appendFile(path: URL, data: Uint8Array): Promise<Unit>

external fun appendFile(path: FileHandle, data: String, options: Any? /* BaseEncodingOptions & `T$64` | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Promise<Unit>

external fun appendFile(path: FileHandle, data: String): Promise<Unit>

external fun appendFile(path: FileHandle, data: Uint8Array, options: Any? /* BaseEncodingOptions & `T$64` | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Promise<Unit>

external fun appendFile(path: FileHandle, data: Uint8Array): Promise<Unit>

external fun readFile(path: String, options: `T$65`? = definedExternally): Promise<Buffer>

external fun readFile(path: String): dynamic /* Promise | Promise */

external fun readFile(path: Buffer, options: `T$65`? = definedExternally): Promise<Buffer>

external fun readFile(path: Buffer): dynamic /* Promise | Promise */

external fun readFile(path: URL, options: `T$65`? = definedExternally): Promise<Buffer>

external fun readFile(path: URL): dynamic /* Promise | Promise */

external fun readFile(path: FileHandle, options: `T$65`? = definedExternally): Promise<Buffer>

external fun readFile(path: FileHandle): dynamic /* Promise | Promise */

external fun readFile(path: String, options: Any /* `T$66` | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */): Promise<String>

external fun readFile(path: Buffer, options: Any /* `T$66` | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */): Promise<String>

external fun readFile(path: URL, options: Any /* `T$66` | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */): Promise<String>

external fun readFile(path: FileHandle, options: Any /* `T$66` | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */): Promise<String>

external fun readFile(path: String, options: Any? /* BaseEncodingOptions & `T$67` | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Promise<dynamic /* String | Buffer */>

external fun readFile(path: Buffer, options: Any? /* BaseEncodingOptions & `T$67` | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Promise<dynamic /* String | Buffer */>

external fun readFile(path: URL, options: Any? /* BaseEncodingOptions & `T$67` | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Promise<dynamic /* String | Buffer */>

external fun readFile(path: FileHandle, options: Any? /* BaseEncodingOptions & `T$67` | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Promise<dynamic /* String | Buffer */>

external fun opendir(path: String, options: OpenDirOptions = definedExternally): Promise<Dir>