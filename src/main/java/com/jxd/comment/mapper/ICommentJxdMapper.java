package com.jxd.comment.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jxd.comment.model.CommentJxd;
import com.jxd.comment.model.CourseJxd;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ICommentJxdMapper extends BaseMapper<CommentJxd> {

    //查询课程列表并分页
    List<CommentJxd> getCommentByName(@Param("pageStart") int pageStart,
                                      @Param("pageSize")int pageSize,
                                      @Param("commentName") String commentName);
}
