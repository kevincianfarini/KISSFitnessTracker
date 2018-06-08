package com.kevincianfarini.kissfitnesstracker.feature.base

import android.content.Context
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.View

abstract class AbstractActivity<in V : BaseView, T : BasePresenter<V>> : AppCompatActivity(), BaseView {

    protected abstract var presenter: T

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.presenter.attach(this as V)
    }

    override fun onDestroy() {
        super.onDestroy()
        this.presenter.detach()
    }

    override fun getContext(): Context = this

    override fun showMessage(message: String, view: View, duration: Int) {
        Snackbar.make(view, message, duration)
    }

    override fun showMessage(id: Int, view: View, duration: Int) {
        Snackbar.make(view, id, duration)
    }
}