package com.example.myhh

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager

object SessionManager

val USER_ID = "USER_ID"
val USER_PASSWORD = "PASSWORD"

fun defaultPreference(context: Context): SharedPreferences =
    PreferenceManager.getDefaultSharedPreferences(context)

fun customPreference(context: Context): SharedPreferences =
    context.getSharedPreferences("Kundan", Context.MODE_PRIVATE)

inline fun SharedPreferences.editMe(operation: (SharedPreferences.Editor) -> Unit) {
    val editMe = edit()
    operation(editMe)
    editMe.apply()
}

var SharedPreferences.userId
    get() = getString(USER_ID, "")
    set(value) {
        editMe {
            it.putString(USER_ID, value)
        }
    }

var SharedPreferences.session
    get() = getBoolean("status", false)
    set(value) {
        editMe {
            it.putBoolean("status", value)
        }
    }
var SharedPreferences.username
    get() = getString("kk", "")
    set(value) {
        editMe {
            it.putString("kk", value)
        }
    }
var SharedPreferences.password
    get() = getString(USER_PASSWORD, "")
    set(value) {
        editMe {
            it.putString(USER_PASSWORD, value)
        }
    }

var SharedPreferences.clearValues
    get() = { }
    set(value) {
        editMe {
            it.clear()
        }
    }
/*
fun SharedPreferences.Editor.put(pair: Pair<String, Any>) {
    val key = pair.first
    val value = pair.second
    when (value) {
        is String -> putString(key, value)
        is Int -> putInt(key, value)
        is Boolean -> putBoolean(key, value)
        is Long -> putLong(key, value)
        is Float -> putFloat(key, value)
        else -> error("Only primitive types can be stored in SharedPreferences")
    }
}*/
