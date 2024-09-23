import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    id("org.jetbrains.kotlin.android")
    id("com.android.application")
}

android {
    compileSdk = 35
    defaultConfig {
        applicationId = "com.stfalcon.stfalconimageviewersample"
        minSdk = 25
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        vectorDrawables.useSupportLibrary = true
    }
    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android.txt"),
                "proguard-rules.pro"
            )
        }
    }
    namespace = "com.stfalcon.sample"

    buildFeatures {
        viewBinding = true
    }
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
    implementation(project(":imageviewer"))
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("androidx.cardview:cardview:1.0.0")
    implementation("androidx.transition:transition:1.5.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.coordinatorlayout:coordinatorlayout:1.2.0")

    //UI
    implementation("com.squareup.picasso:picasso:2.71828")
}
