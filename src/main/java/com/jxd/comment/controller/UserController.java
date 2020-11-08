package com.jxd.comment.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jxd.comment.model.CommentJxd;
import com.jxd.comment.model.CourseJxd;
import com.jxd.comment.model.UserLogin;
import com.jxd.comment.service.ICommentJxdService;
import com.jxd.comment.service.ICourseService;
import com.jxd.comment.service.IUserLoginService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

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

    @Autowired
    private ICourseService courseService;

    @Autowired
    private ICommentJxdService commentJxdService;

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

    /**
     * 获取角色列表
     * @return
     */
    @RequestMapping("/getRoleList")
    @ResponseBody
    public List<UserLogin> getRole(){
        return userLoginService.list();
    }

    /**
     * 获取课程列表
     * @param currentPage
     * @param pagesize
     * @param courseName
     * @return
     */
    @RequestMapping("/getCourseByName/{currentPage}/{pagesize}/{courseName}")
    @ResponseBody
    public List<CourseJxd> getStudentByName(@PathVariable("currentPage")int currentPage,
                                                     @PathVariable("pagesize")int pagesize,
                                                     @PathVariable("courseName")String courseName){
        int pageStart= pagesize * (currentPage-1);
        int pageSize = pagesize;
        List<CourseJxd> list = courseService.getCourseByName(pageStart,
                pageSize,courseName);
        return list;
    }

    /**
     * 获取评价项分页列表
     * @param currentPage
     * @param pagesize
     * @param commentName
     * @return
     */
    @RequestMapping("/getCommentByName/{currentPage}/{pagesize}/{commentName}")
    @ResponseBody
    public List<CommentJxd> getCommentByName(@PathVariable("currentPage")int currentPage,
                                             @PathVariable("pagesize")int pagesize,
                                             @PathVariable("commentName")String commentName){
        int pageStart= pagesize * (currentPage-1);
        int pageSize = pagesize;
        List<CommentJxd> list = commentJxdService.getCommentByName(pageStart,
                pageSize,commentName);
        return list;
    }

    /**
     * 获取评价列表
     * @return
     */
    @RequestMapping("/getCommentList")
    @ResponseBody
    public List<CommentJxd> getComment(){
        return commentJxdService.list();
    }

    /**
     * 添加课程
     * @param courseName
     * @return
     */
    @RequestMapping("/addCourse/{courseName}")
    @ResponseBody
    public String addCourse(@PathVariable("courseName") String courseName){
        CourseJxd courseJxd = new CourseJxd();
        courseJxd.setCourseName(courseName);
        boolean flag = courseService.save(courseJxd);
        if (flag){
            return "success";
        }else {
            return "error";
        }
    }

    /**
     * 添加评价
     * @param commentName
     * @return
     */
    @RequestMapping("/addComment/{commentName}")
    @ResponseBody
    public String addComment(@PathVariable("commentName") String commentName){
        CommentJxd commentJxd = new CommentJxd();
        commentJxd.setCommentName(commentName);
        boolean flag = commentJxdService.save(commentJxd);
        if (flag){
            return "success";
        }else {
            return "error";
        }
    }

    /**
     * 删除课程
     * @param courseId
     * @return
     */
    @RequestMapping("/delCourse/{courseId}")
    @ResponseBody
    public String delCourse(@PathVariable("courseId") String courseId){
        boolean flag = courseService.removeById(courseId);
        if (flag) {
            return "success";
        }else {
            return "error";
        }
    }

    /**
     * 删除评价项
     * @param commentId
     * @return
     */
    @RequestMapping("/delComment/{commentId}")
    @ResponseBody
    public String delComment(@PathVariable("commentId") String commentId){
        boolean flag = commentJxdService.removeById(commentId);
        if (flag) {
            return "success";
        }else {
            return "error";
        }
    }

    /**
     * 修改评价项
     * @param commentId
     * @param commentName
     * @return
     */
    @RequestMapping("/editComment/{commentId}/{commentName}")
    @ResponseBody
    public String editComment(@PathVariable("commentId") String commentId,
                              @PathVariable("commentName") String commentName){
        CommentJxd commentJxd = new CommentJxd();
        commentJxd.setCommentId(Integer.parseInt(commentId));
        commentJxd.setCommentName(commentName);
        boolean flag = commentJxdService.updateById(commentJxd);
        if (flag) {
            return "success";
        }else {
            return "error";
        }
    }

    /**
     * 修改课程
     * @param courseId
     * @param courseName
     * @return
     */
    @RequestMapping("/editCourse/{courseId}/{courseName}")
    @ResponseBody
    public String editCourse(@PathVariable("courseId") String courseId,
                              @PathVariable("courseName") String courseName){
        CourseJxd courseJxd = new CourseJxd();
        courseJxd.setCourseId(Integer.parseInt(courseId));
        courseJxd.setCourseName(courseName);
        boolean flag = courseService.updateById(courseJxd);
        if (flag) {
            return "success";
        }else {
            return "error";
        }
    }
}
