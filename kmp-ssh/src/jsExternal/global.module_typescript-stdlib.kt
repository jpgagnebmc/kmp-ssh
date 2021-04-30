@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")

import kotlin.js.*
import tsstdlib.Parameters

external object symbols {
    var copy: Any
}

external fun panic(v: Any): Any

external fun recover(e: Any): Any

external open class Ref<T>(value: T) {
    open fun set(value: T)
    open fun deref(): T
}

external interface ResultCase<S, F> {
    fun isSuccess(): Boolean
    fun isFailure(): Boolean
    fun unwrap(msg: String = definedExternally): S
    fun unwrapFailure(msg: String = definedExternally): F
    fun success(): S?
    fun failure(): F?
    fun <T> map(transform: (value: S) -> T): dynamic /* Success<T, F> | Failure<T, F> */
    fun <E> mapFailure(transform: (err: F) -> E): dynamic /* Success<S, E> | Failure<S, E> */
    fun flatMap(transform: (value: S) -> Any): dynamic /* Success<T, F> | Failure<T, F> */
    fun flatMapFailure(transform: (err: F) -> Any): dynamic /* Success<S, E> | Failure<S, E> */
}

external open class Success<S, F>(value: S) : ResultCase<S, F> {
    override fun isSuccess(): Boolean
    override fun isFailure(): Boolean
    override fun unwrap(_msg: String): S
    override fun unwrapFailure(msg: String): Any
    override fun success(): S
    override fun failure(): Nothing?
    override fun <T> map(transform: (value: S) -> T): dynamic /* Success<T, F> | Failure<T, F> */
    override fun <E> mapFailure(_transform: (err: F) -> E): dynamic /* Success<S, E> | Failure<S, E> */
    override fun flatMap(transform: (value: S) -> Any): dynamic /* Success<T, F> | Failure<T, F> */
    override fun flatMapFailure(_transform: (err: F) -> Any): dynamic /* Success<S, E> | Failure<S, E> */
}

external open class Failure<S, F>(cause: F) : ResultCase<S, F> {
    override fun isSuccess(): Boolean
    override fun isFailure(): Boolean
    override fun unwrap(msg: String): Any
    override fun unwrapFailure(_msg: String): F
    override fun success(): Nothing?
    override fun failure(): F
    override fun <T> map(_transform: (value: S) -> T): dynamic /* Success<T, F> | Failure<T, F> */
    override fun <E> mapFailure(transform: (err: F) -> E): dynamic /* Success<S, E> | Failure<S, E> */
    override fun flatMap(_transform: (value: S) -> Any): dynamic /* Success<T, F> | Failure<T, F> */
    override fun flatMapFailure(transform: (err: F) -> Any): dynamic /* Success<S, E> | Failure<S, E> */
}

typealias ExtractPromise<P> = Any

external object Result {
    fun <S, F> success(value: S): dynamic /* Success<S, F> | Failure<S, F> */
    fun <S_1, F_1> failure(cause: F_1): dynamic /* Success<S_1, F_1> | Failure<S_1, F_1> */
    fun <S_2> of(catching: () -> S_2): dynamic /* Success<S_2, Error> | Failure<S_2, Error> */
    fun <S_3> ofPromise(catching: () -> Promise<S_3>): Promise<dynamic /* Success<S_3, Error> | Failure<S_3, Error> */>
    fun <F_2 : (args: Any) -> Any> resultify(fn: F_2): (args: Parameters<F_2>) -> dynamic
    fun <F_3 : (args: Any) -> Promise<Any>> resultifyPromise(fn: F_3): (args: Parameters<F_3>) -> Promise<dynamic /* Success<ExtractPromise<ReturnType<F_3>>, Error> | Failure<ExtractPromise<ReturnType<F_3>>, Error> */>
}