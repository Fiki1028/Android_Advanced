package com.example.alarammanager.Entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//@Entity(tableName = "alarm_table")
//data class Alarm(
//    @PrimaryKey(autoGenerate = true)
//    val id: Long = 0,
//    val hour: Int,
//    val minute: Int,
//    val label: String,
//    val isEnabled: Boolean
//)

@Entity(tableName = "alarm_table")
data class Alarm(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo(name = "hour")
    val hour: Int,
    @ColumnInfo(name = "minute")
    val minute: Int,
    @ColumnInfo(name = "label")
    val label: String,
    @ColumnInfo(name = "isEnabled")
    val isEnabled: Boolean
)



