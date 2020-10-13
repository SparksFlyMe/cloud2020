package com.kaizhang.springcloud.controller;


import com.kaizhang.springcloud.entities.CommonResult;
import com.kaizhang.springcloud.entities.User;
import com.kaizhang.springcloud.service.IUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author kaizhang
 * @since 2020-09-28
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService iUserService;

    @GetMapping("/list")
    public CommonResult list() {
        List<User> list = iUserService.list();

        System.out.println("23333");
        return new CommonResult(200, "成功");
    }

    @PostMapping("/creteUser")
    public CommonResult createUser(@RequestBody User user) {
        boolean save = iUserService.save(user);
        if (save) {
            return new CommonResult(200, "插入用户成功");
        } else {
            return new CommonResult(400, "插入用户失败");
        }
    }
}
