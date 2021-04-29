@file:JsQualifier("fs.truncate")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package fs.truncate

import kotlin.js.*
import Buffer
import url.URL

external fun __promisify__(path: String, len: Number? = definedExternally): Promise<Unit>

external fun __promisify__(path: String): Promise<Unit>

external fun __promisify__(path: Buffer, len: Number? = definedExternally): Promise<Unit>

external fun __promisify__(path: Buffer): Promise<Unit>

external fun __promisify__(path: URL, len: Number? = definedExternally): Promise<Unit>

external fun __promisify__(path: URL): Promise<Unit>