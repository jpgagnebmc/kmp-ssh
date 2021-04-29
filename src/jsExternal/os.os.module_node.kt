@file:JsModule("os")
@file:JsNonModule
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package os

import kotlin.js.*
import NodeJS.Dict
import fs.`T$30`
import Buffer
import child_process.`T$26`

external interface `T$51` {
    var user: Number
    var nice: Number
    var sys: Number
    var idle: Number
    var irq: Number
}

external interface CpuInfo {
    var model: String
    var speed: Number
    var times: `T$51`
}

external interface NetworkInterfaceBase {
    var address: String
    var netmask: String
    var mac: String
    var internal: Boolean
    var cidr: String?
}

external interface NetworkInterfaceInfoIPv4 : NetworkInterfaceBase {
    var family: String /* "IPv4" */
}

external interface NetworkInterfaceInfoIPv6 : NetworkInterfaceBase {
    var family: String /* "IPv6" */
    var scopeid: Number
}

external interface UserInfo<T> {
    var username: T
    var uid: Number
    var gid: Number
    var shell: T
    var homedir: T
}

external fun hostname(): String

external fun loadavg(): Array<Number>

external fun uptime(): Number

external fun freemem(): Number

external fun totalmem(): Number

external fun cpus(): Array<CpuInfo>

external fun type(): String

external fun release(): String

external fun networkInterfaces(): Dict<Array<dynamic /* NetworkInterfaceInfoIPv4 | NetworkInterfaceInfoIPv6 */>>

external fun homedir(): String

external fun userInfo(options: `T$30`): UserInfo<Buffer>

external fun userInfo(options: `T$26` = definedExternally): UserInfo<String>

external fun userInfo(): UserInfo<String>

external fun arch(): String

external fun version(): String

external fun platform(): String /* "aix" | "android" | "darwin" | "freebsd" | "linux" | "openbsd" | "sunos" | "win32" | "cygwin" | "netbsd" */

external fun tmpdir(): String

external var EOL: String

external fun endianness(): String /* "BE" | "LE" */

external fun getPriority(pid: Number = definedExternally): Number

external fun setPriority(priority: Number)

external fun setPriority(pid: Number, priority: Number)