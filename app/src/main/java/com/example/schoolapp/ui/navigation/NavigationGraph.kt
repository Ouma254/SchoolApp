package com.example.schoolapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.schoolapp.ui.screens.FavouriteScreen
import com.example.schoolapp.ui.screens.HomeScreen
import com.example.schoolapp.ui.screens.LoginScreen
import com.example.schoolapp.ui.screens.NotificationScreen
import com.example.schoolapp.ui.screens.ProfileScreen
import com.example.schoolapp.ui.screens.SearchScreen

@Composable
fun NavigationGraph(navController: NavHostController, startDestination: String) {
    NavHost(navController = navController, startDestination = startDestination) {
        composable(Screen.Login.route) {
            LoginScreen(navController)
        }
        composable(Screen.Home.route) {
            HomeScreen(navController)
        }
        composable(Screen.Search.route) {
            SearchScreen(navController)
        }
        composable(Screen.Favourite.route) {
            FavouriteScreen(navController)
        }
        composable(Screen.Notification.route) {
            NotificationScreen(navController)
        }
        composable(Screen.Profile.route) {
            ProfileScreen(navController)
        }
    }
}
