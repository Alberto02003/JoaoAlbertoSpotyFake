package com.example.joaoalbertospotyfake.shared

import androidx.lifecycle.ViewModel
import com.example.joaoalbertospotyfake.R
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class ScaffoldViewModel : ViewModel() {


    private val _titulo = MutableStateFlow("Player")
    val titulo = _titulo.asStateFlow()



    fun modificarTitulo(nuevoTitulo : String){
        _titulo.value = nuevoTitulo
    }


    private val _cancionActual = MutableStateFlow(R.drawable.adicto)
    val cancionActual = _cancionActual.asStateFlow()



    fun modificarCancion(){
        if(_cancionActual.value == R.drawable.adicto) _cancionActual.value = R.drawable.ginza
        else _cancionActual.value = R.drawable.adicto
    }
}