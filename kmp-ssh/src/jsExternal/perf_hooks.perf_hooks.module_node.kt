@file:JsModule("perf_hooks")
@file:JsNonModule
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package perf_hooks

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
import async_hooks.AsyncResource
import tsstdlib.Map

external interface PerformanceEntry {
    var duration: Number
    var name: String
    var startTime: Number
    var entryType: String /* "node" | "mark" | "measure" | "gc" | "function" | "http2" | "http" */
    var kind: Number?
        get() = definedExternally
        set(value) = definedExternally
    var flags: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface PerformanceNodeTiming : PerformanceEntry {
    var bootstrapComplete: Number
    var environment: Number
    var idleTime: Number
    var loopExit: Number
    var loopStart: Number
    var v8Start: Number
}

external interface EventLoopUtilization {
    var idle: Number
    var active: Number
    var utilization: Number
}

external interface Performance {
    fun clearMarks(name: String = definedExternally)
    fun mark(name: String = definedExternally)
    fun measure(name: String, startMark: String, endMark: String)
    var nodeTiming: PerformanceNodeTiming
    fun now(): Number
    var timeOrigin: Number
    fun <T : (optionalParams: Any) -> Any> timerify(fn: T): T
    fun eventLoopUtilization(util1: EventLoopUtilization = definedExternally, util2: EventLoopUtilization = definedExternally): EventLoopUtilization
}

external interface PerformanceObserverEntryList {
    fun getEntries(): Array<PerformanceEntry>
    fun getEntriesByName(name: String, type: String /* "node" | "mark" | "measure" | "gc" | "function" | "http2" | "http" */ = definedExternally): Array<PerformanceEntry>
    fun getEntriesByType(type: String /* "node" | "mark" | "measure" | "gc" | "function" | "http2" | "http" */): Array<PerformanceEntry>
}

external interface `T$71` {
    var entryTypes: Array<String /* "node" | "mark" | "measure" | "gc" | "function" | "http2" | "http" */>
    var buffered: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class PerformanceObserver(callback: PerformanceObserverCallback) : AsyncResource {
    open fun disconnect()
    open fun observe(options: `T$71`)
}

external var performance: Performance

external interface EventLoopMonitorOptions {
    var resolution: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface EventLoopDelayMonitor {
    fun enable(): Boolean
    fun disable(): Boolean
    fun reset()
    fun percentile(percentile: Number): Number
    var percentiles: Map<Number, Number>
    var exceeds: Number
    var min: Number
    var max: Number
    var mean: Number
    var stddev: Number
}

external fun monitorEventLoopDelay(options: EventLoopMonitorOptions = definedExternally): EventLoopDelayMonitor