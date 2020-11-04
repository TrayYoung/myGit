package com.jxd.comment.controller;

import com.jxd.comment.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @ClassName DeptController
 * @Description TODO
 * @Author lxz
 * @Date 2020/11/4 0004
 * @Version 1.0
 */
@Controller
public class DeptController {

    @Autowired
    private IDeptService deptService;


    @RequestMapping("/getAllDept")
    @ResponseBody
    public List<Map<String, Object>> getAllDept() {
        List<Map<String, Object>> list = deptService.selectAllDept();
        return list;
    }

    @RequestMapping("/getAllDeptByName/{dname}")
    @ResponseBody
    public List<Map<String, Object>> getAllDeptByName(@PathVariable("dname") String dname) {
        List<Map<String, Object>> list = deptService.selectAllDeptByName(dname);
        return list;
    }

    @RequestMapping("/addDept/{dname}")
    @ResponseBody
    public String addDept(@PathVariable("dname") String dname) {
        boolean flag = deptService.addDept(dname);
        if (flag){
            return "新增成功";
        }else {
            return "新增失败";
        }

    }
}
