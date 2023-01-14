package com.example.torontocity.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.torontocity.ui.theme.TorontocityTheme
import com.example.torontocity.ui.viewmodel.TorontocityViewModel

@Composable
fun TorontocityApp(
    windowSize: WindowWidthSizeClass = WindowWidthSizeClass.Compact,
    modifier: Modifier = Modifier
) {
    val viewModel: TorontocityViewModel = viewModel()
    val uiState by viewModel.uiState.collectAsState()

    Scaffold(
        topBar = {
            TorontocityAppBar(
                isShowingCategoriesPage = uiState.isShowingCategoriesPage,
                isShowingRecommendationsPage = uiState.isShowingRecommendationsPage,
                isFullScreen = uiState.isFullScreen,
                onBackButtonClick = {
                    if (uiState.isFullScreen) {
                        if (uiState.isShowingRecommendationsPage) {
                            viewModel.navigateToCategoriesPage()
                        } else {
                            viewModel.navigateToRecommendationsPage()
                        }
                    } else {
                        viewModel.navigateToRecommendationsPage()
                    }
                }
            )
        }
    ) { innerPadding ->
        if (windowSize == WindowWidthSizeClass.Compact) {
            if (uiState.isShowingCategoriesPage) {
                TorontocityCategories(
                    categories = uiState.categories,
                    onClick = {
                        viewModel.updateCurrentCategory(it)
                        viewModel.navigateToRecommendationsPage()
                    },
                    modifier = modifier.padding(innerPadding)
                )
            } else if (uiState.isShowingRecommendationsPage) {
                TorontocityRecommendations(
                    recommendations = uiState.recommendations,
                    onClick = {
                        viewModel.updateCurrentRecommendation(it)
                        viewModel.navigateToRecommendationPage()
                    },
                    modifier = modifier.padding(innerPadding)
                )
            } else {
                TorontocityRecommendation(
                    currentRecommendation = uiState.currentRecommendation,
                    modifier = modifier.padding(innerPadding)
                )
            }
        } else if (windowSize == WindowWidthSizeClass.Medium) {
            viewModel.fullScreenOff()
            TorontocityCategoriesAndRecommendations(
                uiState = uiState,
                categories = uiState.categories,
                onCategoryClick ={
                    viewModel.updateCurrentCategory(it)
                    viewModel.navigateToRecommendationsPage()
                },
                recommendations = uiState.recommendations,
                onRecommendationClick = {
                    viewModel.updateCurrentRecommendation(it)
                    viewModel.navigateToRecommendationPage()
                },
                currentRecommendation = uiState.currentRecommendation,
                modifier = modifier.padding(innerPadding)
            )
        } else {
            viewModel.fullScreenOff()
            TorontocityCategoriesAndRecommendationsAndRecommendation(
                categories = uiState.categories,
                onCategoryClick = { viewModel.updateCurrentCategory(it) },
                recommendations = uiState.recommendations,
                onRecommendationClick = { viewModel.updateCurrentRecommendation(it) },
                currentRecommendation = uiState.currentRecommendation,
                modifier = modifier.padding(innerPadding)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TorontocityTheme {
        Surface {
            TorontocityApp(windowSize = WindowWidthSizeClass.Compact)
        }
    }
}
