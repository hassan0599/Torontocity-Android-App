package com.example.torontocity.ui

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.torontocity.R
import com.example.torontocity.data.Category
import com.example.torontocity.data.Recommendation
import com.example.torontocity.data.local.LocalCategoriesDataProvider
import com.example.torontocity.data.local.LocalRecommendationsDataProvider
import com.example.torontocity.ui.state.TorontocityUiState
import com.example.torontocity.ui.theme.TorontocityTheme

@Composable
fun TorontocityAppBar(
    isShowingCategoriesPage: Boolean,
    isShowingRecommendationsPage: Boolean,
    isFullScreen: Boolean,
    onBackButtonClick: () -> Unit
) {
    TopAppBar(
        title = {
            Text(
                text = stringResource(R.string.app_name),
                style = MaterialTheme.typography.h1
            )
        },
        navigationIcon =
            if (isFullScreen) {
                if (!isShowingCategoriesPage) {
                    { IconButton(onClick = onBackButtonClick) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = stringResource(R.string.back_button)
                        )
                    } }
                } else {
                    null
                }
            } else {
                if (!isShowingRecommendationsPage) {
                    { IconButton(onClick = onBackButtonClick) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = stringResource(R.string.back_button)
                        )
                    } }
                } else {
                    null
                }
            }
    )
}

