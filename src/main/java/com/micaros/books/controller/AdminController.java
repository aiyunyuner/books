package com.micaros.books.controller;

import com.micaros.books.pojo.Admin;
import com.micaros.books.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

//    @Autowired
//    private AdminService adminService;
//
//    @PostMapping("/login")
//    public Integer login(Admin admin){
//        System.out.println(admin);
//        return adminService.login(admin);
//    }

}
