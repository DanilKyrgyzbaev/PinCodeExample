package com.abakumov.pincode_example.pref

import android.content.Context
import android.content.SharedPreferences
import android.text.TextUtils
import com.abakumov.pincode_example.AppModule

object Pref{
    private val spBigPref: SharedPreferences by lazy {
        AppModule.getInstance().getSharedPreferences("com.abakumov.pincode_example", Context.MODE_PRIVATE)
    }

    private fun loadInBigPref(key: String, default: String? = null): String? =
        spBigPref.getString(key, default)

    private fun saveInBigPref(key: String, value: String?) {
        val edit = spBigPref.edit()
        if (value != null) {
            edit.putString(key, value)
        } else {
            edit.remove(key)
        }
        edit.apply()
    }

    private val sheredPreferences
    get() = AppModule.sheredPrefs

    var localPassword: String
    get() = sheredPreferences.getString("pin","") ?: ""
    set(value) = sheredPreferences.edit().putString("pin",value).apply()

    var isFirst: Boolean
        get() = sheredPreferences.getBoolean("isFir",true)
        set(value) = sheredPreferences.edit().putBoolean("isFir",value).apply()

}
