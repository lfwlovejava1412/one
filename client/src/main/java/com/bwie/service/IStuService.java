package com.bwie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bwie.entity.Stu;
import com.bwie.vo.StuVo;
import com.github.pagehelper.PageInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 李奉武
 * @since 2021-10-14
 */
@FeignClient("student-server")
public interface IStuService{

    @PostMapping("pagelist")
    PageInfo<StuVo> pagelist(@RequestBody StuVo stuVo, @RequestParam("cpage") Integer cpage);

    @GetMapping("/deleteCheck")
    Integer deleteCheck(@RequestParam String ids);

    @PostMapping("/addone")
    Integer addone(@RequestBody StuVo stuVo);


    @PostMapping("/addStu")
    boolean save(@RequestBody Stu stu);
}
