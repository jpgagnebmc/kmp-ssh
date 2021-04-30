@file:JsQualifier("fs.chown")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package fs.chown

import kotlin.js.*
import Buffer
import url.URL

external fun __promisify__(path: String, uid: Number, gid: Number): Promise<Unit>

external fun __promisify__(path: Buffer, uid: Number, gid: Number): Promise<Unit>

external fun __promisify__(path: URL, uid: Number, gid: Number): Promise<Unit>