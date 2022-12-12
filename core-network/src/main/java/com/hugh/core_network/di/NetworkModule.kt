package com.hugh.core_network.di

import com.hugh.core_network.ApiService
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import okhttp3.Interceptor
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@OptIn(ExperimentalSerializationApi::class)
@Module
@InstallIn(SingletonComponent::class)
internal object NetworkModule {

    @Provides
    @Singleton
    fun provideApiService(
        okHttpClient: OkHttpClient,
    ) = Retrofit.Builder()
        .baseUrl("http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/")
        .client(okHttpClient)
        .addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
        .build()
        .create(ApiService::class.java)

    @Provides
    @Singleton
    fun provideOkHttpClient(
        loggingInterceptor: HttpLoggingInterceptor,
    ) = OkHttpClient.Builder()
        .connectTimeout(60L, TimeUnit.SECONDS)
        .writeTimeout(60L, TimeUnit.SECONDS)
        .readTimeout(60L, TimeUnit.SECONDS)
        .addInterceptor(loggingInterceptor)
        .build()

    @Provides
    @Singleton
    fun provideLoggingInterceptor() = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BASIC
    }

    @Provides
    @Singleton
    fun provideInterceptor() = Interceptor { chain ->
        val request = chain.request()

        chain.proceed(request)
    }
}