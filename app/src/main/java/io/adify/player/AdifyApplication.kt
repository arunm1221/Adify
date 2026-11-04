package io.adify.player

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/** The root of Hilt's dependency graph. Registered in AndroidManifest via android:name. */
@HiltAndroidApp
class AdifyApplication : Application()
