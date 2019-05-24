package com.mytest.sprinbot.exception;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zhouheng
 * @Created: with IntelliJ IDEA.
 * @Description:
 * @Date: 2019-05-24
 * @Time: 8:20
 */
@ControllerAdvice
public class ExceptionHand {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Map<String, String> handler(Exception e) {
        Map<String, String> map = new HashMap<>();

        map.put("retCode", "000000");
        map.put("retMsg", "Exception");
        map.put("retDate", e.getMessage());
        return map;
    }
}
