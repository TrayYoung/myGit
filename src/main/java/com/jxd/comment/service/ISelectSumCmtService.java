package com.jxd.comment.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jxd.comment.model.SelectSumCmt;

import java.util.Map;

public interface ISelectSumCmtService extends IService<SelectSumCmt> {
    Map<String,Object> getSumCommentSchool(int empno);
    Map<String,Object> getSumCommentCompany(int empno,String content_type);

}
