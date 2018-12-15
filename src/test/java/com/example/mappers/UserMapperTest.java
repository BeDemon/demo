package com.example.mappers;

import com.example.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;
    @Test
    public void getById() {
        User user = userMapper.getById("1101");
        Assert.assertEquals("小米", user.getUserName());
    }

    @Test
    public void insert() {
        User user = new User();
        user.setUserId("1213");
        user.setUserName("芳芳");
        user.setUserJob("文艺");
        user.setUserLevel(2);
        int result = userMapper.insertUser(user);
        Assert.assertEquals(1,result);
    }

    @Test
    public void getUsersByLevel(){
        List<User> userList = userMapper.getUsersByLevel(1);
        System.out.print(userList);
    }

    @Test
    public void getUsersByOrder() {
        List<User> userList = userMapper.getUsersByOrder();
        System.out.print(userList);
    }

    @Test
    public void updateUser() {
        User user = userMapper.getById("1101");
        user.setUserName("小方");
        userMapper.updateUser(user);
    }

    @Test
    public void deleteUser() {
        userMapper.deleteUser("1354");
    }

    @Test
    public void deleteAllUsers() {
    }
}