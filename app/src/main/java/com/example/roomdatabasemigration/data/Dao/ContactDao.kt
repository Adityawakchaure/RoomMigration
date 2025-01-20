package com.example.roomdatabasemigration.data.Dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.roomdatabasemigration.data.Dao.entity.Contact

@Dao
interface ContactDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun InsertContact(contact: Contact)

    @Delete
    fun DeleteContact(contact:Contact)

    @Update
    fun UpdateContact(contact: Contact)

    @Query("select * from Contact")
    fun GetContact():List<Contact>
}