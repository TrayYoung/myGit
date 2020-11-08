package com.jxd.comment.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jxd.comment.model.CourseJxd;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ICourseJxdMapper extends BaseMapper<CourseJxd> {
    List<Map<String,Object>> getCourseScoreByEmpno(int empno);

    //查询课程列表并分页
    List<CourseJxd> getCourseByName(@Param("pageStart") int pageStart,
                                    @Param("pageSize")int pageSize,
                                    @Param("courseName") String courseName);
}
