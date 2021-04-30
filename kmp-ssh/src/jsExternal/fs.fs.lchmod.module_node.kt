@file:JsQualifier("fs.lchmod")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package fs.lchmod

import kotlin.js.*
import Buffer
import url.URL

external fun __promisify__(path: String, mode: Number): Promise<Unit>

external fun __promisify__(path: String, mode: String): Promise<Unit>

external fun __promisify__(path: Buffer, mode: Number): Promise<Unit>

external fun __promisify__(path: Buffer, mode: String): Promise<Unit>

external fun __promisify__(path: URL, mode: Number): Promise<Unit>

external fun __promisify__(path: URL, mode: String): Promise<Unit>