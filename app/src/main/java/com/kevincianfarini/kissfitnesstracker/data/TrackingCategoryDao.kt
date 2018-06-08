package com.kevincianfarini.kissfitnesstracker.data

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query

@Dao abstract class TrackingCategoryDao : BaseDao<TrackingCategory>() {

    @Query("SELECT * FROM tracking_category")
    abstract fun getAll(): LiveData<List<TrackingCategory>>

}