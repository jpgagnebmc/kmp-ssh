@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")

import kotlin.js.*
import org.khronos.webgl.*
import NodeJS.Require
import NodeJS.Module
import process.global.NodeJS.Process
import NodeJS.Timeout
import NodeJS.Immediate
import tsstdlib.IterableIterator

external interface NodeRequire : Require

external interface RequireResolve : NodeJS.RequireResolve

external interface NodeModule : Module

@JsModule("getProcess")
external val process: Process

@JsModule("getConsole")
external val console: Console

external var __filename: String

external var __dirname: String

external fun setTimeout(callback: (args: Any) -> Unit, ms: Number = definedExternally, vararg args: Any): Timeout

external fun clearTimeout(timeoutId: Timeout)

external fun setInterval(callback: (args: Any) -> Unit, ms: Number = definedExternally, vararg args: Any): Timeout

external fun clearInterval(intervalId: Timeout)

external fun setImmediate(callback: (args: Any) -> Unit, vararg args: Any): Immediate

external fun clearImmediate(immediateId: Immediate)

external fun queueMicrotask(callback: () -> Unit)

external var require: NodeRequire

external var module: NodeModule

external var exports: Any

external interface `T$18`<T> {
    fun valueOf(): T
}

external interface `T$7` {
    var type: String /* "Buffer" */
    var data: Array<Number>
}

