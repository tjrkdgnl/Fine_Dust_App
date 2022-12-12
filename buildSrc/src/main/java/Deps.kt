object Deps {
    const val gradle_plugin = "com.android.tools.build:gradle:${Versions.gradle}"
    const val kotlin_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val hilt_plugin = "com.google.dagger:hilt-android-gradle-plugin:${Versions.hilt}"
    const val kotlinx_serialization_plugin =
        "org.jetbrains.kotlin:kotlin-serialization:${Versions.kotlin}"

    val androidx_core by lazy { "androidx.core:core-ktx:${Versions.core_ktx}" }
    val app_comppat by lazy { "androidx.appcompat:appcompat:${Versions.app_compat}" }
    val material by lazy { "com.google.android.material:material:${Versions.material}" }
    val constraintlayout by lazy { "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}" }
    val junit by lazy { "junit:junit:${Versions.junit}" }
    val junit_test by lazy { "androidx.test.ext:junit:${Versions.junit_test}" }
    val espresso by lazy { "androidx.test.espresso:espresso-core:${Versions.espresso}" }
    val timber by lazy { "com.jakewharton.timber:timber:${Versions.timber}" }
    val viewModel_ktx by lazy { "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.viewModel_ktx}" }
    val activity_ktx by lazy { "androidx.activity:activity-ktx:${Versions.activity_ktx}" }
    val lifecycle_ktx by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle_ktx}" }
    val kotlinx_serialization_json by lazy { "org.jetbrains.kotlinx:kotlinx-serialization-json:${ Versions.kotlinx_serialization_json }" }


    object Hilt {
        val core by lazy { "com.google.dagger:hilt-android:${Versions.hilt}" }
        val compiler by lazy { "com.google.dagger:hilt-android-compiler:${Versions.hilt}" }
    }

    object Retrofit {
        private val retrofit by lazy { "com.squareup.retrofit2:retrofit:${Versions.retrofit}" }
        private val kotlinx_serialization_converter by lazy {
            "com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:${Versions.kotlinx_serialization_converter}"
        }
        private val okHttp by lazy { "com.squareup.okhttp3:okhttp:${Versions.okhttp}" }
        private val loggingInterceptor by lazy { "com.squareup.okhttp3:logging-interceptor:${Versions.logging_interceptor}" }

        val list = mutableListOf(
            retrofit,
            kotlinx_serialization_converter,
            okHttp,
            loggingInterceptor
        )
    }

    object Glide {
        val core by lazy { "com.github.bumptech.glide:glide:${Versions.glide}" }
        val compiler by lazy { "com.github.bumptech.glide:compiler:${Versions.glide}" }
    }
}