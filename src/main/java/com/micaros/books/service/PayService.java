package com.micaros.books.service;

import com.micaros.books.mapper.BorrowMapper;
import com.micaros.books.mapper.PayMapper;
import com.micaros.books.pojo.Borrow;
import com.micaros.books.pojo.Pay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class PayService {
    @Autowired
    private PayMapper payMapper;
    public List<Pay> getAllPay(){
        return  payMapper.getAllPay();
    }




}
