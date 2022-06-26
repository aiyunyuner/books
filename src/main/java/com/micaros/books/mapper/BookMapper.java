package com.micaros.books.mapper;

import com.micaros.books.pojo.Book;
import com.micaros.books.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BookMapper {
    @Select("select * from book")
    List<Book> getAllBooks();


    @Insert("INSERT INTO `book` (`BookId`,`BookName`,`BookType`,`BookWriter`,`BookPublicer`,`BookPrice`,`BookRank`,`BookComment`,`img`) VALUES(#{BookId} ,#{BookName} ,#{BookType},#{BookWriter}" +
            ",#{BookPublicer},#{BookPrice},#{BookRank},#{BookComment},#{img})")

    Book insertBook(Book book);

    @Select("SELECT * FROM `book` WHERE BookName=#{BookName}")
    List<Book> findBookByName(String BookName);

    @Delete("DELETE FROM `book` WHERE id=#{id}")
    Integer deleteBookById(Integer id);
}