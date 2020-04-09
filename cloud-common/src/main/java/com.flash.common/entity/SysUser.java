package com.flash.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;

import java.util.Arrays;
import java.util.Date;

/**
 * @Author: LiLiang
 * @Date: 2020/4/8 8:52
 */
@Data
public class SysUser extends BaseEntity {
    /**
     * 用户ID
     */
    @TableId(type = IdType.AUTO)
    private Long userId;
    /**
     * 部门ID
     */
    private Long deptId;
    /**
     * 部门父ID
     */
    private Long parentId;
    /**
     * 登录名
     */
    private String loginName;
    /**
     * 用户名称
     */
    private String userName;
    /**
     * 用户邮箱
     */
    private String email;
    /**
     * 手机号码
     */
    private String phonenumber;
    /**
     * 用户性别
     */
    private String sex;
    /**
     * 用户头像
     */
    private String avatar;
    /**
     * 密码
     */
    private String password;
    /**
     * 盐加密
     */
    private String salt;
    /**
     * 帐号状态:0正常,1禁用,2删除
     */
    private int status;
    /**
     * 最后登陆IP
     */
    private String loginIp;
    /**
     * 最后登陆时间
     */
    private Date loginDate;
    /**
     * 部门对象
     */
    @TableField(exist = false)
    private SysDept dept;
    /**
     * 角色组
     */
    @TableField(exist = false)
    private Long[] roleIds;
    /**
     * 岗位组
     */
    @TableField(exist = false)
    private Long[] postIds;

    /**
     * shiro token
     */
    @TableField(exist = false)
    private String token;

    public boolean isAdmin() {
        return isAdmin(this.userId);
    }

    public static boolean isAdmin(Long userId) {
        return userId != null && 1L == userId;
    }

    /**
     * 生成随机盐
     */
    public void randomSalt() {
        // 一个Byte占两个字节，此处生成的3字节，字符串长度为6
        SecureRandomNumberGenerator secureRandom = new SecureRandomNumberGenerator();
        String hex = secureRandom.nextBytes(3).toHex();
        setSalt(hex);
    }

    @Override
    public String toString() {
        return "User [userId=" + userId + ", deptId=" + deptId + ", parentId=" + parentId + ", loginName=" + loginName
                + ", userName=" + userName + ", email=" + email + ", phonenumber=" + phonenumber + ", sex=" + sex
                + ", avatar=" + avatar + ", password=" + password + ", salt=" + salt + ", status=" + status
                + ", loginIp=" + loginIp + ", loginDate=" + loginDate + ", dept=" + dept + ", roleIds="
                + Arrays.toString(roleIds) + ", postIds=" + Arrays.toString(postIds) + "]";
    }

}
