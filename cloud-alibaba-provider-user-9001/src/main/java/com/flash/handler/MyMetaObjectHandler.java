package com.flash.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * 自动填充功能
 * @Author: LiLiang
 * @Date: 2019/12/10 15:41
 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {


    @Override
    public void insertFill(MetaObject metaObject) {
        if(metaObject.hasSetter("ctime"))
        this.setInsertFieldValByName("ctime", LocalDateTime.now(), metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        if(metaObject.hasSetter("gtime"))
        this.setUpdateFieldValByName("gtime", LocalDateTime.now(), metaObject);
    }
}
