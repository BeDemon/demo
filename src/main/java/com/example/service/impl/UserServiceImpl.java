package com.example.service.impl;

import com.example.mappers.UserMapper;
import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getById(String userId) {
        return userMapper.getById(userId);
    }

    @Override
    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public List<User> getUsersByOrder() {
        return userMapper.getUsersByOrder();
    }

    @Override
    public List<User> getUsersByLevel(int userLevel) {
        return userMapper.getUsersByLevel(userLevel);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public int deleteUser(String userId) {
        return userMapper.deleteUser(userId);
    }

    @Override
    public int deleteAllUsers() {
        return userMapper.deleteAllUsers();
    }


}
