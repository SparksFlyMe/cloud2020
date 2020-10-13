package com.kaizhang.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author kaizhang
 * @date 2020-10-13 22:29
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.kaizhang.springcloud.mapper")
public class PaymentMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8002.class, args);
    }
}
