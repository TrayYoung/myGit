package com.jxd.comment.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jxd.comment.model.EmpJxd;

public interface IEmpService extends IService<EmpJxd> {
    //经理方法
    EmpJxd selectOwn(int empno);
}
