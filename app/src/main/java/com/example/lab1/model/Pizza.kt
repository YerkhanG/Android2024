package com.example.lab1.model

import java.io.Serializable
import java.util.UUID

data class Pizza(
    val id: String = UUID.randomUUID().toString(),
    val name: String,
    val description: String ,
    val imageRes: Int,
    val price: Int
        ): Serializable