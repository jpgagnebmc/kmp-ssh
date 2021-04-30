@file:JsQualifier("fs.readFile")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package fs.readFile

import kotlin.js.*
import fs.`T$42`
import Buffer
import url.URL
import fs.`T$43`
import fs.BaseEncodingOptions

external fun __promisify__(path: String, options: `T$42`? = definedExternally): Promise<Buffer>

external fun __promisify__(path: String): dynamic /* Promise */

external fun __promisify__(path: Buffer, options: `T$42`? = definedExternally): Promise<Buffer>

external fun __promisify__(path: Buffer): dynamic /* Promise */

external fun __promisify__(path: URL, options: `T$42`? = definedExternally): Promise<Buffer>

external fun __promisify__(path: URL): dynamic /* Promise */

external fun __promisify__(path: Number, options: `T$42`? = definedExternally): Promise<Buffer>

external fun __promisify__(path: Number): dynamic /* Promise */

external fun __promisify__(path: String, options: `T$43`): Promise<String>

external fun __promisify__(path: String, options: String): Promise<String>

external fun __promisify__(path: Buffer, options: `T$43`): Promise<String>

external fun __promisify__(path: Buffer, options: String): Promise<String>

external fun __promisify__(path: URL, options: `T$43`): Promise<String>

external fun __promisify__(path: URL, options: String): Promise<String>

external fun __promisify__(path: Number, options: `T$43`): Promise<String>

external fun __promisify__(path: Number, options: String): Promise<String>

external fun __promisify__(path: String, options: BaseEncodingOptions /* BaseEncodingOptions & `T$44` */ = definedExternally): Promise<dynamic /* String | Buffer */>

external fun __promisify__(path: String, options: String? = definedExternally): Promise<dynamic /* String | Buffer */>

external fun __promisify__(path: Buffer, options: BaseEncodingOptions /* BaseEncodingOptions & `T$44` */ = definedExternally): Promise<dynamic /* String | Buffer */>

external fun __promisify__(path: Buffer, options: String? = definedExternally): Promise<dynamic /* String | Buffer */>

external fun __promisify__(path: URL, options: BaseEncodingOptions /* BaseEncodingOptions & `T$44` */ = definedExternally): Promise<dynamic /* String | Buffer */>

external fun __promisify__(path: URL, options: String? = definedExternally): Promise<dynamic /* String | Buffer */>

external fun __promisify__(path: Number, options: BaseEncodingOptions /* BaseEncodingOptions & `T$44` */ = definedExternally): Promise<dynamic /* String | Buffer */>

external fun __promisify__(path: Number, options: String? = definedExternally): Promise<dynamic /* String | Buffer */>