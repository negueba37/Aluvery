package com.gabriel.aluvery

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.gabriel.aluvery.components.ProductSection
import com.gabriel.aluvery.screens.HomeScreen
import com.gabriel.aluvery.ui.theme.AluveryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AluveryTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App();
                }
            }
        }
    }
}

@Composable
fun App() {
    AluveryTheme {
        Surface() {

            HomeScreen()
        }
    }
}


@Preview(
    uiMode = UI_MODE_NIGHT_YES,
    showBackground = true
)
@Composable
fun GreetingPreview() {
    AluveryTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            ProductSection();
        }

    }
}