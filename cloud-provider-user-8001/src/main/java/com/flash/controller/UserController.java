package com.flash.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.flash.common.dto.req.ReqUserQueryDto;
import com.flash.common.entity.User;

import com.flash.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: LiLiang
 * @Date: 2019/11/19 15:58
 */
@RestController
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 添加用户-服务提供者
     * @param user
     * @return
     */
    @HystrixCommand
    @PostMapping(value = "add")
    public User add(@RequestBody User user){
        userService.save(user);
        return user;
    }

    @HystrixCommand
    @PostMapping(value = "update")
    public User update(@RequestBody User user){
        userService.updateById(user);
        return user;
    }

    @HystrixCommand
    @GetMapping(value = "delete/{id}")
    public boolean delete(@PathVariable("id") String id){
        return userService.removeById(id);
    }

    @HystrixCommand
    @PostMapping(value = "pageList")
    public Page pageList(@RequestBody @Validated ReqUserQueryDto reqUserDto) {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.gt("age",reqUserDto.getAge());
        wrapper.orderBy(true, reqUserDto.isAsc(), reqUserDto.getOrder());

        Page page = userService.page(reqUserDto.getPage(), wrapper);

        return page;
    }

    @HystrixCommand
    @GetMapping(value = "get/{id}")
    public User get(@PathVariable String id) {
        User user = userService.getById(id);
        return user;
    }
}
