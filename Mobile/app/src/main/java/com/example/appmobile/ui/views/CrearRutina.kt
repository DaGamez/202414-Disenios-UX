package com.example.appmobile.ui.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.appmobile.ui.ActivityCard
import com.example.appmobile.ui.BackgroundImage
import com.example.appmobile.ui.ButtonAppPrincipal
import com.example.appmobile.ui.ButtonAppSecondary
import com.example.appmobile.ui.IntermediateHeader
import com.example.appmobile.ui.ScreenHeader
import com.example.appmobile.ui.inputTextApp

@Composable
fun CrearRutinaScreen(navHostController: NavHostController){
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
                ScreenHeader(text="Crear Rutina")
                inputTextApp(value="Colegio Niños",label="Nombre de la Rutina")
                IntermediateHeader(text="Actividades de tu Rutina")
                ActivityCard(nombre_rutina="Bañarse",description="Inicio y Duracion",navHostController)
                ActivityCard(nombre_rutina="Desayunar",description="Inicio y Duracion",navHostController)
                ButtonAppPrincipal(text="Añadir Actividad",route="listadoRutinas",navHostController)

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement= Arrangement.SpaceBetween,
                    verticalAlignment=Alignment.CenterVertically

                    ){
                ButtonAppSecondary(text="Cancelar",route="listadoRutinas",navHostController)
                ButtonAppSecondary(text="Guardar",route="listadoRutinas",navHostController)
                }
            }
        }

    }
}