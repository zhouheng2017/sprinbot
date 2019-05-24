package com.mytest.sprinbot.mapper;

import com.mytest.sprinbot.enums.UserSexEnum;
import com.mytest.sprinbot.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @Author: zhouheng
 * @Created: with IntelliJ IDEA.
 * @Description:
 * @Date: 2019-05-24
 * @Time: 8:57
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void getAll() {
    }

    @Test
    public void getOne() {
    }

    @Test
    public void insert() {
        userMapper.insert(new User("aaab", "a123456ab", UserSexEnum.MAN));


    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }
}