plugins {
    kotlin("multiplatform") version "1.4.32"
    kotlin("plugin.noarg") version "1.4.32"
    kotlin("plugin.serialization") version "1.4.32"
}

group = "com.baremetalcloud.testserverconfig"
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
            }
        }
        val jvmTest by getting {
            dependencies {
                implementation(kotlin("test-junit"))
            }
        }
    }
}
