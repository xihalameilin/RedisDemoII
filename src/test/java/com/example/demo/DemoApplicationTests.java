package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.ArrayList;
import java.util.List;



@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@Test
	void contextLoads() {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		stringRedisTemplate.opsForValue().set("abc","ceshi");
		stringRedisTemplate.opsForList().leftPushAll("qq",list);
		stringRedisTemplate.opsForList().range("qwe",0,-1).forEach(v ->{
			System.out.println(v);
				}
		);
	}


}
