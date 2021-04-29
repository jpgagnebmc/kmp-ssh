@file:JsQualifier("fs.writeFile")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package fs.writeFile

import kotlin.js.*
import Buffer
import url.URL

external fun __promisify__(path: String, data: Any /* String | Uint8Array | Uint8ClampedArray | Uint16Array | Uint32Array | Int8Array | Int16Array | Int32Array | BigUint64Array | BigInt64Array | Float32Array | Float64Array | DataView */, options: Any? /* BaseEncodingOptions & `T$45` | String? */ = definedExternally): Promise<Unit>

external fun __promisify__(path: String, data: Any /* String | Uint8Array | Uint8ClampedArray | Uint16Array | Uint32Array | Int8Array | Int16Array | Int32Array | BigUint64Array | BigInt64Array | Float32Array | Float64Array | DataView */): Promise<Unit>

external fun __promisify__(path: Buffer, data: Any /* String | Uint8Array | Uint8ClampedArray | Uint16Array | Uint32Array | Int8Array | Int16Array | Int32Array | BigUint64Array | BigInt64Array | Float32Array | Float64Array | DataView */, options: Any? /* BaseEncodingOptions & `T$45` | String? */ = definedExternally): Promise<Unit>

external fun __promisify__(path: Buffer, data: Any /* String | Uint8Array | Uint8ClampedArray | Uint16Array | Uint32Array | Int8Array | Int16Array | Int32Array | BigUint64Array | BigInt64Array | Float32Array | Float64Array | DataView */): Promise<Unit>

external fun __promisify__(path: URL, data: Any /* String | Uint8Array | Uint8ClampedArray | Uint16Array | Uint32Array | Int8Array | Int16Array | Int32Array | BigUint64Array | BigInt64Array | Float32Array | Float64Array | DataView */, options: Any? /* BaseEncodingOptions & `T$45` | String? */ = definedExternally): Promise<Unit>

external fun __promisify__(path: URL, data: Any /* String | Uint8Array | Uint8ClampedArray | Uint16Array | Uint32Array | Int8Array | Int16Array | Int32Array | BigUint64Array | BigInt64Array | Float32Array | Float64Array | DataView */): Promise<Unit>

external fun __promisify__(path: Number, data: Any /* String | Uint8Array | Uint8ClampedArray | Uint16Array | Uint32Array | Int8Array | Int16Array | Int32Array | BigUint64Array | BigInt64Array | Float32Array | Float64Array | DataView */, options: Any? /* BaseEncodingOptions & `T$45` | String? */ = definedExternally): Promise<Unit>

external fun __promisify__(path: Number, data: Any /* String | Uint8Array | Uint8ClampedArray | Uint16Array | Uint32Array | Int8Array | Int16Array | Int32Array | BigUint64Array | BigInt64Array | Float32Array | Float64Array | DataView */): Promise<Unit>