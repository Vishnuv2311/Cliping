package dev.vishnuv.cliping

import android.graphics.Outline
import android.view.View
import android.view.ViewOutlineProvider

//    cornerRadius is passing to dynamically reuse the same class
class ClipOutlineProvider(private val cornerRadius: Float) : ViewOutlineProvider() {
    override fun getOutline(view: View, outline: Outline) {
        outline.setRoundRect(0, 0, view.width, view.height, cornerRadius)
    }
}