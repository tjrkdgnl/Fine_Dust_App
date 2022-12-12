import com.android.build.gradle.internal.cxx.configure.gradleLocalProperties

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("com.google.dagger.hilt.android")
    id("kotlinx-serialization")
    kotlin("kapt")
}

android {
    namespace = "com.hugh.core_network"
    compileSdk = Versions.compile_sdk

    defaultConfig{

        buildConfigField("String", "serviceKey", gradleLocalProperties(rootDir).getProperty("serviceKey"))
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    hilt {
        enableAggregatingTask = true
    }
}

dependencies {

    implementation(Deps.Hilt.core)
    kapt(Deps.Hilt.compiler)

    implementation(Deps.timber)
    implementation(Deps.kotlinx_serialization_json)

    for (dependency in Deps.Retrofit.list) {
        implementation(dependency)
    }
}