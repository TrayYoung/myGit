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

}
