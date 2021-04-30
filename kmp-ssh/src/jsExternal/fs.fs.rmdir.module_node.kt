@file:JsQualifier("fs.rmdir")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package fs.rmdir

import kotlin.js.*
import fs.RmDirOptions
import Buffer
import url.URL

external fun __promisify__(path: String, options: RmDirOptions = definedExternally): Promise<Unit>

external fun __promisify__(path: String): Promise<Unit>

external fun __promisify__(path: Buffer, options: RmDirOptions = definedExternally): Promise<Unit>

external fun __promisify__(path: Buffer): Promise<Unit>

external fun __promisify__(path: URL, options: RmDirOptions = definedExternally): Promise<Unit>

external fun __promisify__(path: URL): Promise<Unit>