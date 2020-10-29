package com.jxd.comment.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jxd.comment.model.EmpJxd;

import java.util.List;
import java.util.Map;

public interface IEmpMapper extends BaseMapper<EmpJxd> {
    //经理方法

    /**
     * 查询个人信息
     * @param empno
     * @return
     */
    List<Map<String,Object>> selectById(int empno);

    List<Map<String,Object>> selectEmpByDeptno(int deptno);
}
