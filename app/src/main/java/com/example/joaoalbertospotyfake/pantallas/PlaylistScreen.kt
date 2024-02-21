package com.example.joaoalbertospotyfake.pantallas

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.joaoalbertospotyfake.objetos.Album
import com.example.joaoalbertospotyfake.objetos.SampleData.Companion.albumsSample
import com.example.joaoalbertospotyfake.shared.ScaffoldViewModel
import com.example.joaoalbertospotyfake.ui.theme.Blanco

@Composable
fun homeScreen(viewModelScaffold: ScaffoldViewModel = viewModel(), navController: NavController) {
    val albums = listOf(albumsSample)
    Column {
        Text(
            text = "Escucha tus albums", modifier = Modifier.padding(8.dp)
        )
        LazyRow(
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 50.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),

            ) {
            items(albums.first()) { album ->
                AlbumItem(album, navController)
            }
        }

    }
}

@Composable
fun AlbumItem(album: Album, navController: NavController) {
    Column(
        modifier = Modifier
            .width(380.dp)
            .height(400.dp)
            .padding(vertical = 8.dp)
            .background(Blanco)
            .clickable { navController.navigate("album/${album.id}") },
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = album.imagenID),
            contentDescription = "Album cover for ${album.title}",
            modifier = Modifier.size(395.dp)
        )
    }
}