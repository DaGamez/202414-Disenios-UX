package com.example.appmobile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.composable
import com.example.appmobile.ui.theme.AppmobileTheme
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.appmobile.ui.views.CrearRutinaScreen
import com.example.appmobile.ui.views.ListadoRutinasScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            AppmobileTheme {
                Navigations(navController)
            }
        }
    }
}

@Composable
fun Navigations(
    navController: NavHostController){
    NavHost(navController, startDestination = "listadoRutinas") {
        composable("listadoRutinas") {
            ListadoRutinasScreen(navController)
        }
        composable("crearRutina") {
            CrearRutinaScreen(navController)
        }
    }
}






