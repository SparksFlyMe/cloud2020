package com.kaizhang.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义ribbon轮询机制，所在位置不能与ComponentScan注解在相同的package下
 * 因为ComponentScan在@SpringBootApplication注解中，所以不能与启动类在相同package下，这里新建com.kaizhang.myrule包
 *
 * @author kaizhang
 * @date 2020-10-17 10:56
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule() {
        // 定义为随机
        return new RandomRule();
    }
}
