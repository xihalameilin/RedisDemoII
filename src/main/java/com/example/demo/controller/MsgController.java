package com.example.demo.controller;


import com.example.demo.service.MsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/msg")
public class MsgController {
    @Autowired
    private MsgService msgService;

    @GetMapping("set")
    public String setMsg(@RequestParam(value = "key") String key,
                         @RequestParam(value = "val") String val){
        return msgService.setMsg(key,val);
    }

    @GetMapping("/get")
    public String getMsg(@RequestParam(value = "key") String key){
        return msgService.getMsg(key);
    }

}
