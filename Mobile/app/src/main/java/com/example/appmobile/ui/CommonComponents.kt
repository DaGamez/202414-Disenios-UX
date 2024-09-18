package com.example.appmobile.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
fun ButtonAppPrincipal() {
    Button(
        onClick = {},
        modifier = Modifier
            .padding(0.dp)
            .size(width = 269.dp, height = 59.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1A661A))
    ) {
        Text(text = "Crear Rutina")
    }
}

@Composable
fun RoutineCard(nombre_rutina: String = "Rutina Colegio"){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(Color(0xFFFFEB3B))
            .padding(8.dp),
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
fun TusRutinasHeader() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFFFD700)) // Bright yellow background
            .padding(vertical = 16.dp, horizontal = 24.dp)
    ) {
        Text(
            text = "Tus Rutinas",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            modifier = Modifier.align(Alignment.CenterStart)
        )
    }
}