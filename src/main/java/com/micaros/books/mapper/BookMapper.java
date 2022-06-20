package com.micaros.books.mapper;

import com.micaros.books.pojo.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BookMapper {
    @Select("select * from book")
    List<Book> getAllBooks();
}
