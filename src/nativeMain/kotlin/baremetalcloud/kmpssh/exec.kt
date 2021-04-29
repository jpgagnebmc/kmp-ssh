package baremetalcloud.kmpssh

import kotlinx.cinterop.*
import libssh.*
import platform.posix.size_tVar


@ExperimentalUnsignedTypes
actual suspend fun Ssh.exec(cmd: String): SshResult {
    memScoped {
        val session: ssh_session = ssh_new()!!
        println("session $session")

        return try {

            val debug: Int = 0
            ssh_options_set(session, ssh_options_e.SSH_OPTIONS_USER, identity.username.cstr)
            ssh_options_set(session, ssh_options_e.SSH_OPTIONS_HOST, "192.168.3.23".cstr)
//            ssh_options_set(session, ssh_options_e.SSH_OPTIONS_LOG_VERBOSITY, debug.toString().cstr)

            ssh_connect(session).apply {
                println("ssh_connect $this")
                if (this > 0) {
                    throw Exception(ssh_get_error(session).toString())
                }
            }
            val srv_pubkey = alloc<ssh_keyVar>()
            val hash = alloc<CPointerVar<UByteVar>>()
            val hlen = alloc<size_tVar>()
            println("srv_pubkey ${srv_pubkey}")
            ssh_get_server_publickey(session, srv_pubkey.ptr).apply {
                println("ssh_get_server_publickey $this")
                println("srv_pubkey ${srv_pubkey}")
                if (this != 0) {
                    throw Exception("ssh_get_server_publickey $this")
                }
            }
            ssh_get_publickey_hash(srv_pubkey.value, ssh_publickey_hash_type.SSH_PUBLICKEY_HASH_SHA1, hash.ptr, hlen.ptr).apply {
                println("ssh_get_publickey_hash $this")
                println("hash ${hash}")
                println("hlen ${hlen.value}")
            }
            ssh_key_free(srv_pubkey.value).apply {
                println("ssh_key_free $this")
            }
            ssh_session_is_known_server(session).apply {
                println("ssh_session_is_known_server $this")
                if (this != 1) {
                    throw Exception("ssh_session_is_known_server $this")
                }
            }
            ssh_clean_pubkey_hash(hash.ptr);

            println("ssh_get_error(session).toString() ${ssh_get_error(session).rawValue}")

            ssh_userauth_password(session, null, (identity as SshIdentity.Password).password).apply {
                println("ssh_userauth_password $this")
            }
            val channel = ssh_channel_new(session)
            if (channel == null) {
                println("channel == null")
                println("ssh_get_error(session).toString() ${ssh_get_error(session)}")
                throw Exception("ssh_channel_new failed")
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

            SshResult.Success(buffer.toKString(0, rbytes), null)
        } catch (e: Exception) {
            println("ssh_get_error(session) ${ssh_get_error(session).toString()}")
            ssh_disconnect(session);
            ssh_free(session);
            ssh_finalize();
            SshResult.Failure(ssh_get_error(session).toString(), e.toString(), 1)
        }
    }
}