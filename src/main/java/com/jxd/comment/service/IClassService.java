package com.jxd.comment.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jxd.comment.model.ClassJxd;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface IClassService extends IService<ClassJxd> {
    List<Map<String,Object>> getClass(int empno);
    List<Map<String,Object>> getClassListByName(int pageStart,int pageSize,String cname);
    boolean changeTeacherInOneClass(int class_num, int empno);
    boolean addClass(String cname, int empno);
}
