package com.wuyubin.feign;

import org.springframework.stereotype.Component;

@Component
public class ImUserFeignService implements UserFeignService{
    @Override
    public String getUserNameByid(Integer id) {
        return "用户查询失败";
    }
}
