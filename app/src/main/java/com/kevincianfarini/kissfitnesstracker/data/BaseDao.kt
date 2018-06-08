package com.kevincianfarini.kissfitnesstracker.data

import android.arch.persistence.room.*

@Dao
abstract class BaseDao<in T> {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun insert(value: T): Long

    @Update abstract fun update(value: T)

    @Delete abstract fun delete(value: T)

}