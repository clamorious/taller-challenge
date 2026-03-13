package com.example.challengelogin.data

import com.example.challengelogin.data.model.LoginRequestDTO
import com.example.challengelogin.data.model.LoginResponseDTO

class LoginRepositoryImpl {

    fun login(request: LoginRequestDTO): LoginResponseDTO {
        return LoginResponseDTO(request.user)
    }
}