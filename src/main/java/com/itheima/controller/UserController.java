package com.itheima.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description TODO
 * @Author ZHOUYAN
 * @Date 2021/5/12 3:27 下午
 */
public class UserController {
    @RequestMapping("user")
    public String sayHello(){
        return "Hi,zy";
    }
}
