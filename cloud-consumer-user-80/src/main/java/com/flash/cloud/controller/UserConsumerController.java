package com.flash.cloud.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.flash.common.dto.BaseResult;
import com.flash.common.dto.PageResultDto;
import com.flash.common.dto.req.ReqUserGroupDto;
import com.flash.common.dto.req.ReqUserQueryDto;
import com.flash.common.validator.group.ValidationGroup1;
import com.flash.common.entity.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: LiLiang
 * @Date: 2020/1/2 16:23
 */
@RestController
@RequestMapping(value = "/user")
public class UserConsumerController {

    @Value(value = "${rest.url.prefix}")
    private String REST_URL_PREFIX;

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 添加用户-服务消费者
     * @param reqUserDto
     * @param result
     * @return
     */
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public BaseResult add(@RequestBody @Validated(value = {ValidationGroup1.class}) ReqUserGroupDto reqUserDto,
                           BindingResult result) {
        if(result != null && result.hasErrors()){
            for (ObjectError error : result.getAllErrors()) {
                return BaseResult.buildTipErrorResult(error.getDefaultMessage());
            }
        }
        User user = new User();
        BeanUtils.copyProperties(reqUserDto, user);

        User user2 = restTemplate.postForObject(REST_URL_PREFIX + "/user/add", user, User.class);
        return BaseResult.buildSuccessResult(user2);
    }

    @RequestMapping(value = "pageList", method = RequestMethod.POST)
    public BaseResult pageList(@RequestBody @Validated ReqUserQueryDto reqUserDto,
                               BindingResult result) {
        if(result != null && result.hasErrors()){
            for (ObjectError error : result.getAllErrors()) {
                return BaseResult.buildTipErrorResult(error.getDefaultMessage());
            }
        }
        Page page = restTemplate.postForObject(REST_URL_PREFIX + "/user/pageList", reqUserDto, Page.class);

        return BaseResult.buildSuccessResult(new PageResultDto(page.getTotal(),
                page.getPages(), page.getSize(), page.getRecords()));
    }

    @RequestMapping(value = "get/{id}", method = RequestMethod.GET)
    public BaseResult get(@PathVariable String id) {
        User user = restTemplate.getForObject(REST_URL_PREFIX + "/user/get/" + id, User.class);
        return BaseResult.buildSuccessResult(user);
    }

}
