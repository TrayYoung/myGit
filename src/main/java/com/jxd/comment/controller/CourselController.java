package com.jxd.comment.controller;

import com.jxd.comment.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @ClassName UtilController
 * @Description TODO
 * @Author GengYang
 * @Date 2020/10/31
 * @Version 1.0
 */

@Controller
public class CourselController {

    @Autowired
    private ICourseService courseService;

    @RequestMapping("/getCourseScoreByEmpno/{empno}")
    @ResponseBody
    public List<Map<String,Object>> getCourseScoreByEmpno(@PathVariable("empno") int empno){
        List<Map<String,Object>> list=courseService.getCourseScoreByEmpno(empno);
        return list;
    }
}
