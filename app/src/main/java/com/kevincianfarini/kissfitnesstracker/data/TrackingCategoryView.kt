//package com.kevincianfarini.kissfitnesstracker.data
//
//import android.arch.persistence.room.Embedded
//import android.arch.persistence.room.Relation
//
//class TrackingCategoryView(
//        @Embedded var category: TrackingCategory = TrackingCategory(-1, ""),
//        @Relation(
//                parentColumn = "id",
//                entityColumn = "category",
//                entity = DataPoint::class
//        )
//        var dataPoints: List<DataPoint> = listOf()
//)