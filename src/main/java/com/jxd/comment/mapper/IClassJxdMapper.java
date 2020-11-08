package com.jxd.comment.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jxd.comment.model.ClassJxd;

import java.util.List;
import java.util.Map;

public interface IClassJxdMapper extends BaseMapper<ClassJxd>{
    List<Map<String,Object>> getClassByTeacher(int empno);//获取当前班级下的所有学生
    List<Map<String,Object>> selectStu(int empno,int empno_stu,String ename);//学员和名字查询
    List<Map<String,Object>> selectStuByEmpno(int empno,int empno_stu);//根据学员编号查询
    List<Map<String,Object>> selectStuByEname(int empno,String ename);//根据学员姓名查询
    List<Map<String,Object>> getCourse();//获得所有课程
    List<Map<String,Object>> getScore(int empno,int courseid);//成绩
    List<Map<String,Object>> getEmpInfo(int empno);//查看个人信息
    boolean setScore(double score,int empno_stu,int empno_tch,int courseid);//评分
    /*查询*/
    List<Map<String,Object>> selectByEmpno(int empno);


}
