package com.jxd.comment.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jxd.comment.model.UserLogin;
import com.jxd.comment.service.IUserLoginService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName userController
 * @Description TODO
 * @Author GengYang
 * @Date 2020/10/28
 * @Version 1.0
 */

@Controller
public class UserController {

    @Autowired
    private IUserLoginService userLoginService;

    @RequestMapping("/login/{uid}/{password}")
    @ResponseBody
    public String login(@PathVariable("uid")String uid,@PathVariable("password")String pwd){

        QueryWrapper<UserLogin> wrapper = new QueryWrapper<>();
        wrapper.eq("userid",uid).eq("password",pwd);
        UserLogin userLogin = userLoginService.getOne(wrapper);
        //UserLogin userLogin=new UserLogin();
        //userLogin=userLoginService.getById(uid);
        //System.out.println(userLogin.getPassword());
        if (userLogin != null){
            if (userLogin.getRole() == 0){
                return "admin";
            }else if (userLogin.getRole() == 1){
                return "student";
            }else if (userLogin.getRole() == 2){
                return "teacher";
            }else if (userLogin.getRole() == 3){
                return "clerk";
            }else {
                return "manager";
            }
        }else {
            return "error";
        }
        /*QueryWrapper<UserLogin> wrapper = new QueryWrapper<>();
        wrapper.eq("uid",uid).eq("password",pwd);
        UserLogin userLogin = userLoginService.getOne(wrapper);
        if (userLogin != null){
            if (userLogin.getRole() == 0){
                return "admin";
            }else if (userLogin.getRole() == 1){
                return "student";
            }else if (userLogin.getRole() == 2){
                return "teacher";
            }else if (userLogin.getRole() == 3){
                return "manager";
            }else {
                return "clerk";
            }
        }else {
            return "error";
        }*/
    }
}
