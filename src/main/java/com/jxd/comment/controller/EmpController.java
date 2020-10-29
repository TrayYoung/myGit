package com.jxd.comment.controller;

import com.jxd.comment.model.EmpJxd;
import com.jxd.comment.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @ClassName EmpController
 * @Description TODO
 * @Author GengYang
 * @Date 2020/10/28
 * @Version 1.0
 */

@Controller
public class EmpController {
    @Autowired
    private IEmpService empService;

    @RequestMapping("/showInfo/{empno}")
    @ResponseBody
    public List<Map<String,Object>> showInfo(@PathVariable("empno") String empno) {
        List<Map<String,Object>> list = empService.selectOwn(Integer.parseInt(empno));
        System.out.println("数据条数是" + list.size());
        return list;
    }
}