@Composable
fun TorontocityCategories(
    categories: List<Category>,
    onClick: (Category) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = modifier
            .background(MaterialTheme.colors.background)
    ) {
        items(categories, key = { category -> category.id }) { category ->
            CategoriesItem(
                category = category,
                onItemClick = onClick
            )
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
private fun CategoriesItem(
    category: Category,
    onItemClick: (Category) -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        elevation = 4.dp,
        onClick = { onItemClick(category) },
        modifier = modifier,
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth(),
        ) {
            CategoriesImageItem(category)
            Text(
                text = category.name,
                style = MaterialTheme.typography.h2,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}

@Composable
private fun CategoriesImageItem(
    category: Category,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .width(75.dp)
    ) {
        Image(
            painter = painterResource(category.imageResourceId),
            contentDescription = null,
            alignment = Alignment.TopCenter,
            contentScale = ContentScale.FillWidth
        )
    }
}

@Composable
fun TorontocityRecommendations(
    recommendations: List<Recommendation>,
    onClick: (Recommendation) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = modifier
    ) {
        items(recommendations, key = { recommendation -> recommendation.id }) { recommendation ->
            RecommendationsItem(
                recommendation = recommendation,
                onItemClick = onClick,
            )
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
private fun RecommendationsItem(
    recommendation: Recommendation,
    onItemClick: (Recommendation) -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        elevation = 4.dp,
        onClick = { onItemClick(recommendation) },
        modifier = modifier,
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            RecommendationsImageItem(recommendation)
            Text(
                text = recommendation.name,
                style = MaterialTheme.typography.h2,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}

@Composable
private fun RecommendationsImageItem(
    recommendation: Recommendation,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .size(75.dp)
            .fillMaxSize()
            .drawBehind {
                val strokeWidth = 15f
                drawLine(
                    color = Color(0xFF00205B),
                    start = Offset(0f, size.height),
                    end = Offset(size.width, size.height),
                    strokeWidth = strokeWidth
                )
                drawLine(
                    color = Color(0xFF00205B),
                    start = Offset(size.width, 0f),
                    end = Offset(size.width, size.height + (strokeWidth / 2)),
                    strokeWidth = strokeWidth
                )
            }
    ) {
        Image(
            painter = painterResource(recommendation.image),
            contentDescription = null,
            alignment = Alignment.Center,
            contentScale = ContentScale.Crop
        )
    }
}

@Composable
fun TorontocityRecommendation(
    currentRecommendation: Recommendation,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .padding(16.dp)
            .fillMaxWidth()
    ) {
        Card(
            elevation = 4.dp,
            modifier = Modifier
                .verticalScroll(rememberScrollState())
        ) {
            Column(
                modifier = Modifier.padding(4.dp)
            ) {
                Box {
                   Image(
                       painter = painterResource(currentRecommendation.image),
                       contentDescription = null,
                       alignment = Alignment.TopCenter,
                       contentScale = ContentScale.Inside
                   )
                   Text(
                       text = currentRecommendation.name,
                       style = MaterialTheme.typography.h1,
                       fontSize = 22.sp,
                       color = Color.White,
                       modifier = Modifier
                           .padding(8.dp)
                           .align(Alignment.BottomStart)
                           .background(Color(0xAA00205B), MaterialTheme.shapes.small)
                           .padding(8.dp)
                   )
                }
                Text(
                    text = stringResource(R.string.recommendation_address),
                    style = MaterialTheme.typography.h2,
                    color = MaterialTheme.colors.secondaryVariant,
                    modifier = Modifier.padding(8.dp)
                )
                Text(
                    text = currentRecommendation.address,
                    style = MaterialTheme.typography.body2,
                    modifier = Modifier.padding(8.dp)
                )
                Text(
                    text = stringResource(R.string.recommendation_description),
                    style = MaterialTheme.typography.h2,
                    color = MaterialTheme.colors.secondaryVariant,
                    modifier = Modifier.padding(8.dp)
                )
                Text(
                    text = currentRecommendation.description,
                    style = MaterialTheme.typography.body1,
                    modifier = Modifier.padding(8.dp)
                )
            }
        }
    }
}

@Composable
fun TorontocityCategoriesAndRecommendations(
    uiState: TorontocityUiState,
    categories: List<Category>,
    onCategoryClick: (Category) -> Unit,
    recommendations: List<Recommendation>,
    onRecommendationClick: (Recommendation) -> Unit,
    currentRecommendation: Recommendation,
    modifier: Modifier = Modifier
) {
    Row {
       TorontocityCategories(
           categories = categories,
           onClick = onCategoryClick,
           modifier = Modifier.weight(1f)
       )
       if (uiState.isShowingRecommendationsPage) {
           TorontocityRecommendations(
               recommendations = recommendations,
               onClick = onRecommendationClick,
               modifier = Modifier.weight(1f)
           )
       } else {
           TorontocityRecommendation(
               currentRecommendation = currentRecommendation,
               modifier = Modifier.weight(1f)
           )
       }
    }
}

@Composable
fun TorontocityCategoriesAndRecommendationsAndRecommendation(
    categories: List<Category>,
    onCategoryClick: (Category) -> Unit,
    recommendations: List<Recommendation>,
    onRecommendationClick: (Recommendation) -> Unit,
    currentRecommendation: Recommendation,
    modifier: Modifier = Modifier
) {
    Row {
       TorontocityCategories(
           categories = categories,
           onClick = onCategoryClick,
           modifier = Modifier.weight(1f)
       )
       TorontocityRecommendations(
           recommendations = recommendations,
           onClick = onRecommendationClick,
           modifier = Modifier.weight(1f)
       )
       TorontocityRecommendation(
           currentRecommendation = currentRecommendation,
           modifier = Modifier.weight(1f)
       )
    }
}

/*@Preview(showBackground = true)
@Composable
fun TorontocityCategoriesPreview() {
    TorontocityTheme {
        Surface {
            TorontocityCategories(
                categories = LocalCategoriesDataProvider.allCategories, onClick = {}
            )
        }
    }
}
*/


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TorontocityRecommendationsPreview() {
    TorontocityTheme {
        Scaffold(
            topBar = {
                TorontocityAppBar(
                    isShowingCategoriesPage = false,
                    isShowingRecommendationsPage = true,
                    isFullScreen = true,
                    onBackButtonClick = {}
                )
            }
        ) { innerPadding ->
            TorontocityRecommendations(recommendations = LocalRecommendationsDataProvider.allRecommendations, onClick = {}, modifier = Modifier.padding(innerPadding))
        }
    }
}
