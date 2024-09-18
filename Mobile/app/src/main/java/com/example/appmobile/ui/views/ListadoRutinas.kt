package com.example.appmobile.ui.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.appmobile.ui.BackgroundImage
import com.example.appmobile.ui.ButtonAppPrincipal
import com.example.appmobile.ui.RoutineCard
import com.example.appmobile.ui.TusRutinasHeader

@Composable
fun ListadoRutinasScreen(){
    Box(modifier = Modifier.fillMaxSize()) {

        BackgroundImage()
        // A surface container using the 'background' color from the theme
        Surface(
            //modifier = Modifier.fillMaxSize(),
            color = Color.Transparent
        ) {
            Column(
                modifier = Modifier.fillMaxSize().padding(60.dp),
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                TusRutinasHeader()
                RoutineCard("Rutina Colegio")
                RoutineCard("Estudio Niños")
                RoutineCard("Deporte Juanse")
                ButtonAppPrincipal()
            }
        }

    }
}