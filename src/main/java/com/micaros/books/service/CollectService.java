package com.micaros.books.service;


import com.micaros.books.mapper.CollectMapper;
import com.micaros.books.pojo.Collect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollectService {

    @Autowired
    CollectMapper collectMapper;




    public List<Collect> findItemByUid(String uid){
        return collectMapper.findItemByUid(uid);
    }


    public Integer addItem(Collect collect){
        return collectMapper.addItem(collect);
    }

    public Integer deleteItem(Integer id){
        return collectMapper.deleteItem(id);
    }

}
