package com.bwie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bwie.entity.Cla;
import com.bwie.vo.ClaVo;

import java.util.ArrayList;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 李奉武
 * @since 2021-10-14
 */
public interface IClaService extends IService<Cla> {

    ArrayList<ClaVo> findAll();
}
