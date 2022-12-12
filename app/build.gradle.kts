plugins {
    id ("com.android.application")
    id ("org.jetbrains.kotlin.android")
    id("com.google.dagger.hilt.android")
    kotlin("kapt")
}

android {
    namespace = "com.hugh.finedust"
    compileSdk = Versions.compile_sdk

    defaultConfig {
        applicationId = "com.hugh.finedust"
        minSdk = Versions.min_sdk
        targetSdk = Versions.target_sdk
        versionCode = Versions.version_code
        versionName = Versions.version_name

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled =  false
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

    viewBinding {
        enable = true
    }

    hilt {
        enableAggregatingTask = true
    }
}

dependencies {
    implementation(project((":core-data")))

    implementation(Deps.androidx_core)
    implementation(Deps.app_comppat)
    implementation(Deps.material)
    implementation(Deps.constraintlayout)
    testImplementation(Deps.junit)
    androidTestImplementation(Deps.junit_test)
    androidTestImplementation(Deps.espresso)

    implementation(Deps.Hilt.core)
    kapt(Deps.Hilt.compiler)

    implementation(Deps.timber)

    implementation(Deps.activity_ktx)
    implementation(Deps.viewModel_ktx)
    implementation(Deps.lifecycle_ktx)

    implementation(Deps.Glide.core)
    kapt(Deps.Glide.compiler)

}