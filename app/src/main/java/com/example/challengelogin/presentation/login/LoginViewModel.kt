package com.example.challengelogin.presentation.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.challengelogin.common.ApiResource
import com.example.challengelogin.domain.LoginRepository
import com.example.challengelogin.data.model.LoginRequestDTO
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class LoginViewModel(private val repository: LoginRepository) : ViewModel() {

    private val _uiState = MutableStateFlow(LoginUiState())
    val uiState: StateFlow<LoginUiState> = _uiState

    fun login() {
        viewModelScope.launch {
            _uiState.update { it.copy(loading = true) }
            when (val response = repository.login(LoginRequestDTO(user = _uiState.value.username, _uiState.value.password))) {
                is ApiResource.Success -> _uiState.update { it.copy(loading = false, data = response.data.username) }
                is ApiResource.Error -> _uiState.update { it.copy(loading = false, error = response.message) }
            }
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