external open class Buffer : Uint8Array {
    constructor(str: String, encoding: String = definedExternally)
    constructor(str: String)
    constructor(size: Number)
    constructor(array: Uint8Array)
    constructor(arrayBuffer: ArrayBuffer)
    constructor(arrayBuffer: SharedArrayBuffer)
    constructor(array: Array<Any>)
    constructor(buffer: Buffer)
    open fun write(string: String, encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Number
    open fun write(string: String): Number
    open fun write(string: String, offset: Number, encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Number
    open fun write(string: String, offset: Number): Number
    open fun write(string: String, offset: Number, length: Number, encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Number
    open fun write(string: String, offset: Number, length: Number): Number
    open fun toString(encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally, start: Number = definedExternally, end: Number = definedExternally): String
    open fun toJSON(): `T$7`
    open fun equals(otherBuffer: Uint8Array): Boolean
    open fun compare(otherBuffer: Uint8Array, targetStart: Number = definedExternally, targetEnd: Number = definedExternally, sourceStart: Number = definedExternally, sourceEnd: Number = definedExternally): Number
    open fun copy(targetBuffer: Uint8Array, targetStart: Number = definedExternally, sourceStart: Number = definedExternally, sourceEnd: Number = definedExternally): Number
    open fun slice(begin: Number = definedExternally, end: Number = definedExternally): Buffer
    open fun subarray(begin: Number = definedExternally, end: Number = definedExternally): Buffer
    open fun writeBigInt64BE(value: Any, offset: Number = definedExternally): Number
    open fun writeBigInt64LE(value: Any, offset: Number = definedExternally): Number
    open fun writeBigUInt64BE(value: Any, offset: Number = definedExternally): Number
    open fun writeBigUInt64LE(value: Any, offset: Number = definedExternally): Number
    open fun writeUIntLE(value: Number, offset: Number, byteLength: Number): Number
    open fun writeUIntBE(value: Number, offset: Number, byteLength: Number): Number
    open fun writeIntLE(value: Number, offset: Number, byteLength: Number): Number
    open fun writeIntBE(value: Number, offset: Number, byteLength: Number): Number
    open fun readBigUInt64BE(offset: Number = definedExternally): Any
    open fun readBigUInt64LE(offset: Number = definedExternally): Any
    open fun readBigInt64BE(offset: Number = definedExternally): Any
    open fun readBigInt64LE(offset: Number = definedExternally): Any
    open fun readUIntLE(offset: Number, byteLength: Number): Number
    open fun readUIntBE(offset: Number, byteLength: Number): Number
    open fun readIntLE(offset: Number, byteLength: Number): Number
    open fun readIntBE(offset: Number, byteLength: Number): Number
    open fun readUInt8(offset: Number = definedExternally): Number
    open fun readUInt16LE(offset: Number = definedExternally): Number
    open fun readUInt16BE(offset: Number = definedExternally): Number
    open fun readUInt32LE(offset: Number = definedExternally): Number
    open fun readUInt32BE(offset: Number = definedExternally): Number
    open fun readInt8(offset: Number = definedExternally): Number
    open fun readInt16LE(offset: Number = definedExternally): Number
    open fun readInt16BE(offset: Number = definedExternally): Number
    open fun readInt32LE(offset: Number = definedExternally): Number
    open fun readInt32BE(offset: Number = definedExternally): Number
    open fun readFloatLE(offset: Number = definedExternally): Number
    open fun readFloatBE(offset: Number = definedExternally): Number
    open fun readDoubleLE(offset: Number = definedExternally): Number
    open fun readDoubleBE(offset: Number = definedExternally): Number
    open fun reverse(): Buffer /* this */
    open fun swap16(): Buffer
    open fun swap32(): Buffer
    open fun swap64(): Buffer
    open fun writeUInt8(value: Number, offset: Number = definedExternally): Number
    open fun writeUInt16LE(value: Number, offset: Number = definedExternally): Number
    open fun writeUInt16BE(value: Number, offset: Number = definedExternally): Number
    open fun writeUInt32LE(value: Number, offset: Number = definedExternally): Number
    open fun writeUInt32BE(value: Number, offset: Number = definedExternally): Number
    open fun writeInt8(value: Number, offset: Number = definedExternally): Number
    open fun writeInt16LE(value: Number, offset: Number = definedExternally): Number
    open fun writeInt16BE(value: Number, offset: Number = definedExternally): Number
    open fun writeInt32LE(value: Number, offset: Number = definedExternally): Number
    open fun writeInt32BE(value: Number, offset: Number = definedExternally): Number
    open fun writeFloatLE(value: Number, offset: Number = definedExternally): Number
    open fun writeFloatBE(value: Number, offset: Number = definedExternally): Number
    open fun writeDoubleLE(value: Number, offset: Number = definedExternally): Number
    open fun writeDoubleBE(value: Number, offset: Number = definedExternally): Number
    open fun fill(value: String, offset: Number = definedExternally, end: Number = definedExternally, encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Buffer /* this */
    open fun fill(value: String): Buffer /* this */
    open fun fill(value: String, offset: Number = definedExternally): Buffer /* this */
    open fun fill(value: String, offset: Number = definedExternally, end: Number = definedExternally): Buffer /* this */
    open fun fill(value: Uint8Array, offset: Number = definedExternally, end: Number = definedExternally, encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Buffer /* this */
    open fun fill(value: Uint8Array): Buffer /* this */
    open fun fill(value: Uint8Array, offset: Number = definedExternally): Buffer /* this */
    open fun fill(value: Uint8Array, offset: Number = definedExternally, end: Number = definedExternally): Buffer /* this */
    open fun fill(value: Number, offset: Number = definedExternally, end: Number = definedExternally, encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Buffer /* this */
    open fun fill(value: Number): Buffer /* this */
    open fun fill(value: Number, offset: Number = definedExternally): Buffer /* this */
    open fun fill(value: Number, offset: Number = definedExternally, end: Number = definedExternally): Buffer /* this */
    open fun indexOf(value: String, byteOffset: Number = definedExternally, encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Number
    open fun indexOf(value: String): Number
    open fun indexOf(value: String, byteOffset: Number = definedExternally): Number
    open fun indexOf(value: Number, byteOffset: Number = definedExternally, encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Number
    open fun indexOf(value: Number): Number
    open fun indexOf(value: Number, byteOffset: Number = definedExternally): Number
    open fun indexOf(value: Uint8Array, byteOffset: Number = definedExternally, encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Number
    open fun indexOf(value: Uint8Array): Number
    open fun indexOf(value: Uint8Array, byteOffset: Number = definedExternally): Number
    open fun lastIndexOf(value: String, byteOffset: Number = definedExternally, encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Number
    open fun lastIndexOf(value: String): Number
    open fun lastIndexOf(value: String, byteOffset: Number = definedExternally): Number
    open fun lastIndexOf(value: Number, byteOffset: Number = definedExternally, encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Number
    open fun lastIndexOf(value: Number): Number
    open fun lastIndexOf(value: Number, byteOffset: Number = definedExternally): Number
    open fun lastIndexOf(value: Uint8Array, byteOffset: Number = definedExternally, encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Number
    open fun lastIndexOf(value: Uint8Array): Number
    open fun lastIndexOf(value: Uint8Array, byteOffset: Number = definedExternally): Number
    open fun entries(): IterableIterator<dynamic /* JsTuple<Number, Number> */>
    open fun includes(value: String, byteOffset: Number = definedExternally, encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Boolean
    open fun includes(value: String): Boolean
    open fun includes(value: String, byteOffset: Number = definedExternally): Boolean
    open fun includes(value: Number, byteOffset: Number = definedExternally, encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Boolean
    open fun includes(value: Number): Boolean
    open fun includes(value: Number, byteOffset: Number = definedExternally): Boolean
    open fun includes(value: Buffer, byteOffset: Number = definedExternally, encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Boolean
    open fun includes(value: Buffer): Boolean
    open fun includes(value: Buffer, byteOffset: Number = definedExternally): Boolean
    open fun keys(): IterableIterator<Number>
    open fun values(): IterableIterator<Number>

    companion object {
        fun from(arrayBuffer: ArrayBuffer, byteOffset: Number = definedExternally, length: Number = definedExternally): Buffer
        fun from(arrayBuffer: SharedArrayBuffer, byteOffset: Number = definedExternally, length: Number = definedExternally): Buffer
        fun from(arrayBuffer: `T$18`<Any /* ArrayBuffer | SharedArrayBuffer */>, byteOffset: Number = definedExternally, length: Number = definedExternally): Buffer
        fun from(data: Uint8Array): Buffer
        fun from(data: Array<Number>): Buffer
        fun from(data: String): Buffer
        fun from(data: `T$18`<Any /* Uint8Array | ReadonlyArray<Number> | String */>): Buffer
        fun from(str: String, encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Buffer
        fun from(str: `T$18`<String>, encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Buffer
        fun from(str: Any, encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Buffer
        fun of(vararg items: Number): Buffer
        fun isBuffer(obj: Any): Boolean
        fun isEncoding(encoding: String): Boolean
        fun byteLength(string: String, encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Number
        fun byteLength(string: Uint8Array, encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Number
        fun byteLength(string: Uint8ClampedArray, encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Number
        fun byteLength(string: Uint16Array, encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Number
        fun byteLength(string: Uint32Array, encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Number
        fun byteLength(string: Int8Array, encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Number
        fun byteLength(string: Int16Array, encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Number
        fun byteLength(string: Int32Array, encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Number
        fun byteLength(string: BigUint64Array, encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Number
        fun byteLength(string: BigInt64Array, encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Number
        fun byteLength(string: Float32Array, encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Number
        fun byteLength(string: Float64Array, encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Number
        fun byteLength(string: DataView, encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Number
        fun byteLength(string: ArrayBuffer, encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Number
        fun byteLength(string: SharedArrayBuffer, encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Number
        fun concat(list: Array<Uint8Array>, totalLength: Number = definedExternally): Buffer
        fun compare(buf1: Uint8Array, buf2: Uint8Array): Number
        fun alloc(size: Number, fill: String = definedExternally, encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Buffer
        fun alloc(size: Number, fill: Buffer = definedExternally, encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Buffer
        fun alloc(size: Number, fill: Number = definedExternally, encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Buffer
        fun allocUnsafe(size: Number): Buffer
        fun allocUnsafeSlow(size: Number): Buffer
        var poolSize: Number
    }
}