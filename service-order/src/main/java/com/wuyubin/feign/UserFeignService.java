package com.wuyubin.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "service-user",fallback = ImUserFeignService.class)
public interface UserFeignService {
    @RequestMapping("/user/getUserNameByid")
    public String getUserNameByid(@RequestParam("id") Integer id);
}
