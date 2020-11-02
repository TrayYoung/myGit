package com.jxd.comment.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jxd.comment.model.SelectSumCmt;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface ISelectSumCmtMapper extends BaseMapper<SelectSumCmt> {
    Map<String,Object> getSumCommentSchool(int empno);
    Map<String,Object> getSumCommentCompany(@Param("empno") int empno, @Param("content_type") String content_type);
}
