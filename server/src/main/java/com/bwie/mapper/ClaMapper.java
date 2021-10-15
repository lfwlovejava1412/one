package com.bwie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bwie.entity.Cla;
import com.bwie.vo.ClaVo;

import java.util.ArrayList;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 李奉武
 * @since 2021-10-14
 */
public interface ClaMapper extends BaseMapper<Cla> {

    ArrayList<ClaVo> findAll();
}
