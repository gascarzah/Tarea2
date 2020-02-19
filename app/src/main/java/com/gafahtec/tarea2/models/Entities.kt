package com.gafahtec.tarea2.models

import java.io.Serializable


data class RestaurantEntity(
    val nombre: String,
    val direccion: String,
    val calificacion: String,
    val descripcion: String
) : Serializable


data class PlatoEntity(
    val nombre: String,
    val precio: String,
    val descripcion: String

)