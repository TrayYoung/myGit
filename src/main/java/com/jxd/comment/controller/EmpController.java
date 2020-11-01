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

    /**
     * 显示经理个人信息
     * @param empno
     * @return
     */
    @RequestMapping("/showInfo/{empno}")
    @ResponseBody
    public List<Map<String, Object>> showInfo(@PathVariable("empno") int empno) {
        List<Map<String, Object>> list = empService.selectOwn(empno);
        return list;
    }

    /**
     * 根据姓名筛选部门员工
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
     * @param deptno
     * @return
     */
    @RequestMapping("/getEmpByDeptno/{deptno}")
    @ResponseBody
    public List<Map<String, Object>> getEmpByDeptno(@PathVariable("deptno") int deptno) {
        List<Map<String, Object>> list = empService.selectByDeptno(deptno);
        System.out.println("数据条数是" + list.size());
        return list;
    }

    /**
     * 查询一个学生的所有信息
     * @param empno 学生工号
     * @return
     */
    @RequestMapping(value = "/getMessage/{empno}")
    @ResponseBody
    public Map<String,Object> getStudent(@PathVariable("empno") int empno){
        Map<String,Object> message = empService.getMessage(empno);
        return message;
    }
}
