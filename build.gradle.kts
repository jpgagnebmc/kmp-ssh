plugins {
    kotlin("multiplatform") version "1.4.32"
    kotlin("plugin.noarg") version "1.4.32"
    kotlin("plugin.serialization") version "1.4.32"
    id("maven-publish")
}

group = "baremetalcloud.kmp-ssh"
version = "1.0-SNAPSHOT"

repositories {
    mavenLocal()
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
//    nativeTarget.apply {
//        binaries {
//            executable {
//                entryPoint = "main"
//                if (isMingwX64) {
//                    // Add lib path to `libcurl` and its dependencies:
//                    linkerOpts("-L${mingwPath.resolve("lib")}")
//                    runTask?.environment("PATH" to mingwPath.resolve("bin"))
//                }
////                runTask?.args("https://www.jetbrains.com/")
//            }
//        }
//
//        compilations["main"].cinterops {
//            val main by compilations.getting
//            val libssh by main.cinterops.creating {
//                when (preset) {
//////                    presets["macosX64"] -> includeDirs.headerFilterOnly("/opt/local/include", "/usr/local/include")
//                    presets["linuxX64"] -> includeDirs.headerFilterOnly("/usr/local/include", "/usr/local/lib")
//////                    presets["mingwX64"] -> includeDirs.headerFilterOnly(mingwPath.resolve("include"))
//                }
//            }
//        }

//        mavenPublication {
//            pom {
//                withXml {
//                    val root = asNode()
//                    root.appendNode("name", "libssh interop library")
//                    root.appendNode("description", "A library providing interoperability with host libssh")
//                }
//            }
//        }
//    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.3")

                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.1.0")
                implementation("baremetalcloud:kmp-runblocking:1.0-SNAPSHOT")
                implementation("baremetalcloud:kmp-file:1.0-SNAPSHOT")

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
                implementation("baremetalcloud:libssh:1.4-SNAPSHOT")
//                implementation(files("/home/jp/baremetalcloud/libssh/build/libs/native/main/libssh-cinterop-libssh.klib"))

            }
        }
        val nativeTest by getting
    }
}
