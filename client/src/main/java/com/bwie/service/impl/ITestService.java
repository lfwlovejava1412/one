package com.bwie.service.impl;

import org.springframework.stereotype.Service;

/**
 * @ClassName ITestService
 * @Description TODO
 * @Author 李奉武
 * @Motto 逆水行舟, 不进则退
 * @Date 2021/10/16 12:51
 * @Version 1.0
 */
@Service
public class ITestService implements com.bwie.service.ITestService {

    @Override
    public String test() {
        return "null";
    }
}
