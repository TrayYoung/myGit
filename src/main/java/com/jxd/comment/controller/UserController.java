package com.jxd.comment.controller;

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

    @RequestMapping("/login/{{uid}}/{{pwd}}")
    @ResponseBody
    public String login(@PathVariable("uid") String uid,@PathVariable("pwd") String pwd){
        UserLogin userLogin=new UserLogin();
        /*userLogin=userLoginService.*/
        return "1";
    }
}
