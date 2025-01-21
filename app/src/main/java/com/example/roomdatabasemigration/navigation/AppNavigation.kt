package com.example.roomdatabasemigration.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun  AppNavigation(modifier: Modifier) {
var navcantroller= rememberNavController()

    NavHost(navController = navcantroller, startDestination = Routes.HomeScreen)
    {
        composable<Routes.HomeScreen> {

        }
        composable<Routes.AddEditScreen> {

        }
    }
}