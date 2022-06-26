package com.micaros.books.service;

import com.micaros.books.mapper.BorrowMapper;
import com.micaros.books.pojo.Book;
import com.micaros.books.pojo.Borrow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowService {
    @Autowired
    private BorrowMapper borrowMapper;
    public List<Borrow> getAllBorrow() {
        return borrowMapper.getAllBorrow();
    }

}
