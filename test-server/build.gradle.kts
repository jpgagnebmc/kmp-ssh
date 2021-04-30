plugins {
    kotlin("multiplatform") version "1.4.32"
    kotlin("plugin.noarg") version "1.4.32"
    kotlin("plugin.serialization") version "1.4.32"
}

group = "com.baremetalcloud.sshtestserver"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven(url = "https://s01.oss.sonatype.org/content/repositories/snapshots/")

}
val mingwPath = File(System.getenv("MINGW64_DIR") ?: "C:/msys64/mingw64")

kotlin {
    sourceSets.all {
        languageSettings.useExperimentalAnnotation("kotlin.ExperimentalStdlibApi")
    }

    jvm {
        compilations.all {
            kotlinOptions.jvmTarget = "1.8"
            kotlinOptions.freeCompilerArgs = listOf("-Xmulti-platform")
        }
        testRuns["test"].executionTask.configure {
            useJUnit()
        }
    }
    js(LEGACY) {
        useCommonJs()
        nodejs()
    }
    val hostOs = System.getProperty("os.name")
    val isMingwX64 = hostOs.startsWith("Windows")
    val nativeTarget = when {
        hostOs == "Mac OS X" -> macosX64("native")
        hostOs == "Linux" -> linuxX64("native")
        isMingwX64 -> mingwX64("native")
        else -> throw GradleException("Host OS is not supported in Kotlin/Native.")
    }
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.3")
                implementation(project(":kmp-ssh"))
//                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.1.0")
//                implementation("com.baremetalcloud:kmp-runblockingcommon:1.0-SNAPSHOT")
//                implementation("com.baremetalcloud:kmp-file:1.0-SNAPSHOT")
                implementation(project(":test-server-config"))

            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }
        val jvmMain by getting {
            dependencies {
//                implementation(project(":kmp-ssh"))

                implementation("org.apache.sshd:sshd:2.6.0")
                implementation("org.apache.sshd:sshd-core:2.6.0")
                implementation("org.apache.sshd:sshd-sftp:2.6.0")
                implementation("org.apache.sshd:sshd-common:2.6.0")
//                implementation("com.jcraft:jsch:0.1.55")

                implementation("io.github.microutils:kotlin-logging:2.0.4")
                implementation("ch.qos.logback:logback-classic:1.2.3")
            }
        }
        val jvmTest by getting {
            dependencies {
                implementation(kotlin("test-junit"))
            }
        }
    }
}
