package com.bwie.controller;

import com.bwie.service.ITestService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author 李奉武
 * @Motto 逆水行舟, 不进则退
 * @Date 2021/10/16 12:27
 * @Version 1.0
 */
@Controller
public class TestController {

    @Autowired
    ITestService testService;

    @GetMapping("/test")
    @HystrixCommand(fallbackMethod = "error")
    public String test(){
        String test = testService.test();
        return "ok";
    }

    public String error(){
        return "error";
    }
}
