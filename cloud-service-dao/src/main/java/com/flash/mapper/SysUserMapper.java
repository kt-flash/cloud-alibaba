package com.flash.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.flash.common.entity.SysUser;
import org.springframework.stereotype.Repository;

/**
 * @Author: LiLiang
 * @Date: 2019/12/5 13:41
 */
@Repository
public interface SysUserMapper extends BaseMapper<SysUser> {
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
