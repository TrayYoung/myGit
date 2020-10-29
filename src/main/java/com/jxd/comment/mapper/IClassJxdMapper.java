package com.jxd.comment.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jxd.comment.model.ClassJxd;

import java.util.List;

public interface IClassJxdMapper extends BaseMapper<ClassJxd>{
    List<ClassJxd> getClassByTeacher(int empno);
}
