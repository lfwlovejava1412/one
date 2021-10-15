package com.bwie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bwie.entity.Stu;
import com.bwie.vo.StuVo;
import com.github.pagehelper.PageInfo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 李奉武
 * @since 2021-10-14
 */
public interface IStuService extends IService<Stu> {

    PageInfo<StuVo> pagelist(StuVo stuVo, Integer cpage);

    Integer deleteCheck(String ids);

    Integer addone(StuVo stuVo);
}
