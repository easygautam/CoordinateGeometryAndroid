package com.easygautam.coordinategeometry

import android.util.Log

object Logger {

    private const val TAG = "CoordinateGeometry"

    private const val debug = true

    fun debug(message: String) {
        if (debug) {
            Log.d(TAG, message)
        }
    }

    fun warn(message: String?, throwable: Throwable? = null) {
        if (debug) {
            Log.w(TAG, message, throwable)
        }
    }

    fun error(message: String?, throwable: Throwable? = null) {
        if (debug) {
            Log.e(TAG, message, throwable)
        }
    }

}


