package com.jxd.comment.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jxd.comment.model.CourseJxd;

import java.util.List;
import java.util.Map;

public interface ICourseJxdMapper extends BaseMapper<CourseJxd> {
    List<Map<String,Object>> getCourseScoreByEmpno(int empno);
}
