package com.xuzhang.springbootmybatismysqllombok.mapper;

import com.xuzhang.springbootmybatismysqllombok.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestUserMapper {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void smokeTest() {
        Assertions.assertNotNull(userMapper);
    }

    @Test
    public void testInsert() {
        User user = new User();
        user.setPassword("robert");
        user.setUsername("robert");
        user.setPhone("134xxxxxxxx");
        Assertions.assertEquals(1, userMapper.insertUser(user));
    }

    @Test
    public void testSelect() {
        Assertions.assertNotNull(userMapper.selectUserByUserId(1L));
    }

}
