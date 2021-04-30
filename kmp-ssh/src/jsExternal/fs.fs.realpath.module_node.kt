@file:JsQualifier("fs.realpath")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package fs.realpath

import kotlin.js.*
import Buffer
import url.URL
import fs.`T$30`
import fs.BaseEncodingOptions
import NodeJS.ErrnoException

external fun __promisify__(path: String, options: Any? /* BaseEncodingOptions? | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Promise<String>

external fun __promisify__(path: String): dynamic /* Promise */

external fun __promisify__(path: Buffer, options: Any? /* BaseEncodingOptions? | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Promise<String>

external fun __promisify__(path: Buffer): dynamic /* Promise */

external fun __promisify__(path: URL, options: Any? /* BaseEncodingOptions? | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */ = definedExternally): Promise<String>

external fun __promisify__(path: URL): dynamic /* Promise */

external fun __promisify__(path: String, options: String /* "buffer" */): Promise<Buffer>

external fun __promisify__(path: String, options: `T$30`): Promise<Buffer>

external fun __promisify__(path: Buffer, options: String /* "buffer" */): Promise<Buffer>

external fun __promisify__(path: Buffer, options: `T$30`): Promise<Buffer>

external fun __promisify__(path: URL, options: String /* "buffer" */): Promise<Buffer>

external fun __promisify__(path: URL, options: `T$30`): Promise<Buffer>

external fun __promisify__(path: String, options: BaseEncodingOptions? = definedExternally): Promise<dynamic /* String | Buffer */>

external fun __promisify__(path: String, options: String? = definedExternally): Promise<dynamic /* String | Buffer */>

external fun __promisify__(path: Buffer, options: BaseEncodingOptions? = definedExternally): Promise<dynamic /* String | Buffer */>

external fun __promisify__(path: Buffer, options: String? = definedExternally): Promise<dynamic /* String | Buffer */>

external fun __promisify__(path: URL, options: BaseEncodingOptions? = definedExternally): Promise<dynamic /* String | Buffer */>

external fun __promisify__(path: URL, options: String? = definedExternally): Promise<dynamic /* String | Buffer */>

external fun native(path: String, options: Any? /* BaseEncodingOptions? | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */, callback: (err: ErrnoException?, resolvedPath: String) -> Unit)

external fun native(path: Buffer, options: Any? /* BaseEncodingOptions? | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */, callback: (err: ErrnoException?, resolvedPath: String) -> Unit)

external fun native(path: URL, options: Any? /* BaseEncodingOptions? | "ascii" | "utf8" | "utf-8" | "utf16le" | "ucs2" | "ucs-2" | "base64" | "base64url" | "latin1" | "binary" | "hex" */, callback: (err: ErrnoException?, resolvedPath: String) -> Unit)

external fun native(path: String, options: String /* "buffer" */, callback: (err: ErrnoException?, resolvedPath: Buffer) -> Unit)

external fun native(path: String, options: `T$30`, callback: (err: ErrnoException?, resolvedPath: Buffer) -> Unit)

external fun native(path: Buffer, options: String /* "buffer" */, callback: (err: ErrnoException?, resolvedPath: Buffer) -> Unit)

external fun native(path: Buffer, options: `T$30`, callback: (err: ErrnoException?, resolvedPath: Buffer) -> Unit)

external fun native(path: URL, options: String /* "buffer" */, callback: (err: ErrnoException?, resolvedPath: Buffer) -> Unit)

external fun native(path: URL, options: `T$30`, callback: (err: ErrnoException?, resolvedPath: Buffer) -> Unit)

external fun native(path: String, options: BaseEncodingOptions?, callback: (err: ErrnoException?, resolvedPath: Any /* String | Buffer */) -> Unit)

external fun native(path: String, options: String?, callback: (err: ErrnoException?, resolvedPath: Any /* String | Buffer */) -> Unit)

external fun native(path: Buffer, options: BaseEncodingOptions?, callback: (err: ErrnoException?, resolvedPath: Any /* String | Buffer */) -> Unit)

external fun native(path: Buffer, options: String?, callback: (err: ErrnoException?, resolvedPath: Any /* String | Buffer */) -> Unit)

external fun native(path: URL, options: BaseEncodingOptions?, callback: (err: ErrnoException?, resolvedPath: Any /* String | Buffer */) -> Unit)

external fun native(path: URL, options: String?, callback: (err: ErrnoException?, resolvedPath: Any /* String | Buffer */) -> Unit)

external fun native(path: String, callback: (err: ErrnoException?, resolvedPath: String) -> Unit)

external fun native(path: Buffer, callback: (err: ErrnoException?, resolvedPath: String) -> Unit)

external fun native(path: URL, callback: (err: ErrnoException?, resolvedPath: String) -> Unit)