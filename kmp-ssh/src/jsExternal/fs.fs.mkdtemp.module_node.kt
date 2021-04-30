@file:JsQualifier("fs.mkdtemp")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package fs.mkdtemp

import kotlin.js.*
import fs.BaseEncodingOptions
import fs.`T$30`
import Buffer

external fun __promisify__(prefix: String, options: BaseEncodingOptions? = definedExternally): dynamic /* Promise | Promise */

external fun __promisify__(prefix: String): dynamic /* Promise */

external fun __promisify__(prefix: String, options: String /* "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" | "buffer" */ = definedExternally): dynamic /* Promise | Promise */

external fun __promisify__(prefix: String, options: `T$30`): Promise<Buffer>

external fun __promisify__(prefix: String, options: String? = definedExternally): Promise<dynamic /* String | Buffer */>