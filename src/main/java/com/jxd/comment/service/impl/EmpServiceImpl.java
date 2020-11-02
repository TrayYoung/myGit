package com.jxd.comment.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jxd.comment.mapper.IEmpMapper;
import com.jxd.comment.model.EmpJxd;
import com.jxd.comment.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Autowired
    private IEmpMapper empMapper;

    @Override
    public List<Map<String,Object>> selectOwn(int empno) {
        return empMapper.selectByEmpno(empno);
    }

    @Override
    public List<Map<String, Object>> selectByDeptno(int deptno) {
        return empMapper.selectEmpByDeptno(deptno);
    }

    @Override
    public List<Map<String, Object>> selectByDeptnoAndName(int deptno,String ename) {
        return empMapper.selectEmpByDeptnoAndEname(deptno,ename);
    }

    @Override
    public Map<String, Object> getMessage(int empno) {
        return empMapper.getMessage(empno);
    }



    //以下是学生方法!
    //学生方法!
    //学生方法!
    @Override
    public List<Map<String, Object>> getClassMemberByCNo(int cNo) {
        return empMapper.getClassMemberByCNo(cNo);
    }
}
