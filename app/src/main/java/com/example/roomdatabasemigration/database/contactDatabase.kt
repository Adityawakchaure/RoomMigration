package com.example.roomdatabasemigration.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.roomdatabasemigration.data.Dao.ContactDao
import com.example.roomdatabasemigration.data.Dao.entity.Contact

@Database(entities = [Contact::class], version = 1, exportSchema = false)
abstract class contactDatabase:RoomDatabase() {
   abstract fun contactDao():ContactDao
}