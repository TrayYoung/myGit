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

    /*获得老师下所有的班级*/
    @RequestMapping("/showStu/{empno}")
    @ResponseBody
    public List<Map<String,Object>> showClass(@PathVariable("empno") String empno){
        List<Map<String,Object>> list = classService.getClass(Integer.parseInt(empno));
        return list;
    }
    /*根据学号和姓名搜索学员*/
    @RequestMapping("/selectStu/{empno}/{empno_stu}/{ename}")
    @ResponseBody
    public List<Map<String,Object>> selectStu(@PathVariable("empno")String empno,@PathVariable("empno_stu")String empno_stu,
                                              @PathVariable("ename")String ename){
        List<Map<String,Object>> list = classService.selectStu(Integer.parseInt(empno),Integer.parseInt(empno_stu),ename);
        return list;
    }
    /*根据学员工号搜索*/
    @RequestMapping("/selectStuByEmpno/{empno}/{empno_stu}")
    @ResponseBody
    public List<Map<String,Object>> selectStuByEmpno(@PathVariable("empno")String empno,@PathVariable("empno_stu")String empno_stu){
        List<Map<String,Object>> list = classService.selectStuByEmpno(Integer.parseInt(empno),Integer.parseInt(empno_stu));
        return list;
    }
    /*根据学员姓名搜索*/
    @RequestMapping("/selectStuByEname/{empno}/{ename}")
    @ResponseBody
    public List<Map<String,Object>> selectStu(@PathVariable("empno")String empno,@PathVariable("ename")String ename){
        List<Map<String,Object>> list = classService.selectStuByEname(Integer.parseInt(empno),ename);
        return list;
    }



    /*课程列表，所有老师的课程都一样，所以不用加老师的条件*/
    @RequestMapping("/showCourse")
    @ResponseBody
    public List<Map<String,Object>> showCourse(){
        List<Map<String,Object>> list = classService.getCourse();
        return list;
    }

    /**
     * 通过empno和和课程编号获得成绩
     * @param empno
     * @param courseid
     * @return
     */
    @RequestMapping("/showScore/{empno}/{courseid}")
    @ResponseBody
    public List<Map<String,Object>> showScore(@PathVariable("empno") String empno,@PathVariable("courseid") String courseid){
        List<Map<String,Object>> list = classService.getScore(Integer.parseInt(empno),Integer.parseInt(courseid));
        return list;
    }

    @RequestMapping("/showStuInfo/{empno}")
    @ResponseBody
    public List<Map<String,Object>> showStuInfo(@PathVariable("empno")String empno){
        List<Map<String,Object>> list = classService.getEmpInfo(Integer.parseInt(empno));
        return list;
    }

    /*打分*/
    @RequestMapping("/setScore/{score}/{empno_stu}/{empno_tch}/{courseid}")
    public String setScore(@PathVariable("empno")String score,@PathVariable("empno_stu")String empno_stu,
                            @PathVariable("empno_tch")String empno_tch,@PathVariable("courseid")String courseid){

        boolean flag = classService.setScore(Double.parseDouble(score),Integer.parseInt(empno_stu),
                Integer.parseInt(empno_tch),Integer.parseInt(courseid));
        /*判断打分是否成功*/
        if (flag){
            return "success";
        }
        else {
            return "failed";
        }

    }



}
