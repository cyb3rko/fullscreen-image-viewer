import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    id("org.jetbrains.kotlin.android")
    id("com.android.library")
}

android {
    compileSdk = 35
    defaultConfig {
        minSdk = 25
    }
    namespace = "com.stfalcon.imageviewer"

    kotlin {
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_17)
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("androidx.transition:transition:1.5.1")
    implementation("com.github.chrisbanes:PhotoView:2.2.0")
}
