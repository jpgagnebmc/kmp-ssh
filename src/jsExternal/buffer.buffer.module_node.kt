@file:JsModule("buffer")
@file:JsNonModule
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package buffer

import kotlin.js.*
import org.khronos.webgl.*
import Buffer

external var INSPECT_MAX_BYTES: Number

external var kMaxLength: Number

external var kStringMaxLength: Number

external object constants {
    var MAX_LENGTH: Number
    var MAX_STRING_LENGTH: Number
}

external var BuffType: Any

external fun transcode(source: Uint8Array, fromEnc: String /* "ascii" | "utf8" | "utf16le" | "ucs2" | "latin1" | "binary" */, toEnc: String /* "ascii" | "utf8" | "utf16le" | "ucs2" | "latin1" | "binary" */): Buffer

external object SlowBuffer {
    var prototype: Buffer
}