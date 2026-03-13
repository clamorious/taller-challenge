package com.example.challengelogin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.challengelogin.presentation.login.LoginScreen
import com.example.challengelogin.presentation.theme.ChallengeLoginTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ChallengeLoginTheme {
                LoginScreen()
            }
        }
    }
}
