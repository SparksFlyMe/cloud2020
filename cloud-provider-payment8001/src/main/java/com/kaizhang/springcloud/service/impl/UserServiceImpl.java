package com.kaizhang.springcloud.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kaizhang.springcloud.entities.User;
import com.kaizhang.springcloud.mapper.UserMapper;
import com.kaizhang.springcloud.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author kaizhang
 * @since 2020-09-28
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
