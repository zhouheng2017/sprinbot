package com.mytest.sprinbot.controller;

import com.mytest.sprinbot.model.UserRegist;
import com.mytest.sprinbot.service.UserRegistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Author: zhouheng
 * @Created: with IntelliJ IDEA.
 * @Description:
 * @Date: 2019-08-28
 * @Time: 15:00
 */
@RestController
@RequestMapping("/user")
public class UserRegistController {

    @Autowired
    private UserRegistService userRegistService;

    @RequestMapping("/save")
    public String save(String phone, String pwd) {

        UserRegist userRegist = new UserRegist();
        userRegist.setPhone(phone);
        userRegist.setPwd(pwd);
        userRegist.setRegistTime(new Date());

        userRegistService.insert(userRegist);
        return "OK";
    }
}
