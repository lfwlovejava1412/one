package com.bwie.controller;


import com.bwie.QRCodeService;
import com.bwie.entity.Stu;
import com.bwie.service.IClaService;
import com.bwie.service.IStuService;
import com.bwie.vo.ClaVo;
import com.bwie.vo.StuVo;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 李奉武
 * @since 2021-10-14
 */
@Controller
public class StuController {

    @Autowired
    IStuService stuService;

    @Autowired
    IClaService claService;

    @GetMapping("/list")
    public String list(Model model, StuVo stuVo,
                       @RequestParam(defaultValue = "1")Integer cpage){
        ArrayList<ClaVo> list=claService.findAll();
        PageInfo<StuVo> pi=stuService.pagelist(stuVo,cpage);
        model.addAttribute("li",list);
        model.addAttribute("pi",pi);
        model.addAttribute("vo",stuVo);
        return "list";
    }

    @RequestMapping("/deleteCheck")
    @ResponseBody
    public Integer deleteCheck(String ids){
        return stuService.deleteCheck(ids);
    }

    @GetMapping("/toadd")
    public String toadd(Model model){
        ArrayList<ClaVo> list = claService.findAll();
        model.addAttribute("li",list);
        return "add";
    }

    @RequestMapping ("/addone")
    @ResponseBody
    public Integer addone(StuVo stuVo){
         Integer i=stuService.addone(stuVo);
        return i;
    }

    @PostMapping("/addStu")
    @ResponseBody
    public boolean  addStu(Stu stu){
        return stuService.save(stu);
    }
}
