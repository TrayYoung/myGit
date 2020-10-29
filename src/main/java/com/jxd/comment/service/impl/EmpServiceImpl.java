package com.jxd.comment.service.impl;

import com.jxd.comment.mapper.IEmpMapper;
import com.jxd.comment.model.EmpJxd;
import com.jxd.comment.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName EmpServiceImpl
 * @Description TODO
 * @Author GengYang
 * @Date 2020/10/28
 * @Version 1.0
 */

@Service
public class EmpServiceImpl implements IEmpService {
    @Autowired
    private IEmpMapper empMapper;
    @Override
    public List<EmpJxd> selectOwn(int empno) {
        return empMapper.selectById(empno);
    }
}
