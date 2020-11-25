package com.easygautam.coordinategeometry

import android.content.Context
import android.util.AttributeSet
import android.view.View

abstract class BaseView : View {

    val viewPort by lazy { ViewPort() }

    constructor(context: Context) : super(context) {
        init(context)
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        init(context)
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        init(context)
    }

    constructor(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int
    ) : super(context, attrs, defStyleAttr, defStyleRes) {
        init(context)
    }

    private fun init(context: Context) {
        Logger.debug("BaseView: init()")
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        Logger.debug("BaseView: onSizeChanged(($w, $h, $oldw, $oldh))")

        // Calculate the view port size
        viewPort.setViewPortSize(w, h)

        // Calculate center
        viewPort.calculateCenter(x, y)

    }

}