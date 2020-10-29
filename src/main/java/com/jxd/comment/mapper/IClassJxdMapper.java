package com.jxd.comment.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jxd.comment.model.ClassJxd;

import java.util.List;
import java.util.Map;

public interface IClassJxdMapper extends BaseMapper<ClassJxd>{
    List<Map<String,Object>> getClassByTeacher(int empno);
}
