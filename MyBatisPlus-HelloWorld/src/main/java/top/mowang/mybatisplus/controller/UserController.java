package top.mowang.mybatisplus.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.mowang.mybatisplus.pojo.User;
import top.mowang.mybatisplus.service.UserService;

import java.util.List;
import java.util.Map;

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

    @PostMapping("/user")
    public String saveUser(User user){
        boolean save = userService.save(user);
        return save?"添加成功":"添加失败";
    }

    @PutMapping("/user")
    public String updateUser(User user){
        boolean update = userService.updateById(user);
        return update?"修改成功":"修改失败";
    }

    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable Integer id){
        boolean remove = userService.removeById(id);
        return remove?"删除成功":"删除失败";
    }

    @GetMapping("/userPage/{page}")
    public Page<User> userPage(@PathVariable("page") Integer currentPage){
        Page<User> page = new Page<>(currentPage,5);
        Page<User> userPage = userService.page(page,null);
        return userPage;
    }

}
