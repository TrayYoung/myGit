package com.jxd.comment.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jxd.comment.mapper.IClassJxdMapper;
import com.jxd.comment.model.ClassJxd;
import com.jxd.comment.service.IClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @ClassName ClassServiceImpl
 * @Description TODO
 * @Author lxz
 * @Date 2020/10/28 0028
 * @Version 1.0
 */
@Service
public class ClassServiceImpl extends ServiceImpl<IClassJxdMapper, ClassJxd> implements IClassService {
    @Resource
    private IClassJxdMapper classJxdMapper;
    @Override
    public List<Map<String,Object>> getClass(int empno) {
        return classJxdMapper.getClassByTeacher(empno);
    }

    @Override
    public List<Map<String, Object>> getStudentByClass(int cls) {
        return classJxdMapper.getStudentByClass(cls);
    }

    @Override
    public List<Map<String, Object>> getCourseByTeacher(int empno) {
        return classJxdMapper.getCourseByTeacher(empno);
    }
}
