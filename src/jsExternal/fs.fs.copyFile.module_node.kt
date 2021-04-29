@file:JsQualifier("fs.copyFile")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package fs.copyFile

import kotlin.js.*
import Buffer
import url.URL

external fun __promisify__(src: String, dst: String, flags: Number = definedExternally): Promise<Unit>

external fun __promisify__(src: String, dst: String): Promise<Unit>

external fun __promisify__(src: String, dst: Buffer, flags: Number = definedExternally): Promise<Unit>

external fun __promisify__(src: String, dst: Buffer): Promise<Unit>

external fun __promisify__(src: String, dst: URL, flags: Number = definedExternally): Promise<Unit>

external fun __promisify__(src: String, dst: URL): Promise<Unit>

external fun __promisify__(src: Buffer, dst: String, flags: Number = definedExternally): Promise<Unit>

external fun __promisify__(src: Buffer, dst: String): Promise<Unit>

external fun __promisify__(src: Buffer, dst: Buffer, flags: Number = definedExternally): Promise<Unit>

external fun __promisify__(src: Buffer, dst: Buffer): Promise<Unit>

external fun __promisify__(src: Buffer, dst: URL, flags: Number = definedExternally): Promise<Unit>

external fun __promisify__(src: Buffer, dst: URL): Promise<Unit>

external fun __promisify__(src: URL, dst: String, flags: Number = definedExternally): Promise<Unit>

external fun __promisify__(src: URL, dst: String): Promise<Unit>

external fun __promisify__(src: URL, dst: Buffer, flags: Number = definedExternally): Promise<Unit>

external fun __promisify__(src: URL, dst: Buffer): Promise<Unit>

external fun __promisify__(src: URL, dst: URL, flags: Number = definedExternally): Promise<Unit>

external fun __promisify__(src: URL, dst: URL): Promise<Unit>