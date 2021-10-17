package top.mowang.mybatisplus.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import top.mowang.mybatisplus.pojo.Emp;
import top.mowang.mybatisplus.service.IEmpService;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Xuan li
 * @since 2021-10-18
 */
@RestController
public class EmpController {

    @Autowired
    IEmpService empService;

    @GetMapping("/emp")
    public List<Emp> emps(){
        List<Emp> list = empService.list();
        return list;
    }
}

