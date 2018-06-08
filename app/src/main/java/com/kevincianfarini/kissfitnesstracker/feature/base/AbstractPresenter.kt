package com.kevincianfarini.kissfitnesstracker.feature.base

abstract class AbstractPresenter<T : BaseView> : BasePresenter<T> {
    var view: T? = null
        private set

    override fun attach(view: T) {
        this.view = view
    }

    override fun detach() {
        this.view = null
    }
}