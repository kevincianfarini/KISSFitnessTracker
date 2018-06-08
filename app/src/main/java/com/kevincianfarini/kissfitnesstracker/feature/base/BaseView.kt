package com.kevincianfarini.kissfitnesstracker.feature.base

import android.content.Context
import android.support.annotation.StringRes
import android.support.design.widget.Snackbar
import android.view.View

interface BaseView {
    fun getContext() : Context
    fun showMessage(message: String, view: View, duration: Int = Snackbar.LENGTH_LONG)
    fun showMessage(id: Int, view: View, duration: Int = Snackbar.LENGTH_LONG)
}