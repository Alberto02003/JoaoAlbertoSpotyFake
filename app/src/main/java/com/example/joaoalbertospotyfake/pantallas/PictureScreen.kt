package com.example.joaoalbertospotyfake.pantallas

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.res.painterResource
import com.example.joaoalbertospotyfake.shared.ScaffoldViewModel

@Composable
fun PictureScreen(viewModel: ScaffoldViewModel){
    Image(
        painter = painterResource(id = viewModel.cancionActual.collectAsState().value),
        contentDescription =""
    )
}