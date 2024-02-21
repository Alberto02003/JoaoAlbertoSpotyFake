package com.example.joaoalbertospotyfake.shared

sealed class Rutas(val ruta : String) {
    object Player : Rutas("player")
    object Foto : Rutas("foto")
    object Home : Rutas("home")
    object Album : Rutas("album")
}