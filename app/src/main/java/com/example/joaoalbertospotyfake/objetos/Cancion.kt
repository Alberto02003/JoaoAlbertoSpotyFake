package com.example.joaoalbertospotyfake.objetos

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color

data class Cancion(
    val id: Int,
    val titulo: String,
    @DrawableRes val imagen: Int,
    val colorFondo: Color
)
