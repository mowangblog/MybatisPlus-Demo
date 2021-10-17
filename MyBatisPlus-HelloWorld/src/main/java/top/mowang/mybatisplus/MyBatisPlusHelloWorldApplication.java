package top.mowang.mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

/**
 *  MapperScan知道mapper位置
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/17 17:43
 **/
@SpringBootApplication
@EnableOpenApi
@MapperScan("top.mowang.mybatisplus.mapper")
public class MyBatisPlusHelloWorldApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyBatisPlusHelloWorldApplication.class, args);
    }

}
