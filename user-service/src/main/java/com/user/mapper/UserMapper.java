package com.user.mapper;



import com.user.pojo.User;

import java.util.List;

public interface UserMapper {

    User getUserById(String id);

    List<User> getAll();
}