package com.easygautam.coordinategeometry

import android.content.Context
import android.graphics.Color
import android.graphics.Paint

class DrawingBox(private val context: Context) {

    val colors = Colors(context)
    val paints = Paints(context)


}


class Colors(context: Context) {

    val white = Color.WHITE
    val red = Color.rgb(255, 0, 0)
    val green = Color.GREEN
    val black = Color.BLACK
    val yellow = Color.YELLOW

}

class Paints(context: Context) {

    fun pen(color: Int) = fillPaint().apply {
        setColor(color)
    }


    private fun fillPaint(): Paint {
        return Paint(Paint.ANTI_ALIAS_FLAG).apply {
            style = Paint.Style.FILL
        }
    }

}
