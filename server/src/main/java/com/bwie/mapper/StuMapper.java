package com.bwie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bwie.entity.Stu;
import com.bwie.vo.StuVo;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 李奉武
 * @since 2021-10-14
 */
public interface StuMapper extends BaseMapper<Stu> {

    ArrayList<StuVo> pagelist(StuVo stuVo);

    Integer deleteCheck(@Param("sid") String sid);

    Integer addone(StuVo stuVo);
}
