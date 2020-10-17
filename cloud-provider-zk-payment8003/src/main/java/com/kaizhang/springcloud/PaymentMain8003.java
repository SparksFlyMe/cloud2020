package com.kaizhang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author kaizhang
 * @date 2020-10-15 23:06
 * 启动项目后，通过zookeeper客户端查看是否有相关注册的节点：cloud-payment-service
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8003 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8003.class, args);
    }
}
