package com.jxd.comment.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jxd.comment.model.EmpJxd;

import java.util.List;
import java.util.Map;

public interface IEmpService extends IService<EmpJxd> {
    //经理方法
    List<Map<String,Object>> selectOwn(int empno);
}
