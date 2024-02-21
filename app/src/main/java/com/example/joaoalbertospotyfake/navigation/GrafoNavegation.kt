package com.example.joaoalbertospotyfake.navigation


import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.joaoalbertospotyfake.pantallas.AlbumScreen
import com.example.joaoalbertospotyfake.pantallas.BarraInferior
import com.example.joaoalbertospotyfake.pantallas.BarraSuperior
import com.example.joaoalbertospotyfake.pantallas.ExoPlayerScreen
import com.example.joaoalbertospotyfake.pantallas.PictureScreen
import com.example.joaoalbertospotyfake.pantallas.homeScreen
import com.example.joaoalbertospotyfake.shared.Rutas
import com.example.joaoalbertospotyfake.shared.ScaffoldViewModel
import com.example.joaoalbertospotyfake.ui.theme.Blanco

@OptIn(ExperimentalMaterial3Api::class)
@Composable
 fun GrafoNavegacion() {

    val navController = rememberNavController()
    val viewModelScaffold: ScaffoldViewModel = viewModel()

    Scaffold(topBar = { BarraSuperior(titulo = "SpotyFake") }, bottomBar = {
        BarraInferior(funcionNavegarPlayer = {
            navController.navigate(Rutas.Home.ruta)
        }, funcionNavegarFoto = {

        })
    }, content = {

            paddingValues ->
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues), color = Blanco
        ) {
            NavHost(navController = navController, startDestination = Rutas.Home.ruta) {
                composable("${Rutas.Player.ruta}/{albumId}/{cancionId}") {
                    val albumId = it.arguments?.getString("albumId")
                    val cancionId = it.arguments?.getString("cancionId")

                    if (albumId != null && cancionId != null) {
                        ExoPlayerScreen(albumId, cancionId)
                    }
                }
                composable(Rutas.Foto.ruta) {
                    PictureScreen(viewModelScaffold)
                }
                composable(Rutas.Home.ruta) {
                    homeScreen(viewModelScaffold, navController)
                }
                composable("${Rutas.Album.ruta}/{albumId}") {
                    val albumId = it.arguments?.getString("albumId")

                    if (albumId != null) {
                        AlbumScreen(albumId, navController)
                    }
                }
            }
        }
    })
}