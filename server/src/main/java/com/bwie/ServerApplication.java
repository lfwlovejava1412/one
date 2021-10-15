package com.bwie;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName ServerApplication
 * @Description TODO
 * @Author 李奉武
 * @Motto 逆水行舟, 不进则退
 * @Date 2021/10/14 10:42
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.bwie.mapper")
public class ServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class,args);
    }
}
