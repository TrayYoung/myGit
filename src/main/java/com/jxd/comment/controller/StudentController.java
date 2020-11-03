package com.jxd.comment.controller;

import com.jxd.comment.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @ClassName StudentController
 * @Description TODO
 * @Author GengYang
 * @Date 2020/11/2
 * @Version 1.0
 */

@Controller
public class StudentController {
    @Autowired
    private IEmpService empService;

    @RequestMapping("/getClassMemberByCNo/{cNo}")
    @ResponseBody
    public List<Map<String,Object>> getClassMemberByCNo(@PathVariable("cNo")int cNo){
        return empService.getClassMemberByCNo(cNo);
    }

}
