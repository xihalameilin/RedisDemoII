package com.example.demo.service;

import com.example.demo.dao.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

@Service
public class RedisService {
    @Autowired
    private RedisTemplate redisTemplate;
    public boolean setUser(User user){
        ValueOperations ops=redisTemplate.opsForValue();
        ops.set(user.getNickname(),user);
        System.out.println(user.toString());
        return true;
    }
    public User getUser(String name){
        ValueOperations ops=redisTemplate.opsForValue();
        return (User) ops.get(name);
    }
}
