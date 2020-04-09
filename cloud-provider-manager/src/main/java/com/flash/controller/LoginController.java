package com.flash.controller;


import com.flash.common.dto.BaseResult;
import com.flash.common.dto.Message;
import com.flash.common.entity.SysUser;
import com.flash.common.utils.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 登录验证
 *
 * @author ruoyi
 */
@Controller
public class LoginController extends BaseController {

    @GetMapping("/login")
    @ResponseBody
    public Message login() {
        return Message.error("请重新登录");
    }

    @PostMapping("/login")
    @ResponseBody
    public BaseResult ajaxLogin(String username, String password, Boolean rememberMe) {
        UsernamePasswordToken token = new UsernamePasswordToken(username, password, rememberMe);
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(token);
            SysUser user = (SysUser) subject.getPrincipals().getPrimaryPrincipal();
            user.setToken(subject.getSession().getId().toString());
            return BaseResult.buildSuccessResult(user);
        } catch (AuthenticationException e) {
            String msg = "用户或密码错误";
            if (StringUtils.isNotEmpty(e.getMessage())) {
                msg = e.getMessage();
            }
            return BaseResult.buildTipErrorResult(msg);
        }
    }

    /*@GetMapping("/test")
    @ResponseBody
    public Message test() {
        return Message.success("test");
    }

    @GetMapping("/test/test")
    @ResponseBody
    public Message test2() {
        return Message.success("test2");
    }

    @GetMapping("/system")
    @ResponseBody
    public Message test3() {
        return Message.success("test3");
    }

    @GetMapping("/system/test")
    @ResponseBody
    public Message test4() {
        return Message.success("test4");
    }*/

    @GetMapping("/unauth")
    @ResponseBody
    public Message unauth() {
        return Message.error("请求未授权");
    }
}
