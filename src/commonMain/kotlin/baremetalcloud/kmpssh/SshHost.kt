package baremetalcloud.kmpssh

interface SshHost {
    val hostname: String
    val port: Int
}

data class SshHostImpl(
    override val hostname: String,
    override val port: Int = 22
) : SshHost