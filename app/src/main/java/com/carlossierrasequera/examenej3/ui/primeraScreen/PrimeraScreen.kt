package com.carlossierrasequera.examenej3.ui.primeraScreen

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun PrimeraScreen(navController: NavHostController) {
    Button(onClick = { navController.navigate("SegundaScreen") }) {
        Text(text = "Ir a la segunda")
    }
}