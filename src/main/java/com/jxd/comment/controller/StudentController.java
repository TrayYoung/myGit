package com.jxd.comment.controller;

import com.jxd.comment.model.ClassJxd;
import com.jxd.comment.model.EmpJxd;
import com.jxd.comment.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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

    /*@RequestMapping("/getClassMemberByCNo/{cNo}")
    @ResponseBody
    public List<Map<String,Object>> getClassMemberByCNo(@PathVariable("cNo")int cNo){
        return empService.getClassMemberByCNo(cNo);/editStudent/getStudentsToAddListForSelect
    }*/
    //修改班级信息
    @RequestMapping("/editStudent")
    @ResponseBody
    public String editStudent(@RequestBody Map<String,Object> map){

        EmpJxd empJxd=new EmpJxd();
        empJxd.setEmpno((int)map.get("empno"));
        empJxd.setClass_num((int)map.get("class_num"));
        empJxd.setDeptno(1);
        boolean flag=empService.updateById(empJxd);

        if (flag){
            return "学生更新成功";
        }else {
            return "更新失败";
        }
    }

    //得到待添加的学生列表
    @RequestMapping("/getStudentsToAddListForSelect")
    @ResponseBody
    public List<Map<String, Object>> getStudentsToAddListForSelect(){
        List<Map<String,Object>> list=empService.getStudentsToAddListForSelect();
        return list;
    }



    //修改班级信息
    @RequestMapping("/addStudentToOneClass")
    @ResponseBody
    public String addStudentToOneClass(@RequestBody Map<String,Object> map){

        EmpJxd empJxd=new EmpJxd();
        empJxd.setEmpno((int)map.get("empno"));
        empJxd.setClass_num((int)map.get("class_num"));
        empJxd.setDeptno(1);
        boolean flag=empService.updateById(empJxd);

        if (flag){
            return "新增成员成功";
        }else {
            return "更新失败";
        }
    }

    //修改班级信息
    @RequestMapping("/deleteStudentFromOneClass/{empno}")
    @ResponseBody
    public String deleteStudentFromOneClass(@PathVariable("empno") int empno){


        boolean flag=empService.deleteStudentFromOneClass(empno);

        if (flag){
            return "删除成员成功";
        }else {
            return "更新失败";
        }
    }
}
