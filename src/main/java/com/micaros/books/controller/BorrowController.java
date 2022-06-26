package com.micaros.books.controller;


import com.micaros.books.pojo.Borrow;
import com.micaros.books.service.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/borrow")
public class BorrowController {
    @Autowired
    private BorrowService borrowService;


    @GetMapping("/allb")
    public List<Borrow> getAllBorrow(){return borrowService.getAllBorrow(); }





}

