package com.mytest.sprinbot.controller;

import com.mytest.sprinbot.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhouheng
 * @Created: with IntelliJ IDEA.
 * @Description:
 * @Date: 2019-05-24
 * @Time: 8:28
 */
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/tests")
    public String get(String test){
        throw new RuntimeException("message");
    }



    @GetMapping("/test")
    public String test(String name) {
        String s = testService.get(name);
        System.out.println(s);
        return name;
    }
}
