package com.micaros.books.mapper;

import com.micaros.books.pojo.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    @Select("select * from user")
    List<User> getAllUser();

    @Select("select * from user where uid=#{uid} and password=#{password}")
    Integer login(User user);


    @Insert("INSERT INTO `user` ( `name`, `uid`, `password`, `sex`, `phone`, `birthday`) VALUES ( #{name}, #{uid}, #{password}, #{sex}, #{phone}, #{birthday});")
    User insertUser(User user);

    @Select("SELECT * FROM `user` WHERE uid = #{uid} ")
    User findUserById(User user);

    @Update("UPDATE `user` SET  `name`=#{name}, `password`=#{password}, `sex`=#{sex}, `phone`=#{phone}, `birthday`=#{birthday} WHERE uid=#{uid}")
    Integer updateUserById(User user);

    @Delete("DELETE  FROM `user` WHERE id=#{id} ")
    Integer deleteUserById(Integer id);
}
