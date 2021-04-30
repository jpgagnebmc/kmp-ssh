plugins {
    kotlin("multiplatform") version "1.4.32"
    kotlin("plugin.noarg") version "1.4.32"
    kotlin("plugin.serialization") version "1.4.32"
    id("maven-publish")
}

group = "com.baremetalcloud.kmp-ssh"
version = "1.0-SNAPSHOT"

repositories {
    maven(url = "https://s01.oss.sonatype.org/content/repositories/snapshots/")
    mavenCentral()
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

                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.1.0")
                implementation("com.baremetalcloud:kmp-runblockingcommon:1.0-SNAPSHOT")
                implementation("com.baremetalcloud:kmp-file:1.0-SNAPSHOT")

            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
                implementation(project(":test-server-config"))
            }
        }
        val jvmMain by getting {
            dependencies {
                implementation("com.jcraft:jsch:0.1.55")
            }
        }
        val jvmTest by getting {
            dependencies {
                implementation(kotlin("test-junit"))
            }
        }
        val jsExternal by creating {
            kotlin.srcDirs("src/jsExternal")
        }
        val jsMain by getting {
            dependsOn(jsExternal)
            dependencies {
                implementation(npm("ssh2", "0.8.9"))
                implementation(npm("@types/ssh2", "0.5.46"))
            }
        }
        val jsTest by getting {
            dependencies {
                implementation(kotlin("test-js"))
            }
        }
        val nativeMain by getting {
            dependencies {
                implementation("com.baremetalcloud:libssh:0.9.5-SNAPSHOT")
            }
        }
        val nativeTest by getting
    }
}
