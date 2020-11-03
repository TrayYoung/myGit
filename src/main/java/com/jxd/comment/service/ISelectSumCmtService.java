package com.jxd.comment.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jxd.comment.model.SelectSumCmt;

import javax.validation.constraints.Max;
import java.util.List;
import java.util.Map;

public interface ISelectSumCmtService extends IService<SelectSumCmt> {
    Map<String,Object> getSumCommentSchool(int empno);
    Map<String,Object> getSumCommentCompany(int empno,String content_type);
    List<Map<String,Object>> getAllDeptSumCommentCompany(int deptno,String content_type);

}
