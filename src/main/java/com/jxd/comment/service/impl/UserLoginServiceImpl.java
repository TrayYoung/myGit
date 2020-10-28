package com.jxd.comment.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jxd.comment.mapper.IUserLoginMapper;
import com.jxd.comment.model.UserLogin;
import com.jxd.comment.service.IUserLoginService;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserLoginServiceImpl
 * @Description TODO
 * @Author lxz
 * @Date 2020/10/28 0028
 * @Version 1.0
 */
@Service
public class UserLoginServiceImpl extends ServiceImpl<IUserLoginMapper, UserLogin> implements IUserLoginService {
}
