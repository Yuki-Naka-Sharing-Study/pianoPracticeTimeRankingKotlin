package com.example.piano_practice_time_ranking

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_data_table")
data class UserEntity(
    @PrimaryKey(autoGenerate = true)
    var userId: Int = 0,

    @ColumnInfo(name = "name_of_user")
    var nameOfUser: String = "",

    @ColumnInfo(name = "today")
    var today: String = "",

    @ColumnInfo(name = "hour_of_practice_time")
    var hourOfPracticeTime: String = "",

    @ColumnInfo(name = "minute_of_practice_time")
    var minuteOfPracticeTime: String = "",
)