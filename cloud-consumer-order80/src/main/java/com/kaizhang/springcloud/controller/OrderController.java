package com.kaizhang.springcloud.controller;

import com.kaizhang.springcloud.entities.CommonResult;
import com.kaizhang.springcloud.entities.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author kaizhang
 * @date 2020-09-29 23:52
 */
@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {
    @Resource
    private RestTemplate restTemplate;

    //    public static final String PAYMENT_URL = "http://localhost:8001";
    /**
     * Ribbon和Eureka整合后Consumer可以直接调用服务而不用再关心地址和端口号,且该服务还有负载功能了。CLOUD-PAYMENT-SERVICE：服务name
     */
    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    @GetMapping("/consumer/userList")
    public CommonResult<User> userList() {
        return restTemplate.getForObject(PAYMENT_URL + "/user/list", CommonResult.class);
    }

    @PostMapping("/consumer/createUser")
    public CommonResult<User> createUser() {
        User user = new User();
        user.setStudentId("333");
        user.setUserName("李四");
        return restTemplate.postForObject(PAYMENT_URL + "/user/creteUser", user, CommonResult.class);
    }
}
