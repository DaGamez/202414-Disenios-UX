package com.example.appmobile.ui.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
import com.example.appmobile.ui.ButtonAppSecondary
import com.example.appmobile.ui.ButtonAppTerciario
import com.example.appmobile.ui.ImagenLibros
import com.example.appmobile.ui.InicioActividadCard
import com.example.appmobile.ui.InputTextApp
import com.example.appmobile.ui.RoutineCard
import com.example.appmobile.ui.ScreenHeader

@Composable
fun EditarActividadScreen(navHostController: NavHostController){
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
                ScreenHeader(text="Editar Actividad")
                InputTextApp(value="Salir al paradero",label="Nombre de la Actividad")
                InputTextApp(value="15",label="Duración de la Actividad en Minutos")
                InicioActividadCard("08","00")
                ImagenLibros(text="Seleccionar Imagen", navHostController)
                ButtonAppPrincipal(text="Seleccionar Canción",route="listadoRutinas",navHostController)
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement= Arrangement.SpaceBetween,
                    verticalAlignment=Alignment.CenterVertically

                ){
                    ButtonAppTerciario(text="Cancelar",route="listadoRutinas",navHostController)
                    ButtonAppTerciario(text="Guardar",route="listadoRutinas",navHostController)
                    ButtonAppTerciario(text="Eliminar",route="listadoRutinas",navHostController)
                }
            }
        }

    }
}