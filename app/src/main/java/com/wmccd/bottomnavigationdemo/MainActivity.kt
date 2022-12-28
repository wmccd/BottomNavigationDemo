package com.wmccd.bottomnavigationdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.wmccd.bottomnavigationdemo.ui.navigation.BottomNavigationBar
import com.wmccd.bottomnavigationdemo.ui.navigation.NavigationHost
import com.wmccd.bottomnavigationdemo.ui.screens.Contacts
import com.wmccd.bottomnavigationdemo.ui.screens.Favourites
import com.wmccd.bottomnavigationdemo.ui.screens.Home
import com.wmccd.bottomnavigationdemo.ui.theme.BottomNavigationDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BottomNavigationDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Bottom Navigation")
                }
            )
        },
        content = { padding -> 
            Column(
                modifier = Modifier.padding(paddingValues = padding)
            ){
                NavigationHost(navController = navController)
            }
        },
        bottomBar = {
            BottomNavigationBar(navController = navController)
        }
    )
}






@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BottomNavigationDemoTheme {
        MainScreen()
    }
}