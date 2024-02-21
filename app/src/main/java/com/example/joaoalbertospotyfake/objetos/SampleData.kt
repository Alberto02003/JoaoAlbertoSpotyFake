package com.example.joaoalbertospotyfake.objetos

import androidx.compose.ui.graphics.Color
import com.example.joaoalbertospotyfake.R


class SampleData {
    companion object {
         val songsSample = listOf(
            Cancion( R.raw.adicto, "Adicto - Anuel & Ozuna", R.drawable.adicto, Color.Red),
            Cancion( R.raw.ginza, "Ginza - JBalvin",  R.drawable.ginza, Color.Green),
            Cancion( R.raw.si_ella_quisiera, "Si ella quisiera - Justin Quilles",  R.drawable.si_ella_quisiera, Color.Blue),
            Cancion( R.raw.subiendo_nivel, "Subiendo de Nivel - Jhayco & Myke Towers",  R.drawable.subiendo_nivel, Color.Yellow),
            Cancion( R.raw.telefono_nuevo, "Telefono Nuevo - Bad Bunny & Luar La L",  R.drawable.telefono_nuevo, Color.Magenta),

            )

        val albumsSample = listOf(
            Album(1, "Vulture 1",  R.drawable.album1),
            Album(2, "Utopia",  R.drawable.album2),
            Album(3, "Anti Social Cool Kid",  R.drawable.album3),
            Album(4, "S.U.V",  R.drawable.album4),
            Album(5, "La Soledad Aburre Pero No Traiciona",  R.drawable.album5),
            Album(6, "Amirino",  R.drawable.album6)
        )

        val albumsWithSongsMap: Map<Int, AlbumWithSongs> = mapOf(
            1 to AlbumWithSongs(albumsSample[0], songsSample.subList(0, 2)),
            2 to AlbumWithSongs(albumsSample[1], songsSample.subList(2, 4)),
            3 to AlbumWithSongs(albumsSample[2], songsSample.subList(4, 5)),
            4 to AlbumWithSongs(albumsSample[3], songsSample.subList(0, 2)),
            5 to AlbumWithSongs(albumsSample[4], songsSample.subList(2, 4))
        )
    }
}

