package com.alex.service;

import com.alex.aop.ChooseDataSource;
import com.alex.entity.UserEntity;
import com.alex.mapper.UserMapper;
import lombok.Data;

/**
 * @author alex
 * @Title: UserService
 * @ProjectName spring
 * @Description: TODO
 * @date 2019/8/14  23:45
 */
@Data
public class UserService {
    private UserMapper userMapper;
    @ChooseDataSource(dataSourceName = "dataSource1")
    public UserEntity queryUserById(int id){
        UserEntity userEntity = this.userMapper.queryUserById(id);
        return userEntity;
    }
}
