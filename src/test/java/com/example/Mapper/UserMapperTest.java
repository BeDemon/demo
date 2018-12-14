package com.example.Mapper;

import com.example.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;
    @Test
    public void getById() {
        User user = userMapper.getById("1101");
        Assert.assertEquals("小米", user.getUser_name());
    }

    @Test
    public void insert() {
    }

    @Test
    public void getUsers() {
    }

    @Test
    public void updateUser() {
    }

    @Test
    public void deleteUser() {
    }

    @Test
    public void deleteAllUsers() {
    }
}