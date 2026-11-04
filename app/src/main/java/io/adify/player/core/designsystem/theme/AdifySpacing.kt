package io.adify.player.core.designsystem.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/** One spacing scale for the whole app, so gaps stay consistent. */
@Immutable
data class AdifySpacing(
    val xxs: Dp = 4.dp,
    val xs: Dp = 8.dp,
    val sm: Dp = 12.dp,
    val md: Dp = 16.dp,
    val lg: Dp = 24.dp,
    val xl: Dp = 32.dp,
    val xxl: Dp = 48.dp, // screen side padding in the designs
)

val LocalAdifySpacing = staticCompositionLocalOf<AdifySpacing> {
    error("No AdifySpacing provided. Wrap your UI in AdifyTheme { }")
}
