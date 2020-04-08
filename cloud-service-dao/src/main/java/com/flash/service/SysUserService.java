package com.flash.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.flash.common.entity.SysUser;

/**
 * @Author: LiLiang
 * @Date: 2019/12/10 14:09
 */
public interface SysUserService extends IService<SysUser> {
    /**
     * 通过用户名查询用户
     *
     * @param userName 用户名
     * @return 用户对象信息
     */
    public SysUser selectUserByLoginName(String userName);

    /**
     * 通过手机号码查询用户
     *
     * @param phoneNumber 手机号码
     * @return 用户对象信息
     */
    public SysUser selectUserByPhoneNumber(String phoneNumber);

    /**
     * 通过邮箱查询用户
     *
     * @param email 邮箱
     * @return 用户对象信息
     */
    public SysUser selectUserByEmail(String email);
}
