package com.micaros.books.controller;

import com.micaros.books.pojo.Book;
import com.micaros.books.pojo.Borrow;
import com.micaros.books.pojo.User;
import com.micaros.books.service.BookService;
import com.micaros.books.service.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;


    @GetMapping("/all")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @PostMapping("/Ibook")
    public Book insertBook(Book book) {
        return bookService.insertBook(book);
    }


    @GetMapping("/name")
    public  List<Book> findBookByName(String BookName){
        return  bookService.findBookByName(BookName);
    }




        @GetMapping("/dbook")
    public  Integer deleteBookById(Integer id){
        System.out.println(id);
        return  bookService.deleteBookById(id);
    }
}

