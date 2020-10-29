package com.jxd.comment.service;

import com.jxd.comment.model.EmpJxd;

import java.util.List;

public interface IEmpService {
    //经理方法
    List<EmpJxd> selectOwn(int empno);
}
