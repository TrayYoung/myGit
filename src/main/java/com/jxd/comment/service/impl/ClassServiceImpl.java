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
    public List<Map<String, Object>> selectStu(int empno, int empno_stu, String ename) {
        return classJxdMapper.selectStu(empno,empno_stu,ename);
    }

    @Override
    public List<Map<String, Object>> selectStuByEmpno(int empno, int empno_stu) {
        return classJxdMapper.selectStuByEmpno(empno,empno_stu);
    }

    @Override
    public List<Map<String, Object>> selectStuByEname(int empno, String ename) {
        return classJxdMapper.selectStuByEname(empno,ename);
    }


    @Override
    public List<Map<String, Object>> getCourse() {
        return classJxdMapper.getCourse();
    }

    @Override
    public List<Map<String, Object>> getScore(int empno, int courseid) {
        return classJxdMapper.getScore(empno,courseid);
    }

    @Override
    public List<Map<String, Object>> getEmpInfo(int empno) {
        return classJxdMapper.getEmpInfo(empno);
    }

    @Override
    public boolean setScore(double score, int empno_stu, int empno_tch, int courseid) {
        boolean flag = classJxdMapper.setScore(score,empno_stu,empno_tch,courseid);
        return flag;
    }
}
