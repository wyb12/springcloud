package com.wuyubin.controller;

import com.wuyubin.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/getUserNameByid")
    public String getUserNameByid(@RequestParam("id") Integer id){

        return "张三";
    }
}
