package com.micaros.books.mapper;

import com.micaros.books.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AdminMapper {

    @Select("select * from admin where aid=#{aid} and password=#{password} and name=#{name}")
    Admin login(Admin admin);
}
