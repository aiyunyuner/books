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

    public User insertUser(User user) {
        return userMapper.insertUser(user);
    }

    public User findUserById(User user) {
        return userMapper.findUserById(user);
    }

    public Integer updateUserById(User user) {
        return userMapper.updateUserById(user);
    }


    public  Integer deleteUserById(Integer  id){
        return  userMapper.deleteUserById(id);}



}
