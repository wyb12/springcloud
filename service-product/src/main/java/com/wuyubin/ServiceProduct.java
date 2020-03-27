package com.wuyubin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ServiceProduct {
    public static void main(String[] args) {
        SpringApplication.run(ServiceProduct.class,args);
    }
}
