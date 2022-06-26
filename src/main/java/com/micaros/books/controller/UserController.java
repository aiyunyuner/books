package com.micaros.books.controller;

import com.micaros.books.pojo.User;
import com.micaros.books.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }

    @PostMapping("/login")
    public int login(User user) {
        return userService.login(user);
    }

    @GetMapping("/test")
    public String test() {
        return "wangcheng";
    }

    @PostMapping("/add")
    public User insertUser(User user) {
        return userService.insertUser(user);
    }

    @PostMapping("/user")
    public User findUserById(User user) {

        User userById = userService.findUserById(user);
        if (userById==null){
            return null;
        }
        return userService.findUserById(user);
    }
    @PostMapping("/update")
    public Integer updateUserById(User user) {
        return userService.updateUserById(user);
    }

    @GetMapping ("/delete")

    public Integer deleteUserById(Integer id){
        System.out.println(id);
        return  userService.deleteUserById(id);}


}
