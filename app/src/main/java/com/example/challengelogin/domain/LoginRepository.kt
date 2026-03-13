package com.example.challengelogin.domain

import com.example.challengelogin.common.ApiResource
import com.example.challengelogin.data.model.LoginRequestDTO
import com.example.challengelogin.data.model.LoginResponseDTO

interface LoginRepository {

    suspend fun login(request: LoginRequestDTO) : ApiResource<LoginResponseDTO>
}