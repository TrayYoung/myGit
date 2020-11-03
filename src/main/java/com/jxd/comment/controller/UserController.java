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

    /**
     * 接收账号和密码，并返回对象，没有则返回空字符串
     * @param uid 用户前台输入的账号
     * @param pwd 前台输入的密码
     * @return
     */
    @RequestMapping("/login/{uid}/{password}")
    @ResponseBody
    public UserLogin login(@PathVariable("uid")String uid,
                           @PathVariable("password")String pwd){
        //mybatis-plus自带的封装对象操作类
        if ("admin".equals(uid)){
            uid = "0";
        }
        int uid_int = Integer.parseInt(uid);
        QueryWrapper<UserLogin> wrapper = new QueryWrapper<>();
        wrapper.eq("userid",uid_int).eq("password",pwd);
        UserLogin userLogin = userLoginService.getOne(wrapper);
        return userLogin;
    }

    /**
     * 修改密码，返回修改成功与否
     * @param n_pwd 新的密码
     * @return
     */
    @RequestMapping(value = "resetPassword/{o_pwd}/{n_pwd}/{uid}")
    @ResponseBody
    public String resetPwd(@PathVariable("o_pwd") String o_pwd,
                           @PathVariable("n_pwd") String n_pwd,
                           @PathVariable("uid") String uid){
        if ("admin".equals(uid)){
            uid = "0";
        }
        int uid_int = Integer.parseInt(uid);
        QueryWrapper<UserLogin> wrapper = new QueryWrapper<>();
        wrapper.eq("userid",uid_int).eq("password",o_pwd);
        UserLogin userLogin = userLoginService.getOne(wrapper);
        if (userLogin != null){
            userLogin.setUserId(uid_int);
            userLogin.setPassword(n_pwd);
            boolean flag = userLoginService.updateById(userLogin);
            if (flag){
                return "success";
            }else {
                return "error";
            }
        }else {
            return "different";
        }
    }
}
