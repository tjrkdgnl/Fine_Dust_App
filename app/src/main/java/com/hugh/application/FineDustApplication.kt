package com.hugh.application

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class FineDustApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        Timber.plant(Timber.DebugTree())
    }
}