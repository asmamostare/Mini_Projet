package com.projet.mini_projet

import android.app.Application
import android.util.Log
import com.facebook.stetho.BuildConfig
import com.projet.mini_projet.di.AppComponent
import com.projet.mini_projet.di.DaggerAppComponent
import com.facebook.stetho.Stetho

class EcomApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        if(BuildConfig.DEBUG) {
            Stetho.initializeWithDefaults(this)
            Log.d(TAG, " >>> Initializing Stetho")
        }

        appComponent = DaggerAppComponent.builder().application(this).build()
    }

    companion object {
        const val TAG = "EcomApplication"

        private var appComponent: AppComponent? = null

        fun getAppComponent(): AppComponent? {
            return appComponent
        }
    }

}