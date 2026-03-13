package com.example.challengelogin.common

sealed class ApiResource<out T> {
    data class Success<T>(val data: T) : ApiResource<T>()
    data class Error(val message: String) : ApiResource<Nothing>()
}
