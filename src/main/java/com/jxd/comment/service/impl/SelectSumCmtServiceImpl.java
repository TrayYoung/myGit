package com.jxd.comment.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jxd.comment.mapper.ISelectSumCmtMapper;
import com.jxd.comment.model.SelectSumCmt;
import com.jxd.comment.service.ISelectSumCmtService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @ClassName SelectSumCmtServiceImpl
 * @Description TODO
 * @Author lxz
 * @Date 2020/10/28 0028
 * @Version 1.0
 */
@Service
public class SelectSumCmtServiceImpl extends ServiceImpl<ISelectSumCmtMapper, SelectSumCmt> implements ISelectSumCmtService {

    @Resource
    private ISelectSumCmtMapper selectSumCmtMapper;

    @Override
    public Map<String, Object> getSumCommentSchool(int empno) {
        return selectSumCmtMapper.getSumCommentSchool(empno);
    }

    @Override
    public Map<String, Object> getSumCommentCompany(int empno, String content_type) {
        return selectSumCmtMapper.getSumCommentCompany(empno, content_type);
    }

    @Override
    public List<Map<String, Object>> getAllDeptSumCommentCompany(int deptno, String content_type) {
        return selectSumCmtMapper.getAllSumCommentCompany(deptno, content_type);
    }


}
