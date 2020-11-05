package com.jxd.test;

import com.jxd.comment.cmtApplication;
import com.jxd.comment.mapper.IClassJxdMapper;
import com.jxd.comment.mapper.ISumCommentMapper;
import com.jxd.comment.model.ClassJxd;
import com.jxd.comment.service.IDeptService;
import com.jxd.comment.service.ISelectSumCmtService;
import com.jxd.comment.service.ISumCommentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

/**
 * @ClassName TestDao
 * @Description TODO
 * @Author GengYang
 * @Date 2020/10/28
 * @Version 1.0
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = cmtApplication.class)
public class TestDao {

    @Autowired
    private IClassJxdMapper classJxdMapper;
    @Test
    public void testTeacher(){
        List<Map<String,Object>> list = classJxdMapper.getEmpInfo(1000);
        for (Map<String,Object> map:list
             ) {
            for (String s:map.keySet()
                 ) {
                System.out.println(map.get(s));
            }
        }
    }

    @Autowired
    private IDeptService deptService;

    @Test
    public void test() {
        List<Map<String,Object>> list = deptService.selectAllDept();
        System.out.println("数据条数是：" + list.size());
    }


}
