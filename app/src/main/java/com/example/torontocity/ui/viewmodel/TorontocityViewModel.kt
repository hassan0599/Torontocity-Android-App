package com.example.torontocity.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.torontocity.data.Category
import com.example.torontocity.data.Recommendation
import com.example.torontocity.data.local.LocalCategoriesDataProvider
import com.example.torontocity.data.local.LocalRecommendationsDataProvider
import com.example.torontocity.ui.state.TorontocityUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class TorontocityViewModel: ViewModel() {

    private val _uiState = MutableStateFlow(TorontocityUiState())
    val uiState: StateFlow<TorontocityUiState> = _uiState

    init {
        initializeUiState()
    }

    private fun initializeUiState() {
        val categories: List<Category> = LocalCategoriesDataProvider.allCategories
        val categoryMap: Map<Category, List<Recommendation>> = LocalRecommendationsDataProvider.allRecommendations.groupBy { it.category }
        val recommendations: List<Recommendation> = categoryMap[categories[0]]!!
        _uiState.value =
            TorontocityUiState(
                categoryMap = categoryMap,
                categories = categories,
                recommendations = recommendations,
                currentCategory = categories[0],
                currentRecommendation = recommendations[0]
            )
    }

    fun fullScreenOff() {
        _uiState.update {
            it.copy(
                isFullScreen = false
            )
        }
    }

    fun updateCurrentCategory(selectedCategory: Category) {
        _uiState.update {
            val categoryMap = it.categoryMap
            it.copy(
                currentCategory = selectedCategory,
                recommendations = categoryMap[selectedCategory]!!
            )
        }
    }

    fun updateCurrentRecommendation(selectedRecommendation: Recommendation) {
        _uiState.update {
            it.copy(
                currentRecommendation = selectedRecommendation
            )
        }
    }

    fun navigateToCategoriesPage() {
        _uiState.update {
            it.copy(
                isShowingCategoriesPage = true,
                isShowingRecommendationsPage = false
            )
        }
    }

    fun navigateToRecommendationsPage() {
        _uiState.update {
            it.copy (
                isShowingRecommendationsPage = true,
                isShowingCategoriesPage = false
            )
        }
    }

    fun navigateToRecommendationPage() {
        _uiState.update {
            it.copy(
                isShowingRecommendationsPage = false
            )
        }
    }
}