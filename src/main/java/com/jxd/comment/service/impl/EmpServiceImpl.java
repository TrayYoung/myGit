package com.jxd.comment.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jxd.comment.mapper.IEmpMapper;
import com.jxd.comment.model.EmpJxd;
import com.jxd.comment.service.IEmpService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @ClassName EmpServiceImpl
 * @Description TODO
 * @Author GengYang
 * @Date 2020/10/28
 * @Version 1.0
 */

@Service
public class EmpServiceImpl extends ServiceImpl<IEmpMapper, EmpJxd> implements IEmpService {

    @Resource
    private IEmpMapper empMapper;

    @Override
    public int selectOwnDeptno(int empno) {
        return empMapper.selectManagerDeptno(empno);
    }

    @Override
    public List<Map<String, Object>> selectByDeptno(int deptno) {
        return empMapper.selectEmpByDeptno(deptno);
    }

    @Override
    public List<Map<String, Object>> selectByDeptnoAndName(int deptno, String ename) {
        return empMapper.selectEmpByDeptnoAndEname(deptno, ename);
    }

    @Override
    public Map<String, Object> getMessage(int empno) {
        return empMapper.getMessage(empno);
    }

    @Override
    public List<Map<String, Object>> getStudentByCno(int class_num) {
        return empMapper.selectStudentByCno(class_num);
    }

/*
    //以下是学生方法!
    //学生方法!
    //学生方法!
    @Override
    public List<Map<String, Object>> getClassMemberByCNo(int cNo) {
        return empMapper.getClassMemberByCNo(cNo);
    }*/

    @Override
    public EmpJxd getTeacher(int class_num) {
        return empMapper.getTeacher(class_num);
    }

    @Override
    public List<Map<String, Object>> getStudentsToAddListForSelect() {
        return empMapper.getStudentsToAddListForSelect();
    }

    @Override
    public List<Map<String,Object>> getStudentByName(int pageStart,int pageSize,
                                                     String ename,int class_num){
        return empMapper.getStudentByName(pageStart,pageSize,ename,class_num);
    };

    @Override
    public boolean deleteStudentFromOneClass(int empno) {
        return empMapper.deleteStudentFromOneClass(empno);
    }

    //得到学生总表
    @Override
    public List<Map<String, Object>> selectStudentList() {
        return empMapper.selectStudentList();
    }

    //得到教师总表
    @Override
    public List<Map<String, Object>> selectTeacherList() {
        return empMapper.selectTeacherList();
    }

    //得到其他员工总表
    @Override
    public List<Map<String, Object>> selectEmpJxdList() {
        return empMapper.selectEmpJxdList();
    }

    @Override
    public List<Map<String, Object>> getOnesScoreByEmpno(int empno) {
        return empMapper.getOnesScoreByEmpno(empno);
    }

    @Override
    public List<Map<String, Object>> getOnesSumCommentByEmpno(int empno) {
        return empMapper.getOnesSumCommentByEmpno(empno);
    }
}
