package com.ven.balu.api;

import com.ven.balu.dto.CustomerResponse;
import com.ven.balu.dto.EditProfileRequest;
import com.ven.balu.dto.LoginRequest;
import com.ven.balu.dto.LoginResponse;
import com.ven.balu.dto.RegisterRequest;
import com.ven.balu.dto.RegisterResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface APIService {
    @POST("auth/login")
    Call<LoginResponse> login(@Body LoginRequest requestData);

    @POST("auth/register")
    Call<RegisterResponse> register(@Body RegisterRequest requestData);

    @POST("profile/edit")
    Call<CustomerResponse> editProfile(@Body EditProfileRequest requestData);
}
