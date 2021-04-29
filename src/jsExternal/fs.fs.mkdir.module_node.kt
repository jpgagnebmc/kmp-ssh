@file:JsQualifier("fs.mkdir")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package fs.mkdir

import kotlin.js.*
import fs.MakeDirectoryOptions
import Buffer
import url.URL

external fun __promisify__(path: String, options: MakeDirectoryOptions /* MakeDirectoryOptions & `T$33` | MakeDirectoryOptions & `T$34` */): dynamic /* Promise | Promise */

external fun __promisify__(path: Buffer, options: MakeDirectoryOptions /* MakeDirectoryOptions & `T$33` | MakeDirectoryOptions & `T$34` */): dynamic /* Promise | Promise */

external fun __promisify__(path: URL, options: MakeDirectoryOptions /* MakeDirectoryOptions & `T$33` | MakeDirectoryOptions & `T$34` */): dynamic /* Promise | Promise */

external fun __promisify__(path: String, options: Number? = definedExternally): dynamic /* Promise | Promise */

external fun __promisify__(path: String): dynamic /* Promise */

external fun __promisify__(path: String, options: String? = definedExternally): dynamic /* Promise | Promise */

external fun __promisify__(path: Buffer, options: Number? = definedExternally): dynamic /* Promise | Promise */

external fun __promisify__(path: Buffer): dynamic /* Promise */

external fun __promisify__(path: Buffer, options: String? = definedExternally): dynamic /* Promise | Promise */

external fun __promisify__(path: URL, options: Number? = definedExternally): dynamic /* Promise | Promise */

external fun __promisify__(path: URL): dynamic /* Promise */

external fun __promisify__(path: URL, options: String? = definedExternally): dynamic /* Promise | Promise */

external fun __promisify__(path: String, options: MakeDirectoryOptions? = definedExternally): Promise<String?>

external fun __promisify__(path: Buffer, options: MakeDirectoryOptions? = definedExternally): Promise<String?>

external fun __promisify__(path: URL, options: MakeDirectoryOptions? = definedExternally): Promise<String?>