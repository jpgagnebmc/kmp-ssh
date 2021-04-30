@file:JsQualifier("fs.realpathSync")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package fs.realpathSync

import kotlin.js.*
import Buffer
import url.URL
import fs.`T$30`
import fs.BaseEncodingOptions

external fun native(path: String, options: Any? /* BaseEncodingOptions? | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): String

external fun native(path: String): dynamic /* String | String | Buffer */

external fun native(path: Buffer, options: Any? /* BaseEncodingOptions? | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): String

external fun native(path: Buffer): dynamic /* String | String | Buffer */

external fun native(path: URL, options: Any? /* BaseEncodingOptions? | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): String

external fun native(path: URL): dynamic /* String | String | Buffer */

external fun native(path: String, options: String /* "buffer" */): Buffer

external fun native(path: String, options: `T$30`): Buffer

external fun native(path: Buffer, options: String /* "buffer" */): Buffer

external fun native(path: Buffer, options: `T$30`): Buffer

external fun native(path: URL, options: String /* "buffer" */): Buffer

external fun native(path: URL, options: `T$30`): Buffer

external fun native(path: String, options: BaseEncodingOptions? = definedExternally): dynamic /* String | Buffer */

external fun native(path: String, options: String? = definedExternally): dynamic /* String | Buffer */

external fun native(path: Buffer, options: BaseEncodingOptions? = definedExternally): dynamic /* String | Buffer */

external fun native(path: Buffer, options: String? = definedExternally): dynamic /* String | Buffer */

external fun native(path: URL, options: BaseEncodingOptions? = definedExternally): dynamic /* String | Buffer */

external fun native(path: URL, options: String? = definedExternally): dynamic /* String | Buffer */