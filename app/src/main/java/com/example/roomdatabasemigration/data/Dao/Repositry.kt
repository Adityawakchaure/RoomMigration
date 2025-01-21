package com.example.roomdatabasemigration.data.Dao

import com.example.roomdatabasemigration.data.Dao.entity.Contact

class Repositry(
    private val contactDao: ContactDao
) {

    fun insertContact(contact: Contact)= contactDao.InsertContact(contact)
    fun deleteContact(contact: Contact)=contactDao.DeleteContact(contact)
    fun updateContact(contact: Contact)=contactDao.UpdateContact(contact)
    fun getAllContact()=contactDao.GetContact()
}