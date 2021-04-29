@file:JsQualifier("fs.access")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package fs.access

import kotlin.js.*
import Buffer
import url.URL

external fun __promisify__(path: String, mode: Number = definedExternally): Promise<Unit>

external fun __promisify__(path: String): Promise<Unit>

external fun __promisify__(path: Buffer, mode: Number = definedExternally): Promise<Unit>

external fun __promisify__(path: Buffer): Promise<Unit>

external fun __promisify__(path: URL, mode: Number = definedExternally): Promise<Unit>

external fun __promisify__(path: URL): Promise<Unit>