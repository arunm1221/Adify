package io.adify.player

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import dagger.hilt.android.AndroidEntryPoint
import io.adify.player.core.designsystem.theme.AdifyTheme

@AndroidEntryPoint // lets Hilt inject into this Activity and its ViewModels
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AdifyTheme {
                ThemeCheckScreen() // temporary: replaced by AdifyNavHost later
            }
        }
    }
}

@Composable
private fun ThemeCheckScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(AdifyTheme.colors.background)
            .padding(AdifyTheme.spacing.xxl),
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            text = "ONE CODE. YOU'RE ON.",
            style = AdifyTheme.typography.overline,
            color = AdifyTheme.colors.primary,
        )
        Spacer(Modifier.height(AdifyTheme.spacing.md))
        Text(
            text = "Let's bring this screen to life.",
            style = AdifyTheme.typography.display,
        )
        Spacer(Modifier.height(AdifyTheme.spacing.md))
        Text(
            text = "The global theme is wired up.",
            style = AdifyTheme.typography.body,
            color = AdifyTheme.colors.textSecondary,
        )
        Spacer(Modifier.height(AdifyTheme.spacing.lg))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(AdifyTheme.colors.surface, AdifyTheme.shapes.large)
                .padding(AdifyTheme.spacing.lg),
        ) {
            Text(text = "Surface card", style = AdifyTheme.typography.title)
        }
    }
}

@Preview(widthDp = 400, heightDp = 640)
@Composable
private fun ThemeCheckPreview() {
    AdifyTheme { ThemeCheckScreen() }
}
