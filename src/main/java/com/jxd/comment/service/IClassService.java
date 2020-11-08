package com.jxd.comment.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jxd.comment.model.ClassJxd;

import java.util.List;
import java.util.Map;

public interface IClassService extends IService<ClassJxd> {
    List<Map<String,Object>> getClass(int empno);
    List<Map<String,Object>> selectStu(int empno,int empno_stu,String ename);
    List<Map<String,Object>> selectStuByEmpno(int empno,int empno_stu);//根据学员编号查询
    List<Map<String,Object>> selectStuByEname(int empno,String ename);//根据学员姓名查询


    List<Map<String,Object>> getCourse();
    List<Map<String,Object>> getScore(int empno,int courseid);
    List<Map<String,Object>> getEmpInfo(int empno);
    boolean setScore(double score,int empno_stu,int empno_tch,int courseid);//评分
}
