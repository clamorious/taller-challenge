package com.example.challengelogin.presentation.navigation
import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable
sealed interface MainRoute : NavKey {
    @Serializable
    data class Home(val userName: String) : MainRoute

    @Serializable
    data object Login : MainRoute
}
