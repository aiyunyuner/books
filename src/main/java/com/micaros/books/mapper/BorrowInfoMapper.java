package com.micaros.books.mapper;


import com.micaros.books.pojo.Borrow;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface BorrowInfoMapper {



    @Insert("INSERT INTO `borrow` (BorName, BookId, BookName, BookAuthor, NowTime) VALUES (#{BorName}, #{BookId}, #{BookName}, #{BookAuthor}, #{NowTime})")
    Integer addItem(Borrow borrow);


}
