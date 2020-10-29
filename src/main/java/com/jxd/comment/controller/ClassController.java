package com.jxd.comment.controller;

import com.jxd.comment.service.IClassService;
import com.jxd.comment.service.impl.ClassServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @ClassName ClassController
 * @Description TODO
 * @Author GengYang
 * @Date 2020/10/28
 * @Version 1.0
 */

@Controller
public class ClassController {
    @Autowired
    private ClassServiceImpl classService;

    @RequestMapping("/showClass/{empno}")
    @ResponseBody
    public List<Map<String,Object>> showClass(@PathVariable("empno") String empno){
        List<Map<String,Object>> list = classService.getClass(Integer.parseInt(empno));

        return list;

    }
}
