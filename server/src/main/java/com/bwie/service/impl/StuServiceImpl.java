package com.bwie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bwie.entity.Stu;
import com.bwie.mapper.StuMapper;
import com.bwie.service.IStuService;
import com.bwie.vo.StuVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 李奉武
 * @since 2021-10-14
 */
@Service
public class StuServiceImpl extends ServiceImpl<StuMapper, Stu> implements IStuService {

    @Autowired
    StuMapper stuMapper;

    @Override
    public PageInfo<StuVo> pagelist(StuVo stuVo, Integer cpage) {
        PageHelper.startPage(cpage,3);
        ArrayList<StuVo> list=stuMapper.pagelist(stuVo);
        return new PageInfo<>(list);
    }

    @Override
    public Integer deleteCheck(String ids) {
        Integer x=0;
        String[] split = ids.split(",");
        if (split!=null){
            for (String sid : split) {
               Integer i= stuMapper.deleteCheck(sid);
                x=i;
            }

        }
        return x;
    }

    @Override
    public Integer addone(StuVo stuVo) {
        return stuMapper.addone(stuVo);
    }


}
