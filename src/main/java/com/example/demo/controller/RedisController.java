package com.example.demo.controller;

import com.example.demo.dao.User;
import com.example.demo.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@RestController
public class RedisController {
    @Autowired
    private RedisService redisService;
    @RequestMapping("/getUser")
    public User getUser(){
        String name="quellan";
        return redisService.getUser(name);
    }
    @RequestMapping("/setUser")
    public String setUser(){
        User user=new User("aa@qq.com","quellan","123456","朱",new Date().getTime()+"");
        redisService.setUser(user);
        return "添加成功";
    }
}
