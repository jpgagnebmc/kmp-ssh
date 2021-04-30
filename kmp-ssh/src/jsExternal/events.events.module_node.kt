@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package events

import kotlin.js.*
import tsstdlib.AbortSignal
import AsyncIterableIterator

external interface EventEmitterOptions {
    var captureRejections: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface NodeEventTarget {
    fun once(event: String, listener: (args: Any) -> Unit): NodeEventTarget /* this */
    fun once(event: Any, listener: (args: Any) -> Unit): NodeEventTarget /* this */
}

external interface `T$19` {
    var once: Boolean
}

external interface DOMEventTarget {
    fun addEventListener(event: String, listener: (args: Any) -> Unit, opts: `T$19` = definedExternally): Any
}

external interface StaticEventEmitterOptions {
    var signal: AbortSignal?
        get() = definedExternally
        set(value) = definedExternally
}

@JsModule("events")
external open class EventEmitter(options: EventEmitterOptions = definedExternally) : events.global.NodeJS.EventEmitter {
    override fun addListener(event: String, listener: (args: Any) -> Unit): dynamic /* EventEmitter */
    override fun addListener(event: Any, listener: (args: Any) -> Unit): dynamic /* EventEmitter */
    override fun on(event: String, listener: (args: Any) -> Unit): dynamic /* EventEmitter */
    override fun on(event: Any, listener: (args: Any) -> Unit): dynamic /* EventEmitter */
    override fun once(event: String, listener: (args: Any) -> Unit): dynamic /* EventEmitter */
    override fun once(event: Any, listener: (args: Any) -> Unit): dynamic /* EventEmitter */
    override fun removeListener(event: String, listener: (args: Any) -> Unit): dynamic /* EventEmitter */
    override fun removeListener(event: Any, listener: (args: Any) -> Unit): dynamic /* EventEmitter */
    override fun off(event: String, listener: (args: Any) -> Unit): dynamic /* EventEmitter */
    override fun off(event: Any, listener: (args: Any) -> Unit): dynamic /* EventEmitter */
    override fun removeAllListeners(event: String): dynamic /* EventEmitter */
    override fun removeAllListeners(): dynamic /* EventEmitter */
    override fun removeAllListeners(event: Any): dynamic /* EventEmitter */
    override fun setMaxListeners(n: Number): EventEmitter /* this */
    override fun getMaxListeners(): Number
    override fun listeners(event: String): Array<Function<*>>
    override fun listeners(event: Any): Array<Function<*>>
    override fun rawListeners(event: String): Array<Function<*>>
    override fun rawListeners(event: Any): Array<Function<*>>
    override fun emit(event: String, vararg args: Any): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    override fun listenerCount(event: String): Number
    override fun listenerCount(event: Any): Number
    override fun prependListener(event: String, listener: (args: Any) -> Unit): dynamic /* EventEmitter */
    override fun prependListener(event: Any, listener: (args: Any) -> Unit): dynamic /* EventEmitter */
    override fun prependOnceListener(event: String, listener: (args: Any) -> Unit): dynamic /* EventEmitter */
    override fun prependOnceListener(event: Any, listener: (args: Any) -> Unit): dynamic /* EventEmitter */
    override fun eventNames(): Array<dynamic /* String | Any */>

    companion object {
        fun once(emitter: NodeEventTarget, event: String, options: StaticEventEmitterOptions = definedExternally): Promise<Array<Any>>
        fun once(emitter: NodeEventTarget, event: Any, options: StaticEventEmitterOptions = definedExternally): Promise<Array<Any>>
        fun once(emitter: DOMEventTarget, event: String, options: StaticEventEmitterOptions = definedExternally): Promise<Array<Any>>
        fun on(emitter: events.global.NodeJS.EventEmitter, event: String, options: StaticEventEmitterOptions = definedExternally): AsyncIterableIterator<Any>
        fun listenerCount(emitter: events.global.NodeJS.EventEmitter, event: String): Number
        fun listenerCount(emitter: events.global.NodeJS.EventEmitter, event: Any): Number
        var errorMonitor: Any
        var captureRejectionSymbol: Any
        var captureRejections: Boolean
        var defaultMaxListeners: Number
    }
}