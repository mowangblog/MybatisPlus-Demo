package top.mowang.mybatisplus;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.mowang.mybatisplus.pojo.User;

/**
 * MybatisPlus-Demo
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/17 19:28
 **/
@SpringBootTest
public class UserARTest {

    @Test
    public void UserInsert(){
        User user = new User("特朗普", "213213", "023480@qq.com", 10.3);
        boolean insert = user.insert();
        if (insert) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }

    @Test
    public void UserUpdate(){
        //null的值不做修改
        User user = new User("特朗普加强版", "5454545");
        user.setId(15);
        boolean update = user.updateById();
        if (update) {
            System.out.println("修改成功");
        } else {
            System.out.println("修改失败");
        }
    }
    @Test
    public void UserDelete(){
        User user = new User();
        boolean b = user.deleteById(18);
        System.out.println(b);
    }

    @Test
    public void UserSelectById(){
        User user = new User();
        user.setId(15);
        //如果没有查询到数据返回一个null不报错
        User res = user.selectById();
        System.out.println(res);
    }

    @Test
    public void UserSelectById2(){
        User user = new User();
        user.setId(1);
        //如果没有查询到数据返回一个null不报错
        User res = user.selectById();
        System.out.println(res);
    }
}
