package com.example.appmobile.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.appmobile.R

@Composable
fun BackgroundImage() {
    Image(
        painter = painterResource(id = R.drawable.background_mobile), // Replace with your image
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier.fillMaxSize()
    )
}

@Composable
fun ButtonAppPrincipal(text: String="Boton",route: String = "",navigationController:NavHostController) {
    Button(
        onClick = {navigationController.navigate(route)},
        modifier = Modifier
            .padding(0.dp)
            .size(width = 269.dp, height = 59.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1A661A))
    ) {
        Text(text = text,fontSize = 18.sp)
    }
}

@Composable
fun ButtonAppSecondary(text: String="Boton",route: String = "",navigationController:NavHostController) {
    Button(
        onClick = {navigationController.navigate(route)},
        modifier = Modifier
            .padding(0.dp)
            .size(width = 150.dp, height = 50.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1A661A))
    ) {
        Text(text = text,fontSize = 16.sp)
    }
}

@Composable
fun smallEditButton(navigationController:NavHostController) {
    Button(
        onClick = {navigationController.navigate("")},
        modifier = Modifier
            .padding(0.dp)
            .size(width = 80.dp, height = 40.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1A661A))
    ) {
        Text(text = "Editar",fontSize = 12.sp)
    }
}

@Composable
fun RoutineCard(nombre_rutina: String = "Nombre Rutina",navigationController:NavHostController){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(Color(0xFFFFEB3B))
            .padding(8.dp)
            .clickable { navigationController.navigate("editarRutina") }
        ,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(64.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(Color.White)
        ) {
            Image(
                painter = painterResource(id = R.drawable.imagen_libros),
                contentDescription = "Rutina Colegio Icon",
                modifier = Modifier.size(48.dp).align(Alignment.Center)
            )
        }

        Spacer(modifier = Modifier.width(16.dp))

        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = nombre_rutina,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Rutina de la mañana niños",
                fontSize = 14.sp,
                color = Color.Gray
            )
        }

        Icon(
            imageVector = Icons.Default.PlayArrow,
            contentDescription = "Play",
            tint = Color.Black,
            modifier = Modifier.size(60.dp)
        )
    }
}

@Composable
fun ActivityCard(nombre_rutina: String = "Nombre Actividad", description:String="Content", navigationController:NavHostController){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(Color(0xFFFFEB3B))
            .padding(8.dp)
            .clickable { navigationController.navigate("editarRutina") }
        ,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(64.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(Color.White)
        ) {
            Image(
                painter = painterResource(id = R.drawable.imagen_libros),
                contentDescription = "imagenLibrosIcon",
                modifier = Modifier.size(48.dp).align(Alignment.Center)
            )
        }

        Spacer(modifier = Modifier.width(16.dp))

        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = nombre_rutina,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = description,
                fontSize = 14.sp,
                color = Color.Gray
            )
        }

        smallEditButton(navigationController)
    }
}


@Composable
fun ScreenHeader(text : String = "Título") {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFFFD700)) // Bright yellow background
            .padding(vertical = 16.dp, horizontal = 24.dp)
    ) {
        Text(
            text = text,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            modifier = Modifier.align(Alignment.Center)
        )
    }
}

@Composable
fun IntermediateHeader(text : String = "Título Intermedio") {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFFFD700)) // Bright yellow background
            .padding(vertical = 4.dp, horizontal = 24.dp)
            .height(30.dp)
    ) {
        Text(
            text = text,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            modifier = Modifier.align(Alignment.Center)
        )
    }
}

@Composable
fun inputTextApp(value:String ="Input Text",label:String="Label Text"){
    TextField(
        value = value,
        onValueChange = {},
        label = { Text(label) },
        modifier = Modifier.fillMaxWidth()
    )
}