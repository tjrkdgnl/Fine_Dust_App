package com.hugh.core_data.di

import com.hugh.core_data.DustRepository
import com.hugh.core_data.DustRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal abstract class DustRepositoryModule {

    @Binds
    @Singleton
    abstract fun provideDustRepository(
        dustRepositoryImpl: DustRepositoryImpl
    ): DustRepository

}