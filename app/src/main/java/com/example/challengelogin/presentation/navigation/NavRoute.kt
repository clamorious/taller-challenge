package com.example.challengelogin.presentation.navigation
import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable
sealed interface MainRoute : NavKey {
    @Serializable
    data object Home : MainRoute

    @Serializable
    data object Login : MainRoute
}
