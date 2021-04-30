@file:JsQualifier("child_process.exec")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package child_process.exec

import kotlin.js.*
import Buffer
import child_process.`T$25`
import child_process.PromiseWithChild
import child_process.`T$26`
import child_process.ExecOptions
import fs.BaseEncodingOptions

external interface `T$27` {
    var stdout: String
    var stderr: String
}

external fun __promisify__(command: String): dynamic /* PromiseWithChild | PromiseWithChild */

external interface `T$28` {
    var stdout: Buffer
    var stderr: Buffer
}

external fun __promisify__(command: String, options: `T$25` /* `T$25` & ExecOptions */): PromiseWithChild<`T$28`>

external fun __promisify__(command: String, options: `T$26` /* `T$26` & ExecOptions */): PromiseWithChild<`T$27`>

external fun __promisify__(command: String, options: ExecOptions): PromiseWithChild<`T$27`>

external interface `T$29` {
    var stdout: dynamic /* String | Buffer */
        get() = definedExternally
        set(value) = definedExternally
    var stderr: dynamic /* String | Buffer */
        get() = definedExternally
        set(value) = definedExternally
}

external fun __promisify__(command: String, options: BaseEncodingOptions /* BaseEncodingOptions & ExecOptions */ = definedExternally): PromiseWithChild<`T$29`>