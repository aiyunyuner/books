package com.micaros.books.service;

import com.micaros.books.controller.BorrowInfoController;
import com.micaros.books.mapper.BorrowInfoMapper;
import com.micaros.books.pojo.Borrow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowInfoService {
    @Autowired
    BorrowInfoMapper borrowInfoMapper;

    public Integer addItem(Borrow borrow){
        return borrowInfoMapper.addItem(borrow);
    }

    public List<Borrow> findItemByUid(String uid){
        return borrowInfoMapper.findItemByUid(uid);
    }

    public Integer deleteItemById(Integer id){
        return borrowInfoMapper.deleteItemById(id);
    }
}
