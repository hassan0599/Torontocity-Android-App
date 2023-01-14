package com.example.torontocity.ui.state

import com.example.torontocity.data.Category
import com.example.torontocity.data.Recommendation
import com.example.torontocity.data.local.LocalCategoriesDataProvider
import com.example.torontocity.data.local.LocalRecommendationsDataProvider

data class TorontocityUiState(
    val categoryMap: Map<Category, List<Recommendation>> = emptyMap(),
    val categories: List<Category> = emptyList(),
    val recommendations: List<Recommendation> = emptyList(),
    val currentCategory: Category = LocalCategoriesDataProvider.defaultCategory,
    val currentRecommendation: Recommendation = LocalRecommendationsDataProvider.defaultRecommendation,
    val isShowingCategoriesPage: Boolean = true,
    val isShowingRecommendationsPage: Boolean = false,
    val isFullScreen: Boolean = true
)