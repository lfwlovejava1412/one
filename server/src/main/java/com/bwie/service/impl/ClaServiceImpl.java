package com.bwie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bwie.entity.Cla;
import com.bwie.mapper.ClaMapper;
import com.bwie.service.IClaService;
import com.bwie.vo.ClaVo;
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
public class ClaServiceImpl extends ServiceImpl<ClaMapper, Cla> implements IClaService {
    @Autowired
    ClaMapper claMapper;

    @Override
    public ArrayList<ClaVo> findAll() {
        return claMapper.findAll();
    }
}
