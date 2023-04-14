package com.WAAHomework.WAA.Service;


import com.WAAHomework.WAA.Entity.dto.request.LoginRequest;
import com.WAAHomework.WAA.Entity.dto.request.RefreshTokenRequest;
import com.WAAHomework.WAA.Entity.dto.response.LoginResponse;

public interface AuthService {
    LoginResponse login(LoginRequest loginRequest);
    LoginResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}