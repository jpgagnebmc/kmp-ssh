@file:JsQualifier("fs.readdir")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package fs.readdir

import kotlin.js.*
import Buffer
import url.URL
import fs.`T$36`
import fs.BaseEncodingOptions
import fs.Dirent

external fun __promisify__(path: String, options: Any? /* `T$35`? | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" | BaseEncodingOptions & `T$37` | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): dynamic /* Promise | Promise */

external fun __promisify__(path: String): dynamic /* Promise | Promise */

external fun __promisify__(path: Buffer, options: Any? /* `T$35`? | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" | BaseEncodingOptions & `T$37` | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): dynamic /* Promise | Promise */

external fun __promisify__(path: Buffer): dynamic /* Promise | Promise */

external fun __promisify__(path: URL, options: Any? /* `T$35`? | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" | BaseEncodingOptions & `T$37` | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): dynamic /* Promise | Promise */

external fun __promisify__(path: URL): dynamic /* Promise | Promise */

external fun __promisify__(path: String, options: String /* "buffer" */): Promise<Array<Buffer>>

external fun __promisify__(path: String, options: `T$36`): Promise<Array<Buffer>>

external fun __promisify__(path: Buffer, options: String /* "buffer" */): Promise<Array<Buffer>>

external fun __promisify__(path: Buffer, options: `T$36`): Promise<Array<Buffer>>

external fun __promisify__(path: URL, options: String /* "buffer" */): Promise<Array<Buffer>>

external fun __promisify__(path: URL, options: `T$36`): Promise<Array<Buffer>>

external fun __promisify__(path: String, options: BaseEncodingOptions /* BaseEncodingOptions & `T$38` */): Promise<Array<Dirent>>

external fun __promisify__(path: Buffer, options: BaseEncodingOptions /* BaseEncodingOptions & `T$38` */): Promise<Array<Dirent>>

external fun __promisify__(path: URL, options: BaseEncodingOptions /* BaseEncodingOptions & `T$38` */): Promise<Array<Dirent>>