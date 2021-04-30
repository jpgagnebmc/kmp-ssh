@file:JsQualifier("fs.symlink")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package fs.symlink

import kotlin.js.*
import Buffer
import url.URL

external fun __promisify__(target: String, path: String, type: String? = definedExternally): Promise<Unit>

external fun __promisify__(target: String, path: String): Promise<Unit>

external fun __promisify__(target: String, path: Buffer, type: String? = definedExternally): Promise<Unit>

external fun __promisify__(target: String, path: Buffer): Promise<Unit>

external fun __promisify__(target: String, path: URL, type: String? = definedExternally): Promise<Unit>

external fun __promisify__(target: String, path: URL): Promise<Unit>

external fun __promisify__(target: Buffer, path: String, type: String? = definedExternally): Promise<Unit>

external fun __promisify__(target: Buffer, path: String): Promise<Unit>

external fun __promisify__(target: Buffer, path: Buffer, type: String? = definedExternally): Promise<Unit>

external fun __promisify__(target: Buffer, path: Buffer): Promise<Unit>

external fun __promisify__(target: Buffer, path: URL, type: String? = definedExternally): Promise<Unit>

external fun __promisify__(target: Buffer, path: URL): Promise<Unit>

external fun __promisify__(target: URL, path: String, type: String? = definedExternally): Promise<Unit>

external fun __promisify__(target: URL, path: String): Promise<Unit>

external fun __promisify__(target: URL, path: Buffer, type: String? = definedExternally): Promise<Unit>

external fun __promisify__(target: URL, path: Buffer): Promise<Unit>

external fun __promisify__(target: URL, path: URL, type: String? = definedExternally): Promise<Unit>

external fun __promisify__(target: URL, path: URL): Promise<Unit>