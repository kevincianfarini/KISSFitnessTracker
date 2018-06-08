package com.kevincianfarini.kissfitnesstracker.feature.progress

import com.kevincianfarini.kissfitnesstracker.feature.base.BasePresenter
import com.kevincianfarini.kissfitnesstracker.feature.base.BaseView

interface ProgressContract {
    interface View : BaseView
    interface Presenter : BasePresenter<View>
}