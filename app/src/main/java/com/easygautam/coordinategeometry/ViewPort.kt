package com.easygautam.coordinategeometry

import android.graphics.Point

class ViewPort {

    var width: Int = 0
    var height: Int = 0
    var center: Point = Point(0, 0)

    fun setViewPortSize(width: Int, height: Int) {

        // Set view height and width
        when {
            width < 0 -> {
                this.width = 0
            }
            height < 0 -> {
                this.height = 0
            }
            else -> {
                this.width = width
                this.height = height
            }
        }

    }


    /**
     * calculate the center of view by view x, y position
     *
     * @param x
     * @param y
     */
    fun calculateCenter(x: Float, y: Float) {
        val centerX = x + (width / 2)
        val centerY = y + (height / 2)

        center.set(centerX.toInt(), centerY.toInt())
        Logger.debug("ViewPort: calculateCenter($x, $y), centerX: $centerX, centerY: $centerY")
    }


}