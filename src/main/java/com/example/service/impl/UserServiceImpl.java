package com.example.service.impl;

import com.example.Mapper.UserMapper;
import com.example.entity.User;
import com.example.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getById(String user_id) {
        return userMapper.getById(user_id);
    }
}
