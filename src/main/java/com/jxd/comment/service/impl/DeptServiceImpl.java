package com.jxd.comment.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jxd.comment.mapper.IDeptJxdMapper;
import com.jxd.comment.model.DeptJxd;
import com.jxd.comment.service.IDeptService;
import org.springframework.stereotype.Service;

/**
 * @ClassName DeptServiceImpl
 * @Description TODO
 * @Author lxz
 * @Date 2020/10/28 0028
 * @Version 1.0
 */
@Service
public class DeptServiceImpl extends ServiceImpl<IDeptJxdMapper, DeptJxd> implements IDeptService {
}
