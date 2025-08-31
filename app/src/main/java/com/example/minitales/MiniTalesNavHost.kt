package com.example.minitales

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.auth.authNavGraph
import com.example.auth.authRoute

@Composable
fun MiniTalesNavHost(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        startDestination = authRoute
    ) {
        authNavGraph(
            navController = navHostController,
            onAuthSuccess = {
                // Handle post-authentication navigation here
            }
        )
    }
}