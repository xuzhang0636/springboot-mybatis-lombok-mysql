package com.xuzhang.springbootmybatismysqllombok.mapper;

import com.xuzhang.springbootmybatismysqllombok.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    @Insert({"insert into users(username,password,phone) values(#{user.username},#{user.password},#{user.phone})"})
    int insertUser(@Param("user") User user);

    @Select({"select * from users where id = #{id}"})
    User selectUserByUserId(long id);
}
