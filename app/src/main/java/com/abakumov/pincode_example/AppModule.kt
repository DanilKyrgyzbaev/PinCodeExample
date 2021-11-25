package com.abakumov.pincode_example

import android.app.Application
import android.content.Context
import android.content.SharedPreferences

class AppModule: Application() {

    override fun onCreate() {
        super.onCreate()
        sheredPrefs = getSharedPreferences("com.abakumov.pincode_example", Context.MODE_PRIVATE)
    }

    companion object {
        private var instance: AppModule? = null
        lateinit var sheredPrefs: SharedPreferences
        lateinit var context: Context
        fun getInstance(): AppModule = instance!!
    }
}