package com.example.appmobile.ui.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.appmobile.ui.BackgroundImage
import com.example.appmobile.ui.ButtonAppPrincipal
import com.example.appmobile.ui.ScreenHeader

@Composable
fun EditarRutinaScreen(navHostController: NavHostController){
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
                ScreenHeader(text="Editar Rutina")
                Spacer(modifier = Modifier.height(200.dp))
                ButtonAppPrincipal(text="Añadir Actividad",route="listadoRutinas",navHostController)
                ButtonAppPrincipal(text="Cancelar",route="listadoRutinas",navHostController)
                ButtonAppPrincipal(text="Guardar",route="listadoRutinas",navHostController)
            }
        }

    }
}