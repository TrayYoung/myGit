package com.jxd.comment.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jxd.comment.mapper.ICourseJxdMapper;
import com.jxd.comment.model.CourseJxd;
import com.jxd.comment.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @ClassName CourseServiceImpl
 * @Description TODO
 * @Author lxz
 * @Date 2020/10/28 0028
 * @Version 1.0
 */
@Service
public class CourseServiceImpl extends ServiceImpl<ICourseJxdMapper, CourseJxd> implements ICourseService {

    @Resource
    private ICourseJxdMapper courseJxdMapper;


    @Override
    public List<Map<String, Object>> getCourseScoreByEmpno(int empno) {
        return courseJxdMapper.getCourseScoreByEmpno(empno);
    }

    @Override
    public List<CourseJxd> getCourseByName(int pageStart, int pageSize, String courseName) {
        return courseJxdMapper.getCourseByName(pageStart,pageSize,courseName);
    }
}
