package com.carlossierrasequera.examenej3.ui.terceraScreen

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun TerceraScreen(navController: NavHostController) {
    Button(onClick = { navController.navigate("PrimeraScreen") }) {
        Text(text = "Ir a la primera")
    }
    Button(onClick = { navController.navigate("SegundaScreen") }) {
        Text(text = "Ir a la segunda")
    }
}