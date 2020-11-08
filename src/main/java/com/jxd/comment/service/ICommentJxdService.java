package com.jxd.comment.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jxd.comment.model.ClassJxd;
import com.jxd.comment.model.CommentJxd;
import com.jxd.comment.model.CourseJxd;

import java.util.List;

public interface ICommentJxdService extends IService<CommentJxd> {

    //查询评价项列表并分页
    List<CommentJxd> getCommentByName(int pageStart,int pageSize,String commentName);
}
