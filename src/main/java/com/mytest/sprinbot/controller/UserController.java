package com.mytest.sprinbot.controller;

import com.mytest.sprinbot.enums.UserSexEnum;
import com.mytest.sprinbot.model.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.UUID;

/**
 * @Author: zhouheng
 * @Created: with IntelliJ IDEA.
 * @Description:
 * @Date: 2019-05-24
 * @Time: 9:36
 */
@RestController
public class UserController {
    @RequestMapping("/getUser")
    @Cacheable(value="user-keys")
    public User getUser() {
        User user=new User("aa", "aa123456", UserSexEnum.MAN);
        System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");
        return user;
    }


    @RequestMapping("/uid")
    String uid(HttpSession session) {
        UUID uid = (UUID) session.getAttribute("uid");
        if (uid == null) {
            uid = UUID.randomUUID();
        }
        session.setAttribute("uid", uid);
        return session.getId();
    }
}
