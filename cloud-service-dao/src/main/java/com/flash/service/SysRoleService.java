package com.flash.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.flash.common.entity.SysRole;

import java.util.Set;

/**
 * @Author: LiLiang
 * @Date: 2019/12/10 14:09
 */
public interface SysRoleService extends IService<SysRole> {
    /**
     * 根据用户ID查询角色
     *
     * @param userId 用户ID
     * @return 权限列表
     */
    public Set<String> selectRoleKeys(Long userId);

}
