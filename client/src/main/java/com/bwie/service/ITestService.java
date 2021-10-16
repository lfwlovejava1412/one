package com.bwie.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description 添加描述
 * @InterfaceName ITestService
 * @Author 李奉武
 * @Motto 逆水行舟, 不进则退
 * @Author Waynejwei
 * @LastChangeDate 2021/10/16 12:49
 * @Version v1.0
 */
@FeignClient(value = "student-server",fallback = com.bwie.service.impl.ITestService.class)
public interface ITestService {

    @GetMapping("test")
    String test();
}
