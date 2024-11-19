package com.carlossierrasequera.examenej3.ui.segundaScreen

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun SegundaScreen(navController: NavHostController) {
    Button(onClick = { navController.navigate("PrimeraScreen") }) {
        Text(text = "Ir a la primera")
    }
    Button(onClick = { navController.navigate("TerceraScreen") }) {
        Text(text = "Ir a la tercera")
    }
}