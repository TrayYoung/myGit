package com.jxd.comment.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jxd.comment.model.EmpJxd;

import java.util.List;

public interface IEmpMapper extends BaseMapper<EmpJxd> {
    //经理方法

    /**
     * 查询个人信息
     * @param empno
     * @return
     */
    List<EmpJxd> selectById(int empno);


}
