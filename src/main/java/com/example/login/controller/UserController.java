package com.example.login.controller;

import com.example.login.bean.Result;
import com.example.login.bean.User;
import com.example.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    /**     * 注册     * @param user 参数封装     * @return Result     */
    @PostMapping(value = "/regist")
    public Result regist(User user){
        return userService.regist(user);
    }    /**     * 登录     * @param user 参数封装     * @return Result     */
    @PostMapping(value = "/login")
    public Result login(User user){
        return userService.login(user);
    }
}

