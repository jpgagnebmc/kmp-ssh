@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")

import kotlin.js.*
import tsstdlib.PromiseLike

external interface `L$0`<TReturn, T> {
    @nativeInvoke
    operator fun invoke(value: TReturn = definedExternally): Promise<dynamic /* IteratorYieldResult<T> | IteratorReturnResult<TReturn> */>
    @nativeInvoke
    operator fun invoke(): Promise<dynamic /* IteratorYieldResult<T> | IteratorReturnResult<TReturn> */>
    @nativeInvoke
    operator fun invoke(value: PromiseLike<TReturn> = definedExternally): Promise<dynamic /* IteratorYieldResult<T> | IteratorReturnResult<TReturn> */>
}

external interface AsyncIterator<T, TReturn, TNext> {
    fun next(vararg args: Any /* JsTuple<> | JsTuple<TNext> */): Promise<dynamic /* IteratorYieldResult<T> | IteratorReturnResult<TReturn> */>
    val `return`: `L$0`<TReturn, T>?
        get() = definedExternally
    val `throw`: ((e: Any) -> Promise<dynamic /* IteratorYieldResult<T> | IteratorReturnResult<TReturn> */>)?
}

external interface AsyncIterator__1<T> : AsyncIterator<T, Any, Nothing?>

external interface AsyncIterable<T>

external interface AsyncIterableIterator<T> : AsyncIterator__1<T>