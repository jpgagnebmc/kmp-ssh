@file:JsQualifier("fs.link")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package fs.link

import kotlin.js.*
import Buffer
import url.URL

external fun __promisify__(existingPath: String, newPath: String): Promise<Unit>

external fun __promisify__(existingPath: String, newPath: Buffer): Promise<Unit>

external fun __promisify__(existingPath: String, newPath: URL): Promise<Unit>

external fun __promisify__(existingPath: Buffer, newPath: String): Promise<Unit>

external fun __promisify__(existingPath: Buffer, newPath: Buffer): Promise<Unit>

external fun __promisify__(existingPath: Buffer, newPath: URL): Promise<Unit>

external fun __promisify__(existingPath: URL, newPath: String): Promise<Unit>

external fun __promisify__(existingPath: URL, newPath: Buffer): Promise<Unit>

external fun __promisify__(existingPath: URL, newPath: URL): Promise<Unit>