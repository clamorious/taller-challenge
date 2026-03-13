package com.example.challengelogin

import android.app.Application
import com.example.challengelogin.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class AppApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        // start Koin!
        startKoin {
            // declare used Android context
            androidContext(this@AppApplication)
            // declare modules
            modules(appModule)
        }
    }

}