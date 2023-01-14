package com.example.torontocity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.torontocity.ui.TorontocityApp
import com.example.torontocity.ui.theme.TorontocityTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TorontocityTheme {
                val windowSize = calculateWindowSizeClass(this)
                TorontocityApp(windowSize = windowSize.widthSizeClass)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TorontocityAppPreview() {
    TorontocityTheme {
        TorontocityApp()
    }
}

@Preview(showBackground = true, widthDp = 700)
@Composable
fun TorontocityAppMediumPreview() {
    TorontocityTheme {
        TorontocityApp(windowSize = WindowWidthSizeClass.Medium)
    }
}

@Preview(showBackground = true, widthDp = 1000)
@Composable
fun TorontocityAppExpandedPreview() {
    TorontocityTheme {
        TorontocityApp(windowSize = WindowWidthSizeClass.Medium)
    }
}