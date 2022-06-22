package com.micaros.books.mapper;


import com.micaros.books.pojo.Borrow;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BorrowInfoMapper {


    //向借阅表中插入一条数据
    @Insert("INSERT INTO `borrow` (BorName, BookId, BookName, BookAuthor, NowTime) VALUES (#{BorName}, #{BookId}, #{BookName}, #{BookAuthor}, #{NowTime})")
    Integer addItem(Borrow borrow);

    //\根据uid查询记录
    @Select("SELECT * FROM borrow where BorName = #{uid}")
    List<Borrow> findItemByUid(String uid);

    //根据订单编号删除记录
    @Delete("DELETE FROM borrow WHERE id = #{id}")
    Integer deleteItemById(Integer id);


}
