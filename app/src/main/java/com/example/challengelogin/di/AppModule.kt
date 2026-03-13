package com.example.challengelogin.di

import com.example.challengelogin.data.LoginRepositoryImpl
import com.example.challengelogin.domain.LoginRepository
import com.example.challengelogin.presentation.login.LoginViewModel
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val appModule = module {
    singleOf(::LoginRepositoryImpl) { bind<LoginRepository>() }
    singleOf(::LoginViewModel)
}
