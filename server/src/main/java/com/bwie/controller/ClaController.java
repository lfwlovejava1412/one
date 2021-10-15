package com.bwie.controller;


import com.bwie.service.IClaService;
import com.bwie.vo.ClaVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 李奉武
 * @since 2021-10-14
 */
@RestController
public class ClaController {

    @Autowired
    IClaService claService;

    @GetMapping("findAll")
    ArrayList<ClaVo> findAll(){
        return claService.findAll();
    }

}
