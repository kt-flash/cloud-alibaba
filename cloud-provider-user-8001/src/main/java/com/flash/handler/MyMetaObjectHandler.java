package com.flash.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 自动填充功能
 * @Author: LiLiang
 * @Date: 2019/12/10 15:41
 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {


    @Override
    public void insertFill(MetaObject metaObject) {
        if(metaObject.hasSetter("createTime"))
        this.setInsertFieldValByName("createTime", new Date(), metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        if(metaObject.hasSetter("updateTime"))
        this.setUpdateFieldValByName("updateTime", new Date(), metaObject);
    }
}
