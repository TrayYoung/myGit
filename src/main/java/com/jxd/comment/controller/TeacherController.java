package com.jxd.comment.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jxd.comment.mapper.IEmpMapper;
import com.jxd.comment.model.EmpJxd;
import com.jxd.comment.model.UserLogin;
import com.jxd.comment.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @ClassName TeacherController
 * @Description TODO
 * @Author GengYang
 * @Date 2020/11/3
 * @Version 1.0
 */

@Controller
public class TeacherController {

    @Autowired
    private IEmpService empService;


    @RequestMapping("/getTeacherListForSelect")
    @ResponseBody
    public List<EmpJxd> getTeacherListForSelect(){
        QueryWrapper<EmpJxd> wrapper = new QueryWrapper<>();
        String role="TEACHER";
        wrapper.eq("role",role);
        List<EmpJxd> list=empService.list(wrapper);
        String a=list.toString();
        return list;
    }

    //得到教师总表
    @RequestMapping("/getTeacherTableData")
    @ResponseBody
    public List<Map<String,Object>> getTeacherTableData(){
        List<Map<String,Object>> list=empService.selectTeacherList();
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
