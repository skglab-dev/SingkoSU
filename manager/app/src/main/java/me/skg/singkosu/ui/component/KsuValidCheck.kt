package com.skg.singkosu.ui.component

import androidx.compose.runtime.Composable
import com.skg.singkosu.Natives

@Composable
fun KsuIsValid(
    content: @Composable () -> Unit
) {
    val isManager = Natives.isManager
    val ksuVersion = if (isManager) Natives.version else null

    if (ksuVersion != null) {
        content()
    }
}
