package com.jxd.comment.service;

import com.jxd.comment.model.EmpJxd;

public interface IEmpService {
    //经理方法
    EmpJxd selectOwn(int empno);
}
