package top.mowang.mybatisplus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import top.mowang.mybatisplus.pojo.User;
import top.mowang.mybatisplus.service.UserService;

import java.util.List;

/**
 * MybatisPlus-Demo
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/17 17:54
 **/
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user")
    public List<User> getUser(){
        List<User> list = userService.list();
        return list;
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Integer id){
        return userService.getById(id);
    }
}
