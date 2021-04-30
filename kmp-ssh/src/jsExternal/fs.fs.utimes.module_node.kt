@file:JsQualifier("fs.utimes")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package fs.utimes

import kotlin.js.*
import Buffer
import url.URL

external fun __promisify__(path: String, atime: String, mtime: Any /* String | Number | Date */): Promise<Unit>

external fun __promisify__(path: String, atime: Number, mtime: Any /* String | Number | Date */): Promise<Unit>

external fun __promisify__(path: String, atime: Date, mtime: Any /* String | Number | Date */): Promise<Unit>

external fun __promisify__(path: Buffer, atime: String, mtime: Any /* String | Number | Date */): Promise<Unit>

external fun __promisify__(path: Buffer, atime: Number, mtime: Any /* String | Number | Date */): Promise<Unit>

external fun __promisify__(path: Buffer, atime: Date, mtime: Any /* String | Number | Date */): Promise<Unit>

external fun __promisify__(path: URL, atime: String, mtime: Any /* String | Number | Date */): Promise<Unit>

external fun __promisify__(path: URL, atime: Number, mtime: Any /* String | Number | Date */): Promise<Unit>

external fun __promisify__(path: URL, atime: Date, mtime: Any /* String | Number | Date */): Promise<Unit>