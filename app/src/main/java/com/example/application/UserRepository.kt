package com.example.application

import com.example.myapplication.LoginRequest
import com.example.myapplication.LoginResponse
import retrofit2.Response

class UserRepository {
    suspend fun loginUser(loginRequest: LoginRequest): Response<LoginResponse>? {
        return UserApi.getApi()?.loginUser(loginRequest = loginRequest)
    }
}

