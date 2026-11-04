package io.adify.player.core.designsystem.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

@Immutable
data class AdifyShapes(
    val small: Shape,   // rows inside cards ("Every day 04:00")
    val medium: Shape,  // code boxes, orientation tiles
    val large: Shape,   // cards, main button
    val pill: Shape,    // "Connected" chip
)

fun adifyShapes() = AdifyShapes(
    small = RoundedCornerShape(10.dp),
    medium = RoundedCornerShape(12.dp),
    large = RoundedCornerShape(16.dp),
    pill = RoundedCornerShape(percent = 50),
)

val LocalAdifyShapes = staticCompositionLocalOf<AdifyShapes> {
    error("No AdifyShapes provided. Wrap your UI in AdifyTheme { }")
}
