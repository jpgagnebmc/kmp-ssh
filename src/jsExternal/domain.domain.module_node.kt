@file:JsModule("domain")
@file:JsNonModule
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package domain

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
import events.global.NodeJS.EventEmitter
import NodeJS.Timer
import events.EventEmitter as _events_EventEmitter

external open class Domain : _events_EventEmitter, domain.global.NodeJS.Domain {
    override fun <T> run(fn: (args: Any) -> T, vararg args: Any): T
    override fun add(emitter: EventEmitter)
    override fun add(emitter: Timer)
    override fun remove(emitter: EventEmitter)
    override fun remove(emitter: Timer)
    override fun <T : Function<*>> bind(cb: T): T
    override fun <T : Function<*>> intercept(cb: T): T
    override fun addListener(event: String, listener: (args: Any) -> Unit): Domain /* this */
    override fun addListener(event: Any, listener: (args: Any) -> Unit): Domain /* this */
    override fun on(event: String, listener: (args: Any) -> Unit): Domain /* this */
    override fun on(event: Any, listener: (args: Any) -> Unit): Domain /* this */
    override fun once(event: String, listener: (args: Any) -> Unit): Domain /* this */
    override fun once(event: Any, listener: (args: Any) -> Unit): Domain /* this */
    override fun removeListener(event: String, listener: (args: Any) -> Unit): Domain /* this */
    override fun removeListener(event: Any, listener: (args: Any) -> Unit): Domain /* this */
    override fun off(event: String, listener: (args: Any) -> Unit): Domain /* this */
    override fun off(event: Any, listener: (args: Any) -> Unit): Domain /* this */
    override fun removeAllListeners(event: String): Domain /* this */
    override fun removeAllListeners(): Domain /* this */
    override fun removeAllListeners(event: Any): Domain /* this */
    override fun setMaxListeners(n: Number): Domain /* this */
    override fun getMaxListeners(): Number
    override fun listeners(event: String): Array<Function<*>>
    override fun listeners(event: Any): Array<Function<*>>
    override fun rawListeners(event: String): Array<Function<*>>
    override fun rawListeners(event: Any): Array<Function<*>>
    override fun emit(event: String, vararg args: Any): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    override fun listenerCount(event: String): Number
    override fun listenerCount(event: Any): Number
    override fun prependListener(event: String, listener: (args: Any) -> Unit): Domain /* this */
    override fun prependListener(event: Any, listener: (args: Any) -> Unit): Domain /* this */
    override fun prependOnceListener(event: String, listener: (args: Any) -> Unit): Domain /* this */
    override fun prependOnceListener(event: Any, listener: (args: Any) -> Unit): Domain /* this */
    override fun eventNames(): Array<dynamic /* String | Any */>
    open var members: Array<dynamic /* EventEmitter | NodeJS.Timer */>
    open fun enter()
    open fun exit()
}

external fun create(): Domain