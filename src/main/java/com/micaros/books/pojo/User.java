package com.micaros.books.pojo;

import lombok.Data;

@Data
public class User {
    private int id;
    private String name;
    private String uid;
    private String password;
    private String sex;
    private String phone;
    private String birthday;
}
