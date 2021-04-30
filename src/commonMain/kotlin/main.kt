
import baremetalcloud.runblockingcommon.runBlockingCommon
import com.baremetalcloud.kmpfile.File
import com.baremetalcloud.kmpfile.readText
import com.baremetalcloud.kmpssh.*
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json

@Serializable
data class TestSshConfig(val username: String, val password: String, val hostname: String)

fun main(args: Array<String>) {
    println("MAIN!!!!!!!!!!")

    runBlockingCommon {
        val config =
            Json.decodeFromString(TestSshConfig.serializer(), File("~/.affair/TestSshConfig.json").readText())
        println("helloWorld START $config")

        val client = com.baremetalcloud.kmpssh.Ssh(
            host = com.baremetalcloud.kmpssh.SshHostImpl(hostname = config.hostname),
            identity = SshIdentity.Password(username = config.username, password = config.password),
            options = SshOptionsImpl(),
        )
        println(client)
        client.exec("echo 'hello world'").apply {
            println("exec returned $out")
//            assertTrue(out.trim() == "hello world")
        }
        println("helloWorld END")
    }

}