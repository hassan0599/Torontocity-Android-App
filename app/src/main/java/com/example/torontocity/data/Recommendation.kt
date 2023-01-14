package com.example.torontocity.data

import androidx.annotation.DrawableRes

data class Recommendation(
    val name: String,
    val address: String,
    val category: Category,
    val description: String,
    @DrawableRes val image: Int,
    val id: Int
)
