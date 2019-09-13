package com.miller.androidcomponentshowcase

import android.app.Application
import com.miller.androidcomponentshowcase.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

/**
 * Created by Miller on 13/09/2019
 */

class KoinApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@KoinApplication)
            modules(listOf(viewModelModule))
        }
    }
}