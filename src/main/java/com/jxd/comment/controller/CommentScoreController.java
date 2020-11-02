package com.jxd.comment.controller;

import com.jxd.comment.service.ICommentScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @ClassName CommentScoreController
 * @Description TODO
 * @Author GengYang
 * @Date 2020/11/1
 * @Version 1.0
 */

@Controller
public class CommentScoreController {

    @Autowired
    private ICommentScoreService commentScoreService;

    @RequestMapping("/getCommentScoreByEmpnoAndYear/{empno}/{year}")
    @ResponseBody
    public List<Map<String,Object>> getCommentScoreByEmpnoAndYear
            (@PathVariable("empno") int empno,@PathVariable("year") int year){
        List<Map<String,Object>> list=
                commentScoreService.getCommentScoreByEmpnoAndYear(empno,year);
        return list;
    }
 }
