@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package domain.global.NodeJS

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

external interface Domain : EventEmitter {
    fun <T> run(fn: (args: Any) -> T, vararg args: Any): T
    fun add(emitter: EventEmitter)
    fun add(emitter: Timer)
    fun remove(emitter: EventEmitter)
    fun remove(emitter: Timer)
    fun <T : Function<*>> bind(cb: T): T
    fun <T : Function<*>> intercept(cb: T): T
}