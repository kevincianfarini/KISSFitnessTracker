package com.kevincianfarini.kissfitnesstracker.feature.base

interface BasePresenter<in T : BaseView> {
    fun attach(view: T)
    fun detach()
}