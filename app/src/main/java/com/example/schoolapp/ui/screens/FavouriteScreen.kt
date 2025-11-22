package com.example.schoolapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.schoolapp.ui.components.SchoolCard
import com.example.schoolapp.ui.components.TopBar

@Composable
fun FavouriteScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        TopBar(
            title = "Favourite", 
            showMenu = true, 
            showNotification = true,
            backgroundColor = Color.White,
            contentColor = Color.Black
        )
        
        LazyColumn(
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
             items(2) {
                SchoolCard()
            }
        }
    }
}

@Preview
@Composable
fun FavouriteScreenPreview() {
    FavouriteScreen(rememberNavController())
}
