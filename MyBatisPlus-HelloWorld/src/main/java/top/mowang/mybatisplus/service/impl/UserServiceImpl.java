package top.mowang.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.mowang.mybatisplus.mapper.UserMapper;
import top.mowang.mybatisplus.pojo.User;
import top.mowang.mybatisplus.service.UserService;

/**
 * MybatisPlus-Demo
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/17 17:49
 **/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
