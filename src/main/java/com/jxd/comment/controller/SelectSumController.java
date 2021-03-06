package com.jxd.comment.controller;

import com.jxd.comment.service.impl.SelectSumCmtServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @ClassName selectSumController
 * @Description TODO
 * @Author GengYang
 * @Date 2020/10/28
 * @Version 1.0
 */

@Controller
public class SelectSumController {

    @Autowired
    private SelectSumCmtServiceImpl selectSumCmtService;

    @RequestMapping("/getSumCommentSchool/{empno}")
    @ResponseBody
    public Map<String, Object> getSumCommentSchool(@PathVariable("empno") int empno) {
        Map<String, Object> map = selectSumCmtService.getSumCommentSchool(empno);
        return map;
    }

    @RequestMapping("/getSumCommentCompany/{empno}/{content_type}")
    @ResponseBody
    public List<Map<String, Object>> getSumCommentCompany
            (@PathVariable("empno") int empno, @PathVariable("content_type") String content_type) {
        Map<String, Object> map = selectSumCmtService.getSumCommentCompany(empno, content_type);
        List<Map<String, Object>> list = new ArrayList<>();
        list.add(map);
        return list;
    }

    @RequestMapping("/getAllSumCommentCompany/{deptno}/{content_type}")
    @ResponseBody
    public List<Map<String, Object>> getAllSumCommentCompany
            (@PathVariable("deptno") int deptno, @PathVariable("content_type") String content_type) {
        List<Map<String, Object>> list = selectSumCmtService.getAllDeptSumCommentCompany(deptno, content_type);
        return list;
    }

}
