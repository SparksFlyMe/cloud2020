package com.kaizhang.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author kaizhang
 * @date 2020-09-29 23:46
 */
@Configuration
public class ApplicationContextConfig {
    /**
     * 使用 LoadBalanced 注解赋予RestTemplate负载均衡的能力
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
