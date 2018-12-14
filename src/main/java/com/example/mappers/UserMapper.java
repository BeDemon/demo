package com.example.mappers;

import com.example.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    User getById(String userId);

    public boolean insert(String userName);

    public List<User> getUsers();

    public boolean updateUser(User user);

    public boolean deleteUser(String userId);

    public boolean deleteAllUsers();
}