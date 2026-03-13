package com.example.challengelogin.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.example.challengelogin.presentation.home.HomeScreen
import com.example.challengelogin.presentation.login.LoginScreen

@Composable
fun MainNavHost() {
    val backStack = rememberNavBackStack(MainRoute.Login)

    NavDisplay(
        backStack = backStack,
        onBack = { backStack.removeLastOrNull() },
        entryProvider = entryProvider {
            entry<MainRoute.Login> {
                LoginScreen(onNavigateToHome = { userName ->
                    backStack.removeLastOrNull()
                    backStack.add(MainRoute.Home(userName))
                })
            }
            entry<MainRoute.Home> { key ->
                HomeScreen(key.userName)
            }
        }
    )
}
