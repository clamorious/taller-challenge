package com.example.challengelogin.data

import com.example.challengelogin.common.ApiResource
import com.example.challengelogin.data.model.LoginRequestDTO
import com.example.challengelogin.data.model.LoginResponseDTO
import com.example.challengelogin.domain.LoginRepository
import kotlinx.coroutines.delay

class LoginRepositoryImpl : LoginRepository {

    override suspend fun login(request: LoginRequestDTO): ApiResource<LoginResponseDTO> {
        delay(2000)
        return ApiResource.Success(LoginResponseDTO(request.user))
    }
}