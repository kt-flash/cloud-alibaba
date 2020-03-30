package com.flash.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.flash.common.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @Author: LiLiang
 * @Date: 2019/12/5 13:41
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
    /**
     * <p>
     * 查询 : 根据state状态查询用户列表，分页显示
     * 注意!!: 如果入参是有多个,需要加注解指定参数名才能在xml中取值
     * </p>
     *
     * @param page 分页对象,xml中可以从里面进行取值,传递参数 Page 即自动分页,必须放在第一位(你可以继承Page实现自己的分页对象)
     * @return 分页对象
     */
    IPage<User> selectPageVo(Page page, @Param(Constants.WRAPPER) Wrapper<User> wrapper);
}
