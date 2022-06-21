package com.micaros.books.service;

import com.micaros.books.mapper.BookMapper;
import com.micaros.books.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookMapper bookMapper;

    public List<Book> getAllBooks() {
        return bookMapper.getAllBooks();
    }

    public Book findBookById(Integer id) {
        return bookMapper.findBookById(id);
    }
}
