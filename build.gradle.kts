buildscript {
    dependencies {
        classpath(Deps.gradle_plugin)
        classpath(Deps.kotlin_plugin)
        classpath(Deps.hilt_plugin)
        classpath(Deps.kotlinx_serialization_plugin)
    }
}

plugins {
    id("com.android.application") version Versions.gradle apply false
    id("com.android.library") version Versions.gradle apply false
    id("com.google.dagger.hilt.android") version Versions.hilt apply false
    id("org.jetbrains.kotlin.android") version Versions.kotlin apply false
    id("org.jetbrains.kotlin.jvm") version Versions.kotlin apply false
}