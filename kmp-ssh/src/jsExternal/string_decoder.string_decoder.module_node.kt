@file:JsModule("string_decoder")
@file:JsNonModule
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package string_decoder

import kotlin.js.*
import Buffer

external open class StringDecoder(encoding: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally) {
    open fun write(buffer: Buffer): String
    open fun end(buffer: Buffer = definedExternally): String
}