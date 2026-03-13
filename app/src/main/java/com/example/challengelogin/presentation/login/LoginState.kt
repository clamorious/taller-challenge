package com.example.challengelogin.presentation.login

data class LoginUiState(
    var data: String? = null,
    var error: String? = null,
    var loading: Boolean = false,
    var username: String? = null,
    var password: String? = null
)