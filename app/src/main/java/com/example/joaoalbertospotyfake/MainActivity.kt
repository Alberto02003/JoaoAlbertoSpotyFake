package com.example.joaoalbertospotyfake

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.joaoalbertospotyfake.navigation.GrafoNavegacion
import com.example.joaoalbertospotyfake.ui.theme.JoaoAlbertoSpotyFakeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContent {
            JoaoAlbertoSpotyFakeTheme {
                GrafoNavegacion()
            }
        }
    }
}

