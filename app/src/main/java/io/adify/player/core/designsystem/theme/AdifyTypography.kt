package io.adify.player.core.designsystem.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Immutable
data class AdifyTypography(
    val display: TextStyle,    // "Let's bring this screen to life."
    val headline: TextStyle,   // "Make it your screen."
    val title: TextStyle,      // "Orientation", "Scheduled restart"
    val body: TextStyle,       // "Enter the 4-digit registration code…"
    val bodySmall: TextStyle,  // "A fresh start, without the downtime."
    val label: TextStyle,      // "Registration code", button text
    val overline: TextStyle,   // "ONE CODE. YOU'RE ON.", "DISPLAY"
    val codeDigit: TextStyle,  // the 2 8 4 6 boxes
)

// Replace with the design font once its .ttf files are in res/font:
// private val AdifyFontFamily = FontFamily(
//     Font(R.font.brand_regular, FontWeight.Normal),
//     Font(R.font.brand_medium, FontWeight.Medium),
//     Font(R.font.brand_bold, FontWeight.Bold),
// )
private val AdifyFontFamily: FontFamily = FontFamily.Default

fun adifyTypography(fontFamily: FontFamily = AdifyFontFamily) = AdifyTypography(
    display = TextStyle(
        fontFamily = fontFamily, fontWeight = FontWeight.Bold,
        fontSize = 52.sp, lineHeight = 58.sp, letterSpacing = (-1).sp,
    ),
    headline = TextStyle(
        fontFamily = fontFamily, fontWeight = FontWeight.Bold,
        fontSize = 44.sp, lineHeight = 50.sp, letterSpacing = (-0.5).sp,
    ),
    title = TextStyle(
        fontFamily = fontFamily, fontWeight = FontWeight.Medium,
        fontSize = 22.sp, lineHeight = 28.sp,
    ),
    body = TextStyle(
        fontFamily = fontFamily, fontWeight = FontWeight.Normal,
        fontSize = 20.sp, lineHeight = 30.sp,
    ),
    bodySmall = TextStyle(
        fontFamily = fontFamily, fontWeight = FontWeight.Normal,
        fontSize = 16.sp, lineHeight = 22.sp,
    ),
    label = TextStyle(
        fontFamily = fontFamily, fontWeight = FontWeight.Medium,
        fontSize = 17.sp, lineHeight = 22.sp,
    ),
    overline = TextStyle(
        fontFamily = fontFamily, fontWeight = FontWeight.Medium,
        fontSize = 14.sp, lineHeight = 18.sp, letterSpacing = 2.sp,
    ),
    codeDigit = TextStyle(
        fontFamily = fontFamily, fontWeight = FontWeight.Medium,
        fontSize = 44.sp, lineHeight = 52.sp,
    ),
)

val LocalAdifyTypography = staticCompositionLocalOf<AdifyTypography> {
    error("No AdifyTypography provided. Wrap your UI in AdifyTheme { }")
}
