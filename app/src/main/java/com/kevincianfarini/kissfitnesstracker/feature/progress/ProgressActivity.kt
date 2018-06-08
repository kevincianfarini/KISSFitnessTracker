package com.kevincianfarini.kissfitnesstracker.feature.progress

import android.arch.persistence.room.Room
import android.content.Context
import android.os.Bundle
import com.kevincianfarini.kissfitnesstracker.R
import com.kevincianfarini.kissfitnesstracker.data.AppDatabase
import com.kevincianfarini.kissfitnesstracker.data.TrackingCategory
import com.kevincianfarini.kissfitnesstracker.feature.base.AbstractActivity
import kotlinx.coroutines.experimental.android.UI
import kotlinx.coroutines.experimental.launch

class ProgressActivity : AbstractActivity<ProgressContract.View, ProgressContract.Presenter>(),
        ProgressContract.View {

    override var presenter: ProgressContract.Presenter = ProgressPresenter()
    private val database: AppDatabase by lazy {
        Room.databaseBuilder(
                this as Context,
                AppDatabase::class.java,
                "db.sqlite3"
        ).fallbackToDestructiveMigration().build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progress)

        launch(UI) {
            database.trackingCategoryDao().insert(
                    TrackingCategory(-1, "Test")
            )
        }

    }
}
