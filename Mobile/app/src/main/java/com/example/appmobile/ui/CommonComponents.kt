package com.example.appmobile.ui
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
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
            .clip(RoundedCornerShape(16.dp))
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
            .clip(RoundedCornerShape(16.dp))
            .background(Color(0xFFFFEB3B))
            .padding(8.dp)
            .clickable { navigationController.navigate("editarActividad") }
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
fun InputTextApp(value: String = "Input Text", label: String = "Label Text") {
    TextField(
        value = value,
        onValueChange = {},
        label = { Text(label) },
        modifier = Modifier.fillMaxWidth(),
        colors = OutlinedTextFieldDefaults.colors( unfocusedContainerColor = Color(0xFF32CD32), focusedContainerColor = Color(0xFF32CD32)  )
    )
}

@Composable
fun InicioActividadCard(hora: String = "07", minutos: String = "20") {
    val selectedOption = remember { mutableStateOf("AM") }
    val shape = RoundedCornerShape(
        topStart = 12.dp,
        topEnd = 0.dp,      // No rounding for top right
        bottomEnd = 0.dp,   // No rounding for bottom right
        bottomStart = 12.dp // Rounded for bottom left
    )

    Box(
        modifier = Modifier
            .size(329.dp, 243.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(Color(0xFFFFD700).copy(alpha = 0.75f))
            .padding(start = 31.dp, top = 16.dp),
        contentAlignment = Alignment.TopStart
    ) {
        // Title Text
        Text(
            text = "Inicio de la Actividad",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF474747),
            modifier = Modifier.padding(16.dp)
        )

        // Box for time display
        Box(
            modifier = Modifier
                .size(width = 348.dp, height = 150.dp)
                .padding(top = 66.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                // First Column for hora
                Column(
                    modifier = Modifier
                        .size(width = 80.dp, height = 72.dp)
                        .background(Color(0xFFFFA500), RoundedCornerShape(12.dp))
                        .wrapContentHeight(Alignment.CenterVertically)
                ) {
                    Text(
                        text = hora,
                        fontSize = 45.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    )
                }

                // Separator Column
                Column(
                    modifier = Modifier
                        .size(width = 20.dp, height = 72.dp)
                        .wrapContentHeight(Alignment.CenterVertically)
                ) {
                    Text(
                        text = ":",
                        fontSize = 45.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        color = Color(0xFF474747),
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    )
                }

                // Second Column for minutos
                Column(
                    modifier = Modifier
                        .size(width = 80.dp, height = 72.dp)
                        .background(Color(0xFFFFA500), RoundedCornerShape(12.dp))
                        .wrapContentHeight(Alignment.CenterVertically)
                ) {
                    Text(
                        text = minutos,
                        fontSize = 45.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    )
                }

                // Separator Column
                Column(
                    modifier = Modifier
                        .size(width = 20.dp, height = 72.dp)
                        .wrapContentHeight(Alignment.CenterVertically)
                ) {

                }

                Column(
                    modifier = Modifier
                        .weight(1f)
                        .padding(horizontal = 3.dp) // Padding for the entire column
                        .height(72.dp) // Fixed height for the column
                ) {
                    // AM Button
                    Box(
                        modifier = Modifier
                            .width(60.dp)
                            .height(36.dp) // Fixed height for the AM button
                            .clip(RoundedCornerShape(topStart = 12.dp, topEnd = 12.dp)) // Rounded top corners
                            .background(Color(0xFFFF69B4)) // AM color
                            .clickable { selectedOption.value = "AM" } // Handle click
                    ) {
                        Text(
                            text = "AM",
                            color = Color.White,
                            fontSize = 14.sp,
                            textAlign = TextAlign.Center,
                            modifier = Modifier
                                .align(Alignment.Center) // Center the text
                                .padding(0.dp) // No padding
                        )
                    }

                    // PM Button
                    Box(
                        modifier = Modifier
                            .width(60.dp)
                            .height(36.dp) // Fixed height for the PM button
                            .clip(RoundedCornerShape(bottomStart = 12.dp, bottomEnd = 12.dp)) // Rounded bottom corners
                            .background(Color(0xFF4169E1)) // PM color
                            .clickable { selectedOption.value = "PM" } // Handle click
                            .offset(y = -10.dp) // Adjust to overlap AM button
                    ) {
                        Text(
                            text = "PM",
                            color = Color.White,
                            fontSize = 14.sp,
                            textAlign = TextAlign.Center,
                            modifier = Modifier
                                .align(Alignment.BottomCenter) // Center the text
                                .padding(0.dp) // No padding
                        )
                    }
                }


            }
        }

        // Image at the bottom center
        Image(
            painter = painterResource(id = R.drawable.reloj),
            contentDescription = "reloj",
            modifier = Modifier
                .size(86.dp)
                .align(Alignment.BottomCenter)
                .padding(bottom = 16.dp)
        )
    }
}

@Composable
fun ImagenLibros(text: String = "Seleccionar Imagen", navigationController:NavHostController){
    Column(
        modifier = Modifier
            .wrapContentSize(Alignment.Center)
    ) {
        Image(
            painter = painterResource(id = R.drawable.imagen_libros), // Replace with your drawable resource
            contentDescription = "Image 1",
            modifier = Modifier
                .size(120.dp) // Set width and height
                .clickable {
                    navigationController.navigate("imagenActividad") // Navigate to imagenActividad
                }
        )

        Text(
            text = text, // Replace with your desired text
            fontSize = 12.sp,
            color = Color.Black,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .align(Alignment.CenterHorizontally) // Center the text horizontally
                .clickable {
                    navigationController.navigate("imagenActividad") // Navigate to imagenActividad
                }
        )
    }
}


@Composable
fun SeleccionarImagenActividad(text: String = "Imagen"){
    Column(
        modifier = Modifier
            .wrapContentSize(Alignment.Center)
    ) {
        Image(
            painter = painterResource(id = R.drawable.imagen_libros), // Replace with your drawable resource
            contentDescription = "Image 1",
            modifier = Modifier
                .size(146.dp) // Set width and height
        )
        Spacer(modifier = Modifier.height(8.dp))
        Box(
            modifier = Modifier
                .width(146.dp)
                .height(19.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(Color(0xFF4169E1)) // Set the rectangle color
                .padding(horizontal = 8.dp) // Optional padding for the text
        ) {
            Text(
                text = text, // Replace with your desired text
                fontSize = 12.sp,
                color = Color(0xFFFFFFFF), // Set text color
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .align(Alignment.Center) // Center the text within the Box
            )
        }
    }
}