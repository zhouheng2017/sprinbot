package com.mytest.sprinbot.rabbit.hello;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author: zhouheng
 * @Created: with IntelliJ IDEA.
 * @Description:
 * @Date: 2019-05-23
 * @Time: 8:51
 */
@RabbitListener(queues = "hello")
@Component
public class HelloReceiver2 {

    @RabbitHandler
    public void receive(String hello){
        System.out.println(hello);
    }
}
