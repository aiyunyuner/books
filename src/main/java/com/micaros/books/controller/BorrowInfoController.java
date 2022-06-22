package com.micaros.books.controller;


import com.micaros.books.pojo.Borrow;
import com.micaros.books.service.BorrowInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/borrow")
public class BorrowInfoController {

    @Autowired
    BorrowInfoService borrowInfoService;

    @PostMapping("/add")
    public Integer addItem(Borrow borrow)
    {
        return borrowInfoService.addItem(borrow);
    }

}
