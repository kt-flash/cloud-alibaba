package com.flash.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.flash.common.entity.SysRole;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: LiLiang
 * @Date: 2019/12/5 13:41
 */
@Repository
public interface SysRoleMapper extends BaseMapper<SysRole> {


    /**
     * 根据用户ID查询角色
     *
     * @param userId 用户ID
     * @return 角色列表
     */
    public List<SysRole> selectRolesByUserId(Long userId);
}
