package com.jxd.comment.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jxd.comment.model.EmpJxd;

import java.util.List;

public interface IEmpService extends IService<EmpJxd> {
    //经理方法
    List<EmpJxd> selectOwn(int empno);
}
