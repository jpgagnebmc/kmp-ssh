@file:JsModule("https")
@file:JsNonModule
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package https

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
import tls.ConnectionOptions
import http.RequestListener
import tls.SecureContextOptions
import http.HttpBase
import http.RequestOptions
import http.IncomingMessage
import http.ClientRequest
import url.URL

external interface `T$70` {
    var rejectUnauthorized: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var servername: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface AgentOptions : http.AgentOptions, ConnectionOptions {
    override var rejectUnauthorized: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var maxCachedSessions: Number?
        get() = definedExternally
        set(value) = definedExternally
    override var timeout: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Agent(options: AgentOptions = definedExternally) : http.Agent {
    open var options: AgentOptions
}

external open class Server : tls.Server, HttpBase {
    override fun setTimeout(msecs: Number, callback: () -> Unit): Server /* this */
    override fun setTimeout(): Server /* this */
    override fun setTimeout(msecs: Number): Server /* this */
    override fun setTimeout(callback: () -> Unit): Server /* this */
    override var maxHeadersCount: Number?
    override var timeout: Number
    override var headersTimeout: Number
    override var keepAliveTimeout: Number
    override var requestTimeout: Number
    constructor(requestListener: RequestListener = definedExternally)
    constructor()
    constructor(options: SecureContextOptions, requestListener: RequestListener = definedExternally)
    constructor(options: SecureContextOptions)
}

external fun createServer(requestListener: RequestListener = definedExternally): Server

external fun createServer(): Server

external fun createServer(options: SecureContextOptions /* tls.SecureContextOptions & tls.TlsOptions & http.ServerOptions */, requestListener: RequestListener = definedExternally): Server

external fun createServer(options: SecureContextOptions /* tls.SecureContextOptions & tls.TlsOptions & http.ServerOptions */): Server

external fun request(options: RequestOptions /* http.RequestOptions & tls.SecureContextOptions & `T$70` */, callback: (res: IncomingMessage) -> Unit = definedExternally): ClientRequest

external fun request(options: RequestOptions /* http.RequestOptions & tls.SecureContextOptions & `T$70` */): ClientRequest

external fun request(options: String, callback: (res: IncomingMessage) -> Unit = definedExternally): ClientRequest

external fun request(options: String): ClientRequest

external fun request(options: URL, callback: (res: IncomingMessage) -> Unit = definedExternally): ClientRequest

external fun request(options: URL): ClientRequest

external fun request(url: String, options: RequestOptions /* http.RequestOptions & tls.SecureContextOptions & `T$70` */, callback: (res: IncomingMessage) -> Unit = definedExternally): ClientRequest

external fun request(url: String, options: RequestOptions /* http.RequestOptions & tls.SecureContextOptions & `T$70` */): ClientRequest

external fun request(url: URL, options: RequestOptions /* http.RequestOptions & tls.SecureContextOptions & `T$70` */, callback: (res: IncomingMessage) -> Unit = definedExternally): ClientRequest

external fun request(url: URL, options: RequestOptions /* http.RequestOptions & tls.SecureContextOptions & `T$70` */): ClientRequest

external fun get(options: RequestOptions /* http.RequestOptions & tls.SecureContextOptions & `T$70` */, callback: (res: IncomingMessage) -> Unit = definedExternally): ClientRequest

external fun get(options: RequestOptions /* http.RequestOptions & tls.SecureContextOptions & `T$70` */): ClientRequest

external fun get(options: String, callback: (res: IncomingMessage) -> Unit = definedExternally): ClientRequest

external fun get(options: String): ClientRequest

external fun get(options: URL, callback: (res: IncomingMessage) -> Unit = definedExternally): ClientRequest

external fun get(options: URL): ClientRequest

external fun get(url: String, options: RequestOptions /* http.RequestOptions & tls.SecureContextOptions & `T$70` */, callback: (res: IncomingMessage) -> Unit = definedExternally): ClientRequest

external fun get(url: String, options: RequestOptions /* http.RequestOptions & tls.SecureContextOptions & `T$70` */): ClientRequest

external fun get(url: URL, options: RequestOptions /* http.RequestOptions & tls.SecureContextOptions & `T$70` */, callback: (res: IncomingMessage) -> Unit = definedExternally): ClientRequest

external fun get(url: URL, options: RequestOptions /* http.RequestOptions & tls.SecureContextOptions & `T$70` */): ClientRequest

external var globalAgent: Agent