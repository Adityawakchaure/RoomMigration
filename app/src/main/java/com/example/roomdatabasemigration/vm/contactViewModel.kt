package com.example.roomdatabasemigration.vm

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.roomdatabasemigration.data.Dao.Repositry
import com.example.roomdatabasemigration.data.Dao.entity.Contact
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

class contactViewModel @Inject constructor(val repositry: Repositry) :ViewModel(){

    private var _state= MutableStateFlow<AppState>(AppState())

    var state = _state.asStateFlow()
}

class AppState(
    var loading :Boolean =false,
    var allContacts:List<Contact> = emptyList<Contact>(),
    var error:String= " ",
    var name:MutableState<String> = mutableStateOf(""),
    var phoneNumber:MutableState<String> = mutableStateOf(""),
    var email:MutableState<String> = mutableStateOf("")
)