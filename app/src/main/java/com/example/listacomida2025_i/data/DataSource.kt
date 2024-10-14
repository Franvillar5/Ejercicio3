package com.example.listacomida2025_i.data

import com.example.listacomida2025_i.R
import com.example.listacomida2025_i.model.Platillo

public class DataSource {
    fun LoadPlatillos(): List<Platillo>{
        return listOf<Platillo>(
            Platillo(R.string.desayuno, R.drawable.desayuno, "$100", oferta = true),
            Platillo(R.string.hamburger, R.drawable.hamburger, "$120", oferta = true),
            Platillo(R.string.pizza, R.drawable.pizza, "$180"),
            Platillo(R.string.postre, R.drawable.postre, "$100", oferta = true),
            Platillo(R.string.pozole, R.drawable.pozole, "$150"),
            Platillo(R.string.tacos, R.drawable.tacos, "$60", oferta = true)
        )
    }
}