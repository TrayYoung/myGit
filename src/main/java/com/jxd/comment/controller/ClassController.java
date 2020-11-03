package com.jxd.comment.controller;

import com.jxd.comment.model.ClassJxd;
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

    @RequestMapping("/getClassListForSelect")
    @ResponseBody
    public List<ClassJxd> getClassList(){
        return classService.list();
    }


    @RequestMapping("/getClassListByName/{currentPage}/{pagesize}/{cname}")
    @ResponseBody
    public List<Map<String,Object>> getClassListByName
            (@PathVariable("currentPage")int currentPage,@PathVariable("pagesize")int pagesize,
             @PathVariable("cname")String cname){
        int pageStart=pagesize*(currentPage-1);
        int pageSize=pagesize;
        String cname1=cname;
        List<Map<String,Object>> list=classService.getClassListByName(pageStart,pageSize,cname1);
        return list;
    }
}
