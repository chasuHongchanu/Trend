package com.example.trend.user.repository;

import com.example.trend.exception.CustomException;
import com.example.trend.exception.ErrorCode;
import com.example.trend.user.dto.UserLoginRequestDto;
import com.example.trend.user.dto.UserSignupRequestDto;
import com.example.trend.user.entity.UserEntity;
import com.example.trend.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository{

    private final UserMapper userMapper;

    @Autowired
    public UserRepositoryImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public String searchUserByIdAndPassword(UserLoginRequestDto userLoginRequestDto) {
        UserEntity userEntity = userMapper.findUserByIdAndPassword(userLoginRequestDto);
        if (userEntity == null) {
            throw new CustomException(ErrorCode.NOT_FOUND_MATCHED_USER);
        }
        return userEntity.getUserId();
    }

    @Override
    public void saveRefreshToken(String userId, String refreshToken) {
        int result = userMapper.insertRefreshToken(userId, refreshToken);
    }
}
