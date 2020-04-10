package com.flash.controller;

import com.flash.common.entity.SysUser;
import com.flash.utils.ShiroUtils;


/**
 * web层通用数据处理
 * 
 * @author liliang
 */
public class BaseController
{


    public SysUser getUser()
    {
        return ShiroUtils.getUser();
    }

    public void setUser(SysUser user)
    {
        ShiroUtils.setUser(user);
    }

    public Long getUserId()
    {
        return getUser().getUserId();
    }

    public String getLoginName()
    {
        return getUser().getLoginName();
    }
}
