plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("com.google.dagger.hilt.android")
    kotlin("kapt")
}

android {
    namespace = "com.hugh.core_data"
    compileSdk = Versions.compile_sdk

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
    implementation(project(":core-network"))

    implementation(Deps.Hilt.core)
    kapt(Deps.Hilt.compiler)

    implementation(Deps.timber)
    implementation(Deps.kotlinx_serialization_json)

    for (dependency in Deps.Retrofit.list) {
        implementation(dependency)
    }
}