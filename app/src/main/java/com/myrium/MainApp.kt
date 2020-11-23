package com.myrium

import android.app.Application
//import com.guilhermecardoso.core.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MainApp: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            // Koin Android logger
            androidLogger()
            //inject Android context
            androidContext(this@MainApp)
            // use modules
//            modules(networkModule)
        }
    }
}