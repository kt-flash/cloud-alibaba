package com.flash.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.flash.common.entity.User;
import com.flash.mapper.UserMapper;

import com.flash.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Author: LiLiang
 * @Date: 2019/12/10 14:11
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {


}
