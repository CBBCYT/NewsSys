package com.user.service;

import com.user.mapper.UserMapper;
import com.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserById(String id)
    {
        User user = userMapper.getUserById(id);
        return user;
    }

    public List<User> getAll()
    {
        return userMapper.getAll();
    }
}
