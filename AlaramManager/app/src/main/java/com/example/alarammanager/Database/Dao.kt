package com.example.alarammanager.Database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.alarammanager.Entity.Alarm


import androidx.lifecycle.LiveData

@Dao
interface Dao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(alarm: Alarm)

    @Delete
    fun delete(alarm: Alarm)

    @Query("SELECT * from alarm_table ORDER BY id ASC")
    fun getAllAlarms(): LiveData<List<Alarm>>

}

