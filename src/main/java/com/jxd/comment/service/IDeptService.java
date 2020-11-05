package com.jxd.comment.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jxd.comment.model.DeptJxd;

import java.util.List;
import java.util.Map;

public interface IDeptService extends IService<DeptJxd> {
    List<Map<String,Object>> selectAllDept();

    List<Map<String,Object>> selectAllDeptByName(String dname);

    boolean addDept(String dname);
}
