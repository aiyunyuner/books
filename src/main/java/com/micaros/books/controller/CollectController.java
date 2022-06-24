package com.micaros.books.controller;

import com.micaros.books.pojo.Collect;
import com.micaros.books.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/collect")
public class CollectController {

    @Autowired
    CollectService collectService;


    @GetMapping("/select")
    public List<Collect> findItemByUid(String uid){
//        System.out.println(collectService.findItemByUid(uid));
        return collectService.findItemByUid(uid);
    }

    @PostMapping("/add")
    public Integer addItem(Collect collect){
        return collectService.addItem(collect);
    }

    @GetMapping("/delete")
    public Integer deleteItem(Integer id){
        return collectService.deleteItem(id);
    }


}
