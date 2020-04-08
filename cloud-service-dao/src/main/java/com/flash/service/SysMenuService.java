package com.flash.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.flash.common.entity.SysMenu;

import java.util.Set;

/**
 * @Author: LiLiang
 * @Date: 2019/12/10 14:09
 */
public interface SysMenuService extends IService<SysMenu> {

    /**
     * 根据用户ID查询权限
     *
     * @param userId 用户ID
     * @return 权限列表
     */
    public Set<String> selectPermsByUserId(Long userId);
}
