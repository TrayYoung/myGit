package com.jxd.comment.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jxd.comment.mapper.ICourseJxdMapper;
import com.jxd.comment.model.CourseJxd;
import com.jxd.comment.service.ICourseService;
import org.springframework.stereotype.Service;

/**
 * @ClassName CourseServiceImpl
 * @Description TODO
 * @Author lxz
 * @Date 2020/10/28 0028
 * @Version 1.0
 */
@Service
public class CourseServiceImpl extends ServiceImpl<ICourseJxdMapper, CourseJxd> implements ICourseService {
}
