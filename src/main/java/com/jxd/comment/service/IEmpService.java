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

/*  List<Map<String,Object>> getClassMemberByCNo(int cNo);*/
    //获取信息
    Map<String, Object> getMessage(int empno);

    //获取班级成员
    List<Map<String,Object>> getStudentByCno(int class_num);

    //获取老师
    EmpJxd getTeacher(int class_num);

    List<Map<String,Object>> getStudentsToAddListForSelect();

    //学生方法,把一名学生从班里删除，但不删除学生本人
    boolean deleteStudentFromOneClass(int empno);
}