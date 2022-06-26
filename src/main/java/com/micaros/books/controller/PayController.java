package com.micaros.books.controller;


import com.micaros.books.pojo.Pay;
import com.micaros.books.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pay")
public class PayController {
    @Autowired
    private PayService payService;

    @GetMapping("/allpay")
    public List<Pay> getAllPay(){
        return  payService.getAllPay();
    }
}
