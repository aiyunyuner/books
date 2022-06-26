package com.micaros.books.mapper;

import com.micaros.books.pojo.Borrow;
import com.micaros.books.pojo.Collect;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CollectMapper {


    //删除表中数据根据id
    @Delete("DELETE FROM collect where id = #{id}")
    Integer deleteItem(Integer id);

    @Select("SELECT * FROM collect where BorName = #{uid}")
    //根据uid查询item
    List<Collect> findItemByUid(String uid);

    @Insert("INSERT INTO collect (BorName,BookId,BookName,BookAuthor,NowTime) VALUES (#{BorName},#{BookId},#{BookName},#{BookAuthor},#{NowTime})")
    //根据uid增加一条收藏记录
    Integer addItem(Collect collect);

}
