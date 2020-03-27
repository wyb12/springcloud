package com.wuyubin.controller;

import com.wuyubin.feign.UserFeignService;
import com.wuyubin.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private UserFeignService userFeignService;

    @RequestMapping("/list")
    public Object getList(@RequestParam("id")Integer id){
        Order order=new Order();
        order.setId(1);
        order.setUserId(1);
        order.setOrderNo("155455555");
        String username = userFeignService.getUserNameByid(id);
        order.setUsername(username);
        return order;
    }
}
