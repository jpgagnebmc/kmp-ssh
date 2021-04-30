@file:JsModule("timers")
@file:JsNonModule
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package timers

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*
import tsstdlib.AbortSignal
import NodeJS.Timeout
import NodeJS.Immediate

external interface TimerOptions {
    var ref: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var signal: AbortSignal?
        get() = definedExternally
        set(value) = definedExternally
}

external fun setTimeout(callback: (args: Any) -> Unit, ms: Number = definedExternally, vararg args: Any): Timeout

external fun clearTimeout(timeoutId: Timeout)

external fun setInterval(callback: (args: Any) -> Unit, ms: Number = definedExternally, vararg args: Any): Timeout

external fun clearInterval(intervalId: Timeout)

external fun setImmediate(callback: (args: Any) -> Unit, vararg args: Any): Immediate

external fun clearImmediate(immediateId: Immediate)