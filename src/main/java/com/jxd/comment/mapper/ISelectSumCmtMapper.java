package com.jxd.comment.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jxd.comment.model.SelectSumCmt;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ISelectSumCmtMapper extends BaseMapper<SelectSumCmt> {
    Map<String,Object> getSumCommentSchool(int empno);
    Map<String,Object> getSumCommentCompany(@Param("empno") int empno, @Param("content_type") String content_type);
    List<Map<String,Object>> getAllSumCommentCompany(@Param("deptno") int deptno, @Param("content_type") String content_type);
}
