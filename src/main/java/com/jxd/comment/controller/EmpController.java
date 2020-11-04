package com.jxd.comment.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.jxd.comment.model.EmpJxd;
import com.jxd.comment.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
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

    /**
     * 显示经理所在部门
     *
     * @param empno
     * @return
     */
    @RequestMapping("/showDept/{empno}")
    @ResponseBody
    public String showInfo(@PathVariable("empno") int empno) {
        String deptno = empService.selectOwnDeptno(empno) + "";
        return deptno;
    }

    /**
     * 根据姓名筛选部门员工
     *
     * @param deptno
     * @param ename
     * @return
     */
    @RequestMapping("/getEmpByDeptnoAndName/{deptno}/{ename}")
    @ResponseBody
    public List<Map<String, Object>> getEmpByDeptnoAndName(@PathVariable("deptno") int deptno, @PathVariable("ename") String ename) {
        List<Map<String, Object>> list = empService.selectByDeptnoAndName(deptno, ename);
        System.out.println("数据条数是" + list.size());
        return list;
    }

    /**
     * 查找部门全部员工
     *
     * @param deptno
     * @return
     */
    @RequestMapping("/getEmpByDeptno/{deptno}")
    @ResponseBody
    public List<Map<String, Object>> getEmpByDeptno(@PathVariable("deptno") int deptno) {
        List<Map<String, Object>> list = empService.selectByDeptno(deptno);
        return list;
    }

    /**
     * 查询一个学生的所有信息
     *
     * @param empno 学生工号
     * @return
     */
    @RequestMapping(value = "/getMessage/{empno}")
    @ResponseBody
    public Map<String, Object> getStudent(@PathVariable("empno") int empno) {
        Map<String, Object> message = empService.getMessage(empno);
        return message;
    }

    /**
     * 根据班期查询班级成员
     *
     * @param class_num
     * @return
     */
    @RequestMapping(value = "/getStudentByCno/{class_num}")
    @ResponseBody
    public List<Map<String, Object>> getStudentByCno(@PathVariable("class_num") int class_num) {
        return empService.getStudentByCno(class_num);
    }

    /**
     * 根据班级获取该班的教师
     *
     * @param class_num
     * @return
     */
    @RequestMapping(value = "/getTeacherMessage/{class_num}")
    @ResponseBody
    public EmpJxd getTeacher(@PathVariable("class_num") int class_num) {
        return empService.getTeacher(class_num);
    }

    /**
     * 修改个人信息
     * @Param empMessage 员工个人信息
     */
    @RequestMapping("/editEmpMessage")
    @ResponseBody
    public String updateMessage(@RequestBody EmpJxd empJxd){
        boolean flag = empService.updateById(empJxd);
        if (flag){
            return "success";
        }else {
            return "error";
        }
    }

    //得到其他员工总表
    @RequestMapping("/getEmpJxdTableData")
    @ResponseBody
    public List<Map<String,Object>> getEmpJxdTableData(){
        List<Map<String,Object>> list=empService.selectEmpJxdList();
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
}
