package com.baremetalcloud.testserverconfig


sealed class TestSshIdentity {
    abstract val username: String

    data class Password(
        override val username: String,
        val password: String,
    ) : TestSshIdentity()

    sealed class Key : TestSshIdentity() {
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

data class SshTestServerConfig(
    val hostname: String,
    val port: Int,
    val identities: List<TestSshIdentity>,

    )
val basicAuthSshServer: SshTestServerConfig = SshTestServerConfig(hostname= "localhost", port = 2222, identities= listOf(TestSshIdentity.Password("someuser", "somepass")))
val allTestServerConfigs: List<SshTestServerConfig> = listOf(basicAuthSshServer)

