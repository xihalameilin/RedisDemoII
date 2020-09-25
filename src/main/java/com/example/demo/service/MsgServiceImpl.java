package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class MsgServiceImpl implements MsgService {
    @Autowired
    private RedisTemplate redisTemplate;
    @Override
    public String setMsg(String key, String value) {
        redisTemplate.opsForValue().set(key,value);
        return "success";
    }

    @Override
    public String getMsg(String key) {
        return (String)redisTemplate.opsForValue().get(key);
    }
}
