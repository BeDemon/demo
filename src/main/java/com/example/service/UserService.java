package com.example.service;

import com.example.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    User getById(String userId);

    int insertUser(User user);

    List<User> getUsersByOrder();

    List<User> getUsersByLevel(int userLevel);

    int updateUser(User user);

    int deleteUser(String userId);

    int deleteAllUsers();
}
