package com.example.roomdatabasemigration.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.roomdatabasemigration.R
import com.example.roomdatabasemigration.vm.AppState

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showSystemUi = true)

@Composable
fun AddEditScreenUi(
    onEvent: (AppState) -> Unit = {}, // Pass AppState to save data
    state: AppState = AppState() // Mutable state for name, phone, and email
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Add Contact") }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp), // Add some padding to the screen
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Profile Image
            Image(
                painter = painterResource(R.drawable.ic_launcher_background),
                contentDescription = "Profile Image",
                modifier = Modifier
                    .size(250.dp)
                    .clip(CircleShape)
            )

            Spacer(modifier = Modifier.height(16.dp)) // Space between image and text fields

            // Name Input
            OutlinedTextField(
                value = state.name,
                onValueChange = { state.name = it },
                label = { Text(text = "Your Name") },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Phone Input
            OutlinedTextField(
                value = state.phoneNumber,
                onValueChange = { state.phoneNumber = it },
                label = { Text(text = "Phone") },
                modifier = Modifier.fillMaxWidth(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone) // Add phone keyboard
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Email Input
            OutlinedTextField(
                value = state.email,
                onValueChange = { state.email = it },
                label = { Text(text = "Email") },
                modifier = Modifier.fillMaxWidth(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email) // Add email keyboard
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Save Button
            Button(
                onClick = { onEvent(state) }, // Pass the updated state back
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 60.dp)
            ) {
                Text("Save")
            }
        }
    }
}
