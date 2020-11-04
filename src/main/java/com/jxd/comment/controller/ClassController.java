package com.jxd.comment.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jxd.comment.model.ClassJxd;
import com.jxd.comment.service.IClassService;
import com.jxd.comment.service.impl.ClassServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
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

    //修改班级的主管老师
    @RequestMapping("/changeTeacherInOneClass/{class_num}/{empno}")
    @ResponseBody
    public String changeTeacherInOneClass
            (@PathVariable("class_num") int class_num,@PathVariable("empno") int empno){

        boolean flag=classService.changeTeacherInOneClass(class_num,empno);
        if (flag){
            return "老师修改成功";
        }else {
            return "修改失败";
        }
    }

    //修改班级的主管老师
    @RequestMapping("/addClass/{cname}/{empno}")
    @ResponseBody
    public String addClass
    (@PathVariable("cname") String cname,@PathVariable("empno") int empno){


        boolean flag=classService.addClass(cname,empno);
        if (flag){
            return "班级新增成功";
        }else {
            return "新增失败";
        }
    }

    //修改班级信息
    @RequestMapping("/editClass")
    @ResponseBody
    public String editClass(@RequestBody Map<String,Object> map){
        ClassJxd classJxd=new ClassJxd();

        classJxd.setcNo((int)(map.get("class_num")));
        classJxd.setEmpno((int)map.get("teacherId"));
        classJxd.setCname(map.get("cname").toString());

       /* QueryWrapper<ClassJxd> wrapper=new QueryWrapper<>();
        wrapper.eq("cname",map.get("cname").toString())
                .eq("empno",map.get("teacherId"));*/
        boolean flag=classService.updateById(classJxd);

        if (flag){
            return "班级更新成功";
        }else {
            return "更新失败";
        }
    }
}
