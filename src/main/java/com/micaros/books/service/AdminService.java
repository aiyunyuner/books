package com.micaros.books.service;

import com.micaros.books.mapper.AdminMapper;
import com.micaros.books.pojo.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private AdminMapper adminMapper;

    public Integer login(Admin admin) {
        Admin login = adminMapper.login(admin);
        if (login != null) {
            return 1;
        }
        return 0;
    }

}
