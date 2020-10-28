package com.jxd.comment.mapper;

import com.jxd.comment.model.EmpJxd;

public interface IEmpMapper {
    //经理方法

    /**
     * 查询个人信息
     * @param empno
     * @return
     */
    EmpJxd selectById(int empno);


}
