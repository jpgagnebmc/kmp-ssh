@file:JsQualifier("fs.exists")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package fs.exists

import kotlin.js.*
import Buffer
import url.URL

external fun __promisify__(path: String): Promise<Boolean>

external fun __promisify__(path: Buffer): Promise<Boolean>

external fun __promisify__(path: URL): Promise<Boolean>