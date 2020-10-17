package com.kaizhang.springcloud.controller;


import com.kaizhang.springcloud.entities.CommonResult;
import com.kaizhang.springcloud.entities.User;
import com.kaizhang.springcloud.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author kaizhang
 * @since 2020-09-28
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService iUserService;

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private DiscoveryClient discoveryClient;

    @GetMapping("/list")
    public CommonResult list() {
        List<User> list = iUserService.list();
        log.info("======== list ========");
        return new CommonResult(200, "成功, serverPot:" + serverPort);
    }

    @PostMapping("/creteUser")
    public CommonResult createUser(@RequestBody User user) {
        log.info("======== creteUser ========");
        boolean save = iUserService.save(user);
        if (save) {
            return new CommonResult(200, "插入用户成功");
        } else {
            return new CommonResult(400, "插入用户失败");
        }
    }

    @GetMapping("/listService")
    public void listService() {
        log.info("======== listService ========");
        List<String> services = discoveryClient.getServices();
        services.forEach(log::info);

        List<ServiceInstance> instances = discoveryClient.getInstances("cloud-payment-service");
        instances.forEach(item -> log.info(item.getHost() + "|" + item.getPort() + "|" + item.getUri()));
    }
}
