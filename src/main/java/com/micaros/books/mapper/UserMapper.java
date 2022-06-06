package com.micaros.books.mapper;

import com.micaros.books.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    @Select("select * from user")
    List<User> getAllUser();

    @Select("select * from user where name=#{name} and password=#{password}")
    Integer login(User user);
}
