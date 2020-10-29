package com.jxd.comment.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jxd.comment.mapper.ICommentScoreMapper;
import com.jxd.comment.model.CommentScore;
import com.jxd.comment.service.ICommentScoreService;
import org.springframework.stereotype.Service;

/**
 * @ClassName CommentScoreServiceImpl
 * @Description TODO
 * @Author lxz
 * @Date 2020/10/28 0028
 * @Version 1.0
 */
@Service
public class CommentScoreServiceImpl extends ServiceImpl<ICommentScoreMapper, CommentScore> implements ICommentScoreService {
}
