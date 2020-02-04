package com.example.mg.masterdetail

import android.app.Activity
import android.app.Application
import android.content.Context
import com.example.mg.masterdetail.di.appModule
import com.example.mg.masterdetail.di.dayViewModelModule
import com.example.mg.masterdetail.di.networkModule
import com.squareup.leakcanary.LeakCanary
import com.squareup.leakcanary.RefWatcher
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class WeatherApplication : Application() {
    private var mRefWatcher: RefWatcher? = null

    companion object {
        operator fun get(activity: Activity): WeatherApplication {
            return activity.application as WeatherApplication
        }

        fun getRefWatcher(context: Context): RefWatcher? {
            val application = context.applicationContext as WeatherApplication
            return application.mRefWatcher
        }
    }

    override fun onCreate() {
        super.onCreate()
        initLeakCanary()
        initKoin()
    }

    private fun initLeakCanary() {
        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return
        }
        mRefWatcher = LeakCanary.install(this)
    }

    private fun initKoin() {
        startKoin {
            androidContext(this@WeatherApplication)
            modules(listOf(appModule, networkModule, dayViewModelModule))
        }
    }
}