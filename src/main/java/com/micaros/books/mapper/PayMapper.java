package com.micaros.books.mapper;


import com.micaros.books.pojo.Pay;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PayMapper {

    @Select("select * from pay")
    List<Pay> getAllPay();

}
