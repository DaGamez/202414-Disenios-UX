package com.example.appmobile.ui.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.appmobile.ui.BackgroundImage
import com.example.appmobile.ui.ButtonAppPrincipal
import com.example.appmobile.ui.RoutineCard
import com.example.appmobile.ui.ScreenHeader
import com.example.appmobile.ui.SeleccionarImagenActividad

@Composable
fun ImagenActividadScreen(navController: NavHostController){
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
                ScreenHeader(text="Imagen Actividad")
//                SeleccionarImagenActividad(text="Imagen")
                LazyVerticalGrid(
                    columns = GridCells.Fixed(2), // 2 columns
                    contentPadding = PaddingValues(0.dp), // Padding around the grid
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(8.dp), // Space between rows
                    horizontalArrangement = Arrangement.spacedBy(8.dp), // Space between columns
                    content = {
                        items(6) { index -> // 6 items for 3 rows
                            SeleccionarImagenActividad(text = "Imagen ${index + 1}")
                        }
                    }
                )
                ButtonVolver(text="Volver",route="nuevaActividad",navController)
            }
        }

    }
}

@Composable
fun ButtonVolver(text: String="Boton",route: String = "",navigationController:NavHostController) {
    Button(
        onClick = {navigationController.navigate(route)},
        modifier = Modifier
            .padding(0.dp)
            .size(width = 145.dp, height = 40.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1A661A))
    ) {
        Text(text = text,fontSize = 18.sp)
    }
}