package com.jxd.comment.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jxd.comment.mapper.IEmpMapper;
import com.jxd.comment.model.EmpJxd;
import com.jxd.comment.service.IEmpService;
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
public class EmpServiceImpl extends ServiceImpl<IEmpMapper,EmpJxd> implements IEmpService {
    @Override
    public List<EmpJxd> selectOwn(int empno) {
        return null;
    }
}
