package com.jxd.comment.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jxd.comment.model.CourseJxd;

import java.util.List;
import java.util.Map;

public interface ICourseService extends IService<CourseJxd> {
    List<Map<String,Object>> getCourseScoreByEmpno(int empno);


    //查询课程列表并分页
    List<CourseJxd> getCourseByName(int pageStart,int pageSize,String courseName);
}
