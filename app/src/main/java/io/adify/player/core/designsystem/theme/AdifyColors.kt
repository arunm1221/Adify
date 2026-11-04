package io.adify.player.core.designsystem.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

/**
 * Every colour the app uses. Screens read these via AdifyTheme.colors.xxx
 * and must never hard-code Color(0xFF...).
 */
@Immutable
data class AdifyColors(
    val background: Color,        // screen background
    val surface: Color,           // cards, code boxes, help card
    val surfaceRaised: Color,     // rows inside cards, unselected tiles
    val outline: Color,           // borders, outlined button
    val primary: Color,           // lime accent: main button, toggle, highlights
    val onPrimary: Color,         // text/icons on top of lime
    val primaryContainer: Color,  // selected tile fill (Portrait)
    val textPrimary: Color,       // headings, values
    val textSecondary: Color,     // body text
    val textMuted: Color,         // captions ("4 digits", "Player v2.4.0")
    val textSubtle: Color,        // section labels ("DISPLAY", "AUTOMATION")
    val danger: Color,            // destructive actions (Device reboot)
)

/** Raw colours sampled from the Adify designs. Private: only used to build AdifyColors. */
private object AdifyPalette {
    val Ink950 = Color(0xFF0A0E12)
    val Ink900 = Color(0xFF131A20)
    val Ink800 = Color(0xFF1B252D)
    val Ink700 = Color(0xFF2A353D)
    val Lime400 = Color(0xFFD5FF59)
    val Lime950 = Color(0xFF202D1B)
    val Mist50 = Color(0xFFF4F6F1)
    val Slate300 = Color(0xFFA1ADB5)
    val Slate400 = Color(0xFF8E99A1)
    val Slate500 = Color(0xFF697982)
    val Coral300 = Color(0xFFFFA38C)
}

/** The default Adify look (dark). */
fun adifyDarkColors(): AdifyColors = AdifyColors(
    background = AdifyPalette.Ink950,
    surface = AdifyPalette.Ink900,
    surfaceRaised = AdifyPalette.Ink800,
    outline = AdifyPalette.Ink700,
    primary = AdifyPalette.Lime400,
    onPrimary = AdifyPalette.Ink950,
    primaryContainer = AdifyPalette.Lime950,
    textPrimary = AdifyPalette.Mist50,
    textSecondary = AdifyPalette.Slate300,
    textMuted = AdifyPalette.Slate400,
    textSubtle = AdifyPalette.Slate500,
    danger = AdifyPalette.Coral300,
)

val LocalAdifyColors = staticCompositionLocalOf<AdifyColors> {
    error("No AdifyColors provided. Wrap your UI in AdifyTheme { }")
}
