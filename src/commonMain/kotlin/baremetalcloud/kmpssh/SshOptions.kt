package baremetalcloud.kmpssh

interface SshOptions {
    val timeout: Long
    val connectTimeout: Long
    val retryCount: Int
    val retryDelay: Long
    val execWithPty: Boolean
    val charset: String
}

data class SshOptionsImpl(
    override val timeout: Long = 0,
    override val connectTimeout: Long = 30000,
    override val retryCount: Int = 5,
    override val retryDelay: Long = 2000,
    override val execWithPty: Boolean = false,
    override val charset: String = "ISO-8859-15",

    ) : SshOptions