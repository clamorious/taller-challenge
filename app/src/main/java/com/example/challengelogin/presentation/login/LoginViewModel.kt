package com.example.challengelogin.presentation.login

import androidx.lifecycle.ViewModel
import com.example.challengelogin.data.LoginRepositoryImpl
import com.example.challengelogin.data.model.LoginRequestDTO
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class LoginViewModel(private val repository: LoginRepositoryImpl): ViewModel() {

    private val _uiState = MutableStateFlow(LoginUiState())
    val uiState: StateFlow<LoginUiState> = _uiState

    fun login() {
        val uiState = _uiState.value
        val response  = repository.login(
            LoginRequestDTO(user = uiState.username, uiState.password)
        )

        _uiState.update {
            it.copy(data = response.username)
        }
    }

    fun updateUserName(username: String) {
        _uiState.update {
            it.copy(
                username = username
            )
        }
    }

    fun updatePassword(password: String) {
        _uiState.update {
            it.copy(
                password = password
            )
        }
    }
}