package com.micaros.books.service;

import com.micaros.books.mapper.BookMapper;
import com.micaros.books.pojo.Book;
import com.micaros.books.pojo.User;
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
    public Book insertBook(Book book) {return bookMapper.insertBook(book);}
    public List<Book> findBookByName(String BookName){
            return  bookMapper.findBookByName(BookName);
        }

    public  Integer deleteBookById(Integer  id){
        return  bookMapper.deleteBookById(id);}
        }


