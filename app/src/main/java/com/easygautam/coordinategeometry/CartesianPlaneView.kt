package com.easygautam.coordinategeometry

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Point
import android.util.AttributeSet
import android.view.MotionEvent

class CartesianPlaneView : BaseView {

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
    }

    constructor(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int
    ) : super(context, attrs, defStyleAttr, defStyleRes) {
    }

    private val drawingBox by lazy { DrawingBox(context) }

    private var mTick: Point? = null

    override fun onDraw(canvas: Canvas) {

        with(canvas) {

            val centerX = viewPort.center.x.toFloat()
            val centerY = viewPort.center.y.toFloat()

            val redPen = drawingBox.paints.pen(drawingBox.colors.red)

            // Draw vertical line at center
            drawLine(centerX, 0f, centerX, viewPort.height.toFloat(), redPen)

            // Draw horizontal line
            drawLine(0f, centerY, viewPort.width.toFloat(), centerY, redPen)

            // draw line from center to tick
            mTick?.let {
                drawLine(centerX, centerY, it.x.toFloat(), it.y.toFloat(), redPen)
            }

        }

    }


    @SuppressLint("ClickableViewAccessibility")
    override fun onTouchEvent(event: MotionEvent): Boolean {

        when (event.action) {

            MotionEvent.ACTION_DOWN -> {
                mTick = Point(event.x.toInt(), event.y.toInt())
                invalidate()
            }

            MotionEvent.ACTION_MOVE -> {
                mTick?.set(event.x.toInt(), event.y.toInt())
                invalidate()
            }

            MotionEvent.ACTION_UP -> {
                mTick = null
                invalidate()
            }

        }

        return true

    }

}