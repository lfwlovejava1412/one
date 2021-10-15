package com.bwie.controller;


import com.bwie.entity.Stu;
import com.bwie.service.IStuService;
import com.bwie.vo.StuVo;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 李奉武
 * @since 2021-10-14
 */
@RestController
public class StuController {

    @Autowired
    IStuService stuService;

    @PostMapping("/pagelist")
    PageInfo<StuVo> pagelist(@RequestBody StuVo stuVo, @RequestParam("cpage") Integer cpage){
        return stuService.pagelist(stuVo,cpage);
    }

    @GetMapping("/deleteCheck")
    Integer deleteCheck(@RequestParam String ids){
        return stuService.deleteCheck(ids);
    }

    @PostMapping("/addone")
    Integer addone(@RequestBody StuVo stuVo){
        return stuService.addone(stuVo);
    }

    @PostMapping("/addStu")
    boolean save(@RequestBody Stu stu){
        return stuService.save(stu);
    }

}
