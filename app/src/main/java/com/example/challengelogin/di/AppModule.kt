package com.example.challengelogin.di

import com.example.challengelogin.data.LoginRepositoryImpl
import com.example.challengelogin.presentation.login.LoginViewModel
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val appModule = module {
    singleOf(::LoginViewModel)
    singleOf(::LoginRepositoryImpl)
}
