package dev.tidalforge.sonarcharge

import android.app.Application
import dev.tidalforge.sonarcharge.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class SonarChargeApp: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@SonarChargeApp)
            modules(appModule)
        }
    }
}