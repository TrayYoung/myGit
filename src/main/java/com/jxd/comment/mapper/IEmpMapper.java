package com.jxd.comment.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jxd.comment.model.EmpJxd;

public interface IEmpMapper extends BaseMapper<EmpJxd> {
    //经理方法

    /**
     * 查询个人信息
     * @param empno
     * @return
     */
    EmpJxd selectById_A(int empno);


}
