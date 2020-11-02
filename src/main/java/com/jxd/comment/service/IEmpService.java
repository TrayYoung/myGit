package com.jxd.comment.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jxd.comment.model.EmpJxd;

import java.util.List;
import java.util.Map;

public interface IEmpService extends IService<EmpJxd> {
    //经理方法
    List<Map<String, Object>> selectOwn(int empno);

    List<Map<String, Object>> selectByDeptno(int deptno);

    List<Map<String, Object>> selectByDeptnoAndName(int deptno, String ename);

    //获取信息
//    Map<String, Object> getMessage(int empno);

    //获取班级成员
    List<Map<String,Object>> getStudentByCno(int class_num);
}