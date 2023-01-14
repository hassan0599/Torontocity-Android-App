package com.example.torontocity.data

import androidx.annotation.DrawableRes

data class Category(
    val name: String,
    val id: Int,
    @DrawableRes val imageResourceId: Int
)