package io.adify.player.core.designsystem.theme

import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable

/**
 * Wrap the whole app in this. Every screen inside reads tokens via
 * AdifyTheme.colors / typography / shapes / spacing.
 * Pass a different AdifyColors to re-brand at runtime, e.g.
 * AdifyTheme(colors = adifyDarkColors().copy(primary = Color(0xFF4FD1FF))) { ... }
 */
@Composable
fun AdifyTheme(
    colors: AdifyColors = adifyDarkColors(),
    typography: AdifyTypography = adifyTypography(),
    shapes: AdifyShapes = adifyShapes(),
    spacing: AdifySpacing = AdifySpacing(),
    content: @Composable () -> Unit,
) {
    CompositionLocalProvider(
        LocalAdifyColors provides colors,
        LocalAdifyTypography provides typography,
        LocalAdifyShapes provides shapes,
        LocalAdifySpacing provides spacing,
    ) {
        // Feed the same colours into Material 3 so its built-in widgets
        // (Switch, ripples, dialogs) match the Adify look automatically.
        MaterialTheme(colorScheme = colors.toMaterialColorScheme()) {
            // Default text colour = textPrimary, so Text() isn't black on the dark background
            CompositionLocalProvider(
                LocalContentColor provides colors.textPrimary,
                content = content,
            )
        }
    }
}

/** Access point used by every screen: AdifyTheme.colors.primary, AdifyTheme.spacing.md … */
object AdifyTheme {
    val colors: AdifyColors
        @Composable @ReadOnlyComposable get() = LocalAdifyColors.current
    val typography: AdifyTypography
        @Composable @ReadOnlyComposable get() = LocalAdifyTypography.current
    val shapes: AdifyShapes
        @Composable @ReadOnlyComposable get() = LocalAdifyShapes.current
    val spacing: AdifySpacing
        @Composable @ReadOnlyComposable get() = LocalAdifySpacing.current
}

private fun AdifyColors.toMaterialColorScheme() = darkColorScheme(
    primary = primary,
    onPrimary = onPrimary,
    primaryContainer = primaryContainer,
    onPrimaryContainer = primary,
    background = background,
    onBackground = textPrimary,
    surface = surface,
    onSurface = textPrimary,
    surfaceVariant = surfaceRaised,
    onSurfaceVariant = textSecondary,
    outline = outline,
    error = danger,
    onError = background,
)
