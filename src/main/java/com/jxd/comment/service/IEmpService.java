package com.jxd.comment.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jxd.comment.model.EmpJxd;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface IEmpService extends IService<EmpJxd> {
    //经理方法
    int selectOwnDeptno(int empno);

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

    //得到学生总表
    List<Map<String,Object>> selectStudentList();
    //得到教师总表
    List<Map<String,Object>> selectTeacherList();
    //得到其他员工总表
    List<Map<String,Object>> selectEmpJxdList();

    //画总表用
    List<Map<String,Object>> getOnesScoreByEmpno(int empno);
    List<Map<String,Object>> getOnesSumCommentByEmpno(int empno);
}