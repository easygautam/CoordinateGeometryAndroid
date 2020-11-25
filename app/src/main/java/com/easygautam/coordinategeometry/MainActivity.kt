package com.easygautam.coordinategeometry

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val rootView = CartesianPlaneView(this)
        rootView.setBackgroundColor(R.color.purple_500)

        setContentView(rootView)


//        rootView.setOnTouchListener(View.OnTouchListener { v, event ->
//            Logger.debug("RootView::Touch X: ${event.x}, Y: ${event.y}")
//            return@OnTouchListener true
//        })

    }
}