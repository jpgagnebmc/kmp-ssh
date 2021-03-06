@file:JsQualifier("fs.open")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package fs.open

import kotlin.js.*
import Buffer
import url.URL

external fun __promisify__(path: String, flags: Number, mode: Number? = definedExternally): Promise<Number>

external fun __promisify__(path: String, flags: Number): Promise<Number>

external fun __promisify__(path: String, flags: Number, mode: String? = definedExternally): Promise<Number>

external fun __promisify__(path: String, flags: String, mode: Number? = definedExternally): Promise<Number>

external fun __promisify__(path: String, flags: String): Promise<Number>

external fun __promisify__(path: String, flags: String, mode: String? = definedExternally): Promise<Number>

external fun __promisify__(path: Buffer, flags: Number, mode: Number? = definedExternally): Promise<Number>

external fun __promisify__(path: Buffer, flags: Number): Promise<Number>

external fun __promisify__(path: Buffer, flags: Number, mode: String? = definedExternally): Promise<Number>

external fun __promisify__(path: Buffer, flags: String, mode: Number? = definedExternally): Promise<Number>

external fun __promisify__(path: Buffer, flags: String): Promise<Number>

external fun __promisify__(path: Buffer, flags: String, mode: String? = definedExternally): Promise<Number>

external fun __promisify__(path: URL, flags: Number, mode: Number? = definedExternally): Promise<Number>

external fun __promisify__(path: URL, flags: Number): Promise<Number>

external fun __promisify__(path: URL, flags: Number, mode: String? = definedExternally): Promise<Number>

external fun __promisify__(path: URL, flags: String, mode: Number? = definedExternally): Promise<Number>

external fun __promisify__(path: URL, flags: String): Promise<Number>

external fun __promisify__(path: URL, flags: String, mode: String? = definedExternally): Promise<Number>