package top.mowang.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import top.mowang.mybatisplus.mapper.UserMapper;
import top.mowang.mybatisplus.pojo.User;
import top.mowang.mybatisplus.service.UserService;

import javax.sql.DataSource;
import java.util.List;

@SpringBootTest
class MyBatisPlusHelloWorldApplicationTests {

    @Autowired
    UserService userService;
    @Autowired
    DataSource dataSource;

    @Disabled
    @DisplayName("测试数据源")
    @Test
    void contextLoads() {
        Integer count = userService.count();
        System.out.println("查询出"+count+"条数据");
        List<User> users = userService.list();
        users.forEach(System.out::println);
        System.out.println("dataSource.getClass() = " + dataSource.getClass());
    }

}
