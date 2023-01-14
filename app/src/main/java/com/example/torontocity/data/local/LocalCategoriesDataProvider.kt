package com.example.torontocity.data.local

import com.example.torontocity.R
import com.example.torontocity.data.Category

object LocalCategoriesDataProvider {
    val allCategories = mutableListOf(
        Category(
            name = "Coffee",
            id = 1,
            imageResourceId = R.drawable.ic_coffee
        ),
        Category(
            name = "Restaurant",
            id = 2,
            imageResourceId = R.drawable.ic_restaurant
        ),
        Category(
            name = "Park",
            id = 3,
            imageResourceId = R.drawable.ic_park
        ),
        Category(
            name = "Shopping Centre",
            id = 4,
            imageResourceId = R.drawable.ic_shopping_centre
        ),
        Category(
            name = "Historic Site",
            id = 5,
            imageResourceId = R.drawable.ic_historic_site
        ),
        Category(
            name = "Gallery",
            id = 6,
            imageResourceId = R.drawable.ic_gallery
        )
    )
    val defaultCategory = Category(
        name = "Default",
        id = -1,
        imageResourceId = R.drawable.resource_default
    )
}