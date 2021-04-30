@file:JsQualifier("fs.lstat")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package fs.lstat

import kotlin.js.*
import fs.StatOptions
import Buffer
import url.URL

external fun __promisify__(path: String, options: StatOptions /* StatOptions & `T$31` | StatOptions & `T$32` */ = definedExternally): dynamic /* Promise */

external fun __promisify__(path: String): dynamic /* Promise | Promise */

external fun __promisify__(path: Buffer, options: StatOptions /* StatOptions & `T$31` | StatOptions & `T$32` */ = definedExternally): dynamic /* Promise */

external fun __promisify__(path: Buffer): dynamic /* Promise | Promise */

external fun __promisify__(path: URL, options: StatOptions /* StatOptions & `T$31` | StatOptions & `T$32` */ = definedExternally): dynamic /* Promise */

external fun __promisify__(path: URL): dynamic /* Promise | Promise */