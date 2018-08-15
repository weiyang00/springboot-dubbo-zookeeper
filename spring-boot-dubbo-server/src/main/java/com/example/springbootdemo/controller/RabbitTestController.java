package com.example.springbootdemo.controller;

import com.example.springbootdemo.singleton.HelloSender1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/rabbit")
public class RabbitTestController {

    @Autowired
    private HelloSender1 helloSender1;
    @Autowired
    private HelloSender1 helloSender2;

    /**
     * 单生产者-单消费者
     */
    @GetMapping("/hello")
    public void hello() {
        helloSender1.send();
    }


}