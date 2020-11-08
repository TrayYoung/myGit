package com.jxd.comment.controller;

import com.jxd.comment.model.ClassJxd;
import com.jxd.comment.model.EmpJxd;
import com.jxd.comment.model.SelectCourseJxd;
import com.jxd.comment.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
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


    //得到学生总表
    @RequestMapping("/getStudentTableData")
    @ResponseBody
    public List<Map<String,Object>> getStudentTableData(){
        List<Map<String,Object>> list=empService.selectStudentList();
        for (Map<String,Object> map : list){
            int empno=(int)map.get("empno");
            List<Map<String,Object>> scoreList=empService.getOnesScoreByEmpno(empno);
            for (Map<String,Object> scoreMap : scoreList){
                map.put(scoreMap.get("courseName").toString(),scoreMap.get("score"));
            }
            List<Map<String,Object>> sumCmtList=empService.getOnesSumCommentByEmpno(empno);
            for (Map<String,Object> sumCmtMap : sumCmtList){
                map.put(sumCmtMap.get("content_type").toString(),sumCmtMap.get("content_score"));
            }
        }
        return list;
    }


    @RequestMapping("/getStudentListByClassNumAndEname")
    @ResponseBody
    public List<Map<String,Object>> getStudentListByClassNumAndEname(@RequestBody Map<String,Object> map){
        int pageSize=(int)map.get("pagesize");
        int pageStart=((int)map.get("currentPage")-1)*pageSize;
        String querySname=map.get("querySname").toString();
        String cNo=map.get("classNumForSelect").toString();
        int class_num=-1;

        if ("".equals(querySname) &&"".equals(cNo)){
            querySname=null;
            class_num=-1;
        }else if ("".equals(querySname)&&!"".equals(cNo)){
            querySname=null;
            class_num=Integer.parseInt(cNo);
        }else if (!"".equals(querySname)&&"".equals(cNo)){
            class_num=-1;
        }else {
            class_num=Integer.parseInt(cNo);
        }

        Map<String,Object> formMap=new HashMap<>();
        formMap.put("pageSize",pageSize);
        formMap.put("pageStart",pageStart);
        formMap.put("querySname",querySname);
        formMap.put("class_num",class_num);

        List<Map<String,Object>> studentListByTwoProp=
                empService.selectStudentListByClassNumAndEname(formMap);
        return studentListByTwoProp;
    }
}
