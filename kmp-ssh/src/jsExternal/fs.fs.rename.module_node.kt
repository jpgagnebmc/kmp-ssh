@file:JsQualifier("fs.rename")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package fs.rename

import kotlin.js.*
import Buffer
import url.URL

external fun __promisify__(oldPath: String, newPath: String): Promise<Unit>

external fun __promisify__(oldPath: String, newPath: Buffer): Promise<Unit>

external fun __promisify__(oldPath: String, newPath: URL): Promise<Unit>

external fun __promisify__(oldPath: Buffer, newPath: String): Promise<Unit>

external fun __promisify__(oldPath: Buffer, newPath: Buffer): Promise<Unit>

external fun __promisify__(oldPath: Buffer, newPath: URL): Promise<Unit>

external fun __promisify__(oldPath: URL, newPath: String): Promise<Unit>

external fun __promisify__(oldPath: URL, newPath: Buffer): Promise<Unit>

external fun __promisify__(oldPath: URL, newPath: URL): Promise<Unit>