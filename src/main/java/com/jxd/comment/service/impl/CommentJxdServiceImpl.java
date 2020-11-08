package com.jxd.comment.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jxd.comment.mapper.ICommentJxdMapper;
import com.jxd.comment.model.CommentJxd;
import com.jxd.comment.service.ICommentJxdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName CommentJxdServiceImpl
 * @Description TODO
 * @Author lxz
 * @Date 2020/10/28 0028
 * @Version 1.0
 */
@Service
public class CommentJxdServiceImpl extends ServiceImpl<ICommentJxdMapper, CommentJxd> implements ICommentJxdService {

    @Resource
    private ICommentJxdMapper commentJxdMapper;

    //查询评价项列表并分页
    public List<CommentJxd> getCommentByName(int pageStart, int pageSize, String commentName){
     return commentJxdMapper.getCommentByName(pageStart,pageSize,commentName);
    }
}
