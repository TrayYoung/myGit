package com.jxd.comment.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jxd.comment.model.CommentScore;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ICommentScoreMapper extends BaseMapper<CommentScore> {
    List<Map<String,Object>> getCommentScoreByEmpnoAndYear(@Param("empno") int empno ,@Param("year") int year);
}
