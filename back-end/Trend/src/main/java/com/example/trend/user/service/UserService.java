package com.example.trend.user.service;

import com.example.trend.user.dto.TokenDto;
import com.example.trend.user.dto.UserInfoResponseDto;
import com.example.trend.user.dto.UserLoginRequestDto;
import com.example.trend.user.dto.UserSignupRequestDto;

public interface UserService {
    void signUp(UserSignupRequestDto userSignupRequestDto) throws Exception;

    boolean duplicateCheck(String newId);

    TokenDto login(UserLoginRequestDto userLoginRequestDto) throws Exception;

    String refreshAccessToken(String refreshToken) throws Exception;

    UserInfoResponseDto findUserInfo(String userId);
}
