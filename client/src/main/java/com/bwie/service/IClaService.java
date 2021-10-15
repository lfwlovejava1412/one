package com.bwie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bwie.entity.Cla;
import com.bwie.vo.ClaVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 李奉武
 * @since 2021-10-14
 */
@FeignClient("student-server")
public interface IClaService{

    @GetMapping("findAll")
    ArrayList<ClaVo> findAll();
}
