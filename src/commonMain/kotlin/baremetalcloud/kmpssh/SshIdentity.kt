package baremetalcloud.kmpssh

sealed class SshIdentity {
    abstract val username: String

    data class Password(
        override val username: String,
        val password: String,
    ) : SshIdentity()

    sealed class Key : SshIdentity() {
        abstract val privateKey: String
        abstract val passphrase: String?

        data class Root(
            override val username: String = "root",
            override val privateKey: String,
            override val passphrase: String? = null,
        ) : Key()

        data class User(
            override val username: String,
            override val privateKey: String,
            override val passphrase: String? = null,
        ) : Key()
    }
}
val SshIdentity.passphrase: String?
    get() = when (this) {
        is SshIdentity.Key -> passphrase
        is SshIdentity.Password -> null
    }
val SshIdentity.password: String?
    get() = when (this) {
        is SshIdentity.Password -> password
        is SshIdentity.Key -> null
    }