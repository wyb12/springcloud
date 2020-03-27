package com.wuyubin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ServiceUser {
    public static void main(String[] args) {
        SpringApplication.run(ServiceUser.class,args);
    }
}
