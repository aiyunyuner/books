package com.micaros.books.mapper;

import com.micaros.books.pojo.Book;
import com.micaros.books.pojo.Borrow;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface BorrowMapper {


        @Select("select * from borrow")
        List<Borrow> getAllBorrow();


    }
