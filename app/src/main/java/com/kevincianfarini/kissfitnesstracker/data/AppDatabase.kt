package com.kevincianfarini.kissfitnesstracker.data

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

@Database(
        entities = [TrackingCategory::class],
        version = 1
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun trackingCategoryDao(): TrackingCategoryDao
//    abstract fun dataPointDao(): DataPointDao

}