package com.baremetalcloud.kmpssh

import kotlinx.cinterop.*
import libssh.*
import platform.posix.size_tVar


//TODO: add error handling for missing .ssh/id_rsa
//TODO: add error handling for host not in known_hosts

val ssh_session.lastError: String
    get() = ssh_get_error(this)!!.toKString()

@ExperimentalUnsignedTypes
actual suspend fun Ssh.exec(cmd: String): SshResult {
    println("identity $sshIdentity")
    println("host $sshHost")
    println("options $sshOptions")
    lateinit var result: SshResult
    memScoped {
        val session: ssh_session = ssh_new()!!
        println("session ${session.pointed}")

        try {
            val debug: Int = 0

            ssh_options_set(session, ssh_options_e.SSH_OPTIONS_USER, sshIdentity.username.cstr)
            ssh_options_set(session, ssh_options_e.SSH_OPTIONS_HOST, sshHost.hostname.cstr)
            ssh_options_set(session, ssh_options_e.SSH_OPTIONS_PORT, alloc<UIntVar>().apply { value = sshHost.port.toUInt() }.ptr)
            ssh_options_set(session, ssh_options_e.SSH_OPTIONS_LOG_VERBOSITY, debug.toString().cstr)
            ssh_options_set(session, ssh_options_e.SSH_OPTIONS_KNOWNHOSTS, "/home/jp/.ssh/known_hosts".cstr)
            ssh_options_set(session, ssh_options_e.SSH_OPTIONS_STRICTHOSTKEYCHECK, alloc<UIntVar>().apply { value = 0u }.ptr)


            println("SSH_OPTIONS_USER ${getStringVar(session, ssh_options_e.SSH_OPTIONS_USER)}")
            println("SSH_OPTIONS_HOST ${getStringVar(session, ssh_options_e.SSH_OPTIONS_HOST)}")
            println("SSH_OPTIONS_KNOWNHOSTS ${getStringVar(session, ssh_options_e.SSH_OPTIONS_KNOWNHOSTS)}")
//            println("SSH_OPTIONS_PORT ${getLongVar(session, ssh_options_e.SSH_OPTIONS_PORT)}")

            ssh_connect(session).apply {
                println("ssh_connect $this")
                if (this > 0) {
                    throw Exception(session.lastError)
                }
            }
            val srv_pubkey = alloc<ssh_keyVar>()
            val hash = alloc<CPointerVar<UByteVar>>()
            val hlen = alloc<size_tVar>()
            println("srv_pubkey ${srv_pubkey}")
            ssh_get_server_publickey(session, srv_pubkey.ptr).apply {
                println("ssh_get_server_publickey $this")
                println("srv_pubkey $srv_pubkey")
                if (this != 0) {
                    throw Exception("ssh_get_server_publickey $this")
                }
            }
            ssh_get_publickey_hash(srv_pubkey.value, ssh_publickey_hash_type.SSH_PUBLICKEY_HASH_SHA1, hash.ptr, hlen.ptr).apply {
                if (this != 0) {
                    println("hash ${hash}")
                    println("hlen ${hlen.value}")
                    throw Exception("ssh_get_publickey_hash ${session.lastError}")
                }
            }
            ssh_key_free(srv_pubkey.value).apply {
                println("ssh_key_free $this")
            }
            ssh_session_is_known_server(session).apply {
                println("ssh_session_is_known_server $this")

//                 * There had been an error checking the host.
//                SSH_KNOWN_HOSTS_ERROR = -2,
//                 * The known host file does not exist. The host is thus unknown. File will
//                 * be created if host key is accepted.
//                SSH_KNOWN_HOSTS_NOT_FOUND = -1,
//                 * The server is unknown. User should confirm the public key hash is
//                 * correct.
//                SSH_KNOWN_HOSTS_UNKNOWN = 0,
//                 * The server is known and has not changed.
//                SSH_KNOWN_HOSTS_OK,
//                 * The server key has changed. Either you are under attack or the
//                 * administrator changed the key. You HAVE to warn the user about a
//                 * possible attack.
//                SSH_KNOWN_HOSTS_CHANGED,
//                 * The server gave use a key of a type while we had an other type recorded.
//                 * It is a possible attack.
//                SSH_KNOWN_HOSTS_OTHER,

                when(this) {
                    1 -> { println("SSH_KNOWN_HOSTS_OK")}
                    0 -> { println("SSH_KNOWN_HOSTS_UNKNOWN") }
                    -2 -> throw Exception("ssh_session_is_known_server SSH_KNOWN_HOSTS_ERROR $this")
                    -1 -> throw Exception("ssh_session_is_known_server SSH_KNOWN_HOSTS_NOT_FOUND $this")
                    else -> throw Exception("ssh_session_is_known_server $this")
                }
            }
            ssh_clean_pubkey_hash(hash.ptr);

            ssh_userauth_password(session, null, sshIdentity.password).apply {
                if (this != 0) {
                    throw Exception("ssh_userauth_password  ${session.lastError}")
                }

            }
            val channel = ssh_channel_new(session)
            if (channel == null) {
                println("channel == null")
                throw Exception("ssh_channel_new failed ${session.lastError}")
            }

            println("channel $channel")
            ssh_channel_open_session(channel).apply {
                if (this != 0) {
                    throw Exception("ssh_channel_open_session $this")
                }
            }
            ssh_channel_request_exec(channel, cmd).apply {
                if (this < 0) {
                    throw Exception("ssh_channel_request_exec $this")
                }
            }

            val buffer = ByteArray(256)
            val rbytes = ssh_channel_read(channel, buffer.refTo(0), buffer.size.toUInt(), 0);

            ssh_disconnect(session);
            ssh_free(session);
            ssh_finalize();

            result = SshResult.Success(buffer.toKString(0, rbytes), null)
        } catch (e: Exception) {
            println("caught $e ${session.lastError}")
            ssh_disconnect(session);
            ssh_free(session);
            ssh_finalize();
            result = SshResult.Failure(session.lastError, e.toString(), 1)
        }
    }
    return result
}

private fun MemScope.getLongVar(session: ssh_session, option: ssh_options_e): Long {
    val obuf = alloc<CPointerVar<ByteVar>>()
    ssh_options_get(session, option, obuf.ptr)


    TODO("${obuf.value}")
    //return obuf.pointed.
}

private fun MemScope.getStringVar(session: ssh_session, option: ssh_options_e): String {
    val obuf = alloc<CPointerVar<ByteVar>>()
    ssh_options_get(session, option, obuf.ptr)
    return obuf.value!!.toKString()
}
