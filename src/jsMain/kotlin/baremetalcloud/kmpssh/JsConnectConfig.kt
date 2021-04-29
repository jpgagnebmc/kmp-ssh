package baremetalcloud.kmpssh

import ConnectConfig

data class JsConnectConfig(
    override var host: String?,
    override var username: String?,
    override var password: String?,
    override var port: Number?,
//    override var privateKey: String,
    override var debug: ((information: String) -> Any)?
) : ConnectConfig