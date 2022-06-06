package com.micaros.books.service;

import com.micaros.books.mapper.UserMapper;
import com.micaros.books.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }

    public Integer login(User user) {

        if (userMapper.login(user) != null) {
            return userMapper.login(user);
        } else
            return 0;
    }
}
