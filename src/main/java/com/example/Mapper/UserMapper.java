package com.example.Mapper;

import com.example.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    User getById(String user_id);

    public boolean insert(String name);

    public List<User> getUsers();

    public boolean updateUser(User user);

    public boolean deleteUser(int id);

    public boolean deleteAllUsers();
}