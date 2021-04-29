@file:JsQualifier("fs.rm")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package fs.rm

import kotlin.js.*
import fs.RmOptions
import Buffer
import url.URL

external fun __promisify__(path: String, options: RmOptions = definedExternally): Promise<Unit>

external fun __promisify__(path: String): Promise<Unit>

external fun __promisify__(path: Buffer, options: RmOptions = definedExternally): Promise<Unit>

external fun __promisify__(path: Buffer): Promise<Unit>

external fun __promisify__(path: URL, options: RmOptions = definedExternally): Promise<Unit>

external fun __promisify__(path: URL): Promise<Unit>