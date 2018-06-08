//package com.kevincianfarini.kissfitnesstracker.data
//
//import android.arch.persistence.room.Entity
//import android.arch.persistence.room.ForeignKey
//import android.arch.persistence.room.Index
//import android.arch.persistence.room.PrimaryKey
//
//@Entity(
//        tableName = "data_point",
//        indices = [Index(value = ["category"], name = "idx")],
//        foreignKeys = [(ForeignKey(
//                entity = TrackingCategory::class,
//                parentColumns = ["id"],
//                childColumns = ["category"]
//        ))]
//)
//data class DataPoint(
//        @PrimaryKey(autoGenerate = true) val id: Int,
//        var category: Int,
//        var data: Double
//)