package com.jxd.comment.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jxd.comment.model.DeptJxd;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface IDeptJxdMapper extends BaseMapper<DeptJxd> {
    List<Map<String,Object>> selectAllDept();

    List<Map<String,Object>> selectAllDeptByName(@Param("dname") String dname);

    boolean insertDept(@Param("dname") String dname);
}
