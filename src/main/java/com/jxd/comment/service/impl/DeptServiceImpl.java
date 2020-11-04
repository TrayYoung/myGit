package com.jxd.comment.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jxd.comment.mapper.IDeptJxdMapper;
import com.jxd.comment.model.DeptJxd;
import com.jxd.comment.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @ClassName DeptServiceImpl
 * @Description TODO
 * @Author lxz
 * @Date 2020/10/28 0028
 * @Version 1.0
 */
@Service
public class DeptServiceImpl extends ServiceImpl<IDeptJxdMapper, DeptJxd> implements IDeptService {
    @Resource
    private IDeptJxdMapper deptJxdMapper;

    @Override
    public List<Map<String, Object>> selectAllDept() {
        return deptJxdMapper.selectAllDept();
    }

    @Override
    public List<Map<String, Object>> selectAllDeptByName(String dname) {
        return deptJxdMapper.selectAllDeptByName(dname);
    }

    @Override
    public boolean addDept(String dname) {
        return deptJxdMapper.insertDept(dname);
    }
}
