package com.carlossierrasequera.examenej3.ui.navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.carlossierrasequera.examenej3.ui.primeraScreen.PrimeraScreen
import com.carlossierrasequera.examenej3.ui.segundaScreen.SegundaScreen
import com.carlossierrasequera.examenej3.ui.terceraScreen.TerceraScreen

@Composable
fun Navegacion() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "PrimeraScreen") {
        composable("PrimeraScreen") { PrimeraScreen(navController) }
        composable("PegundaScreen") { SegundaScreen(navController) }
        composable("PerceraScreen") { TerceraScreen(navController) }
    }
}


