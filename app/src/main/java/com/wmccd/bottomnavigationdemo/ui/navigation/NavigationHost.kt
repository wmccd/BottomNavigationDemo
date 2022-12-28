package com.wmccd.bottomnavigationdemo.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.wmccd.bottomnavigationdemo.NavRoutes
import com.wmccd.bottomnavigationdemo.ui.screens.Contacts
import com.wmccd.bottomnavigationdemo.ui.screens.Favourites
import com.wmccd.bottomnavigationdemo.ui.screens.Home

@Composable
fun NavigationHost(navController: NavHostController){

    NavHost(navController = navController, startDestination = NavRoutes.Home.route){
        composable(route = NavRoutes.Home.route){
            Home()
        }
        composable(route = NavRoutes.Contacts.route){
            Contacts()
        }
        composable(route = NavRoutes.Favourites.route){
            Favourites()
        }
    }
}