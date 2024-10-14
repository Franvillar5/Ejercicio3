package com.example.listacomida2025_i.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Platillo(
    @StringRes val stringResourceId: Int,
    @DrawableRes val drawableResourceId: Int,
    val precio: String, // añade campo para el precio
    val oferta: Boolean = false // Añade campo para indicar si hay oferta

)
