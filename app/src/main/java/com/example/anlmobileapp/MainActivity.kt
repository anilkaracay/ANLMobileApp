package com.example.anlmobileapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent


import androidx.compose.runtime.Composable
import com.example.anlmobileapp.ui.theme.ANLMobileAppTheme
import com.example.anlmobileapp.screens.HomeScreen
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController
import com.example.anlmobileapp.screens.DetailScreen


class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      ANLMobileAppTheme {
        StackNavigator()
      }
    }
  }

  @Composable
  fun StackNavigator() {
    val navController = rememberNavController()
    NavHost(navController, "home/{firstname}") {
      composable(
        "home/{firstname}",
        arguments=listOf(navArgument("firstname"){type=NavType.StringType})

      ) {backStackEntry->
        HomeScreen(navController,backStackEntry.arguments?.getString("firstname"))

      }
      composable("detail") {
        DetailScreen(navController)
      }
    }
  }
}






