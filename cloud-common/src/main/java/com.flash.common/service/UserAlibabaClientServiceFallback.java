package com.flash.common.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.flash.common.dto.req.ReqUserQueryDto;
import com.flash.common.entity.User;
import org.springframework.stereotype.Component;

/**
 * 设置服务异常时默认响应
 * @Author: LiLiang
 * @Date: 2020/1/8 11:01
 */
@Component
public class UserAlibabaClientServiceFallback implements UserAlibabaClientService {

            @Override
            public User add(User user) {
                return new User().setName("UserAlibabaClientServiceFallbackFactory add error");
            }

            @Override
            public Page pageList(ReqUserQueryDto reqUserDto) {
                return null;
            }

            @Override
            public User get(String id) {
                return new User().setName("UserAlibabaClientServiceFallbackFactory get error");
            }

            @Override
            public User update(User user) {
                return null;
            }

            @Override
            public boolean delete(String id) {
                return false;
            }

}
