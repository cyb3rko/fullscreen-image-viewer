@file:Suppress("UnstableApiUsage")

import java.net.URI

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url = URI("https://jitpack.io") }
    }
}

include(":sample")
include(":imageviewer")
