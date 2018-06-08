package com.kevincianfarini.kissfitnesstracker.data

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "tracking_category")
data class TrackingCategory(
        @PrimaryKey(autoGenerate = true) val id: Long,
        var name: String = ""
)