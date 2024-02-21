package com.example.joaoalbertospotyfake.pantallas

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.joaoalbertospotyfake.ui.theme.Grey
import com.example.joaoalbertospotyfake.ui.theme.Verde

@Composable
fun BarraInferior(
    funcionNavegarPlayer: () -> Unit,
    funcionNavegarFoto: () -> Unit
) {
    BottomAppBar(
        modifier = Modifier.fillMaxWidth(),
        containerColor = Grey
    ) {
        Row() {
            IconButton(onClick = funcionNavegarPlayer, modifier = Modifier.weight(1f)) {
                Icon(Icons.Default.Home, contentDescription = "")
            }

        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BarraSuperior(titulo: String) {
    CenterAlignedTopAppBar(
        title = { Text(titulo) },
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = Grey,
            titleContentColor = Verde
        )
    )
}