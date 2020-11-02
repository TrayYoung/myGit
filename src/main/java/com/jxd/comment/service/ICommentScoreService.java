package com.jxd.comment.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jxd.comment.model.CommentScore;

import java.util.List;
import java.util.Map;

public interface ICommentScoreService extends IService<CommentScore> {
    List<Map<String,Object>> getCommentScoreByEmpnoAndYear(int empno,int year);
}
