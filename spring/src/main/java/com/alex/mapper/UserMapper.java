package com.alex.mapper;

import com.alex.entity.UserEntity;
public interface UserMapper {
    UserEntity queryUserById(int id);
}
