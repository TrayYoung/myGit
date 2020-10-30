package com.jxd.comment.controller;

import com.jxd.comment.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 *
 */
@Controller
public class MenuController {

    @Autowired
    private IMenuService menuService;

    /**
     * 获取菜单
     *
     * @param role 角色id
     * @return list
     */
    @RequestMapping("/getMenu/{role}")
    @ResponseBody
    public List<Map<String, Object>> getAllDeptByLike(@PathVariable("role") String role) {
        List<Map<String, Object>> list=menuService.queryMenuInfo(role);
        return list;
    }


}
