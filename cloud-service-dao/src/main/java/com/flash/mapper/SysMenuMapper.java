package com.flash.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.flash.common.entity.SysMenu;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: LiLiang
 * @Date: 2019/12/5 13:41
 */
@Repository
public interface SysMenuMapper extends BaseMapper<SysMenu> {
    /**
     * 根据用户ID查询权限
     *
     * @param userId 用户ID
     * @return 权限列表
     */
    public List<String> selectPermsByUserId(Long userId);
}
