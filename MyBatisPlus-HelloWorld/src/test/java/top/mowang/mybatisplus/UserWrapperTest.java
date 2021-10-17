package top.mowang.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.mowang.mybatisplus.pojo.User;
import top.mowang.mybatisplus.service.UserService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * MybatisPlus-Demo
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/17 22:47
 **/
@SpringBootTest
public class UserWrapperTest {
    @Autowired
    UserService userService;

    /**
     * @description: AllEq map key是列，value是值 map符合全部条件的
     * @author: Xuan Li
     * @date: 2021/10/17 23:18
     */
    @Test
    public void TestAllEq() {
        QueryWrapper<User> userWrapper = new QueryWrapper<>();
        Map<String, Object> qm = new HashMap<>();
        //名字是特朗普的
        qm.put("username", "特朗普");
        qm.put("password", null);
        //allEq的boolean值用来觉得null值是否作为查询条件，真为处理null值
        userWrapper.allEq(qm, false);
        List<User> list = userService.list(userWrapper);
        list.forEach(System.out::println);
    }

    /**
     * @description: eq 列名和值
     * @author: Xuan Li
     * @date: 2021/10/17 23:07
     */
    @Test
    public void TestEq() {
        QueryWrapper<User> userWrapper = new QueryWrapper<>();
        //名字是特朗普的
        userWrapper.eq("username", "特朗普");
        List<User> list = userService.list(userWrapper);
        list.forEach(System.out::println);
    }

    /**
     * @description: ne 列名和值 不符合条件的
     * @author: Xuan Li
     * @date: 2021/10/17 23:07
     */
    @Test
    public void TestNe() {
        QueryWrapper<User> userWrapper = new QueryWrapper<>();
        //名字不是特朗普的
        userWrapper.ne("username", "特朗普");
        List<User> list = userService.list(userWrapper);
        list.forEach(System.out::println);
    }

    /**
     * @description: gt 列名和值 大于>
     * @author: Xuan Li
     * @date: 2021/10/17 23:08
     */
    @Test
    public void TestGt() {
        QueryWrapper<User> userWrapper = new QueryWrapper<>();
        //money大于20
        userWrapper.gt("money", 20);
        List<User> list = userService.list(userWrapper);
        list.forEach(System.out::println);
    }

    /**
     * @description: ge 列名和值 大于等于>=
     * @author: Xuan Li
     * @date: 2021/10/17 23:08
     */
    @Test
    public void TestGe() {
        QueryWrapper<User> userWrapper = new QueryWrapper<>();
        //money大于等于20
        userWrapper.ge("money", 20);
        List<User> list = userService.list(userWrapper);
        list.forEach(System.out::println);
    }

    /**
     * @description: lt 列名和值 小于 <
     * @author: Xuan Li
     * @date: 2021/10/17 23:08
     */
    @Test
    public void TestLt() {
        QueryWrapper<User> userWrapper = new QueryWrapper<>();
        //money小于30
        userWrapper.lt("money", 30);
        List<User> list = userService.list(userWrapper);
        list.forEach(System.out::println);
    }

    /**
     * @description: le 列名和值 小于等于 <=
     * @author: Xuan Li
     * @date: 2021/10/17 23:08
     */
    @Test
    public void TestLe() {
        QueryWrapper<User> userWrapper = new QueryWrapper<>();
        //money小于等于30
        userWrapper.le("money", 30);
        List<User> list = userService.list(userWrapper);
        list.forEach(System.out::println);
    }

    /**
     * @description: between 列名和开始值，结算值  在开始于结束之间
     * @author: Xuan Li
     * @date: 2021/10/17 23:08
     */
    @Test
    public void TestBetween() {
        QueryWrapper<User> userWrapper = new QueryWrapper<>();
        //money在30-10000之间的
        userWrapper.between("money", 20, 10000);
        List<User> list = userService.list(userWrapper);
        list.forEach(System.out::println);
    }

    /**
     * @description: notBetween 列名和开始值，结算值  不在开始于结束之间的
     * @author: Xuan Li
     * @date: 2021/10/17 23:08
     */
    @Test
    public void TestNotBetween() {
        QueryWrapper<User> userWrapper = new QueryWrapper<>();
        //money不在30-10000之间的
        userWrapper.notBetween("money", 20, 10000);
        List<User> list = userService.list(userWrapper);
        list.forEach(System.out::println);
    }

    /**
     * @description: like 列名和值  模糊查询
     * @author: Xuan Li
     * @date: 2021/10/17 23:08
     */
    @Test
    public void TestLike() {
        QueryWrapper<User> userWrapper = new QueryWrapper<>();
        //名字包含特的
        userWrapper.like("username", "特");
        List<User> list = userService.list(userWrapper);
        list.forEach(System.out::println);
    }

    /**
     * @description: notLike 列名和值  不包含模糊查询的数据
     * @author: Xuan Li
     * @date: 2021/10/17 23:22
     */
    @Test
    public void TestNotLike() {
        QueryWrapper<User> userWrapper = new QueryWrapper<>();
        //名字不包含特的
        userWrapper.notLike("username", "特");
        List<User> list = userService.list(userWrapper);
        list.forEach(System.out::println);
    }

    /**
     * @description: likeLeft 列名和值  单边模糊查询
     * @author: Xuan Li
     * @date: 2021/10/17 23:22
     */
    @Test
    public void TestLikeLeft() {
        QueryWrapper<User> userWrapper = new QueryWrapper<>();
        //名字以普结尾的
        userWrapper.likeLeft("username", "普");
        List<User> list = userService.list(userWrapper);
        list.forEach(System.out::println);
    }

    /**
     * @description: likeRight 列名和值  右边模糊查询
     * @author: Xuan Li
     * @date: 2021/10/17 23:22
     */
    @Test
    public void TestLikeRight() {
        QueryWrapper<User> userWrapper = new QueryWrapper<>();
        //名字以特开头的
        userWrapper.likeRight("username", "特");
        List<User> list = userService.list(userWrapper);
        list.forEach(System.out::println);
    }

    /**
     * @description: isNull 列名 列是空的
     * @author: Xuan Li
     * @date: 2021/10/17 23:22
     */
    @Test
    public void TestIsNull() {
        QueryWrapper<User> userWrapper = new QueryWrapper<>();
        //邮箱为空的
        userWrapper.isNull("email");
        List<User> list = userService.list(userWrapper);
        list.forEach(System.out::println);
    }

    /**
     * @description: isNotNull 列名 列是不为空的
     * @author: Xuan Li
     * @date: 2021/10/17 23:22
     */
    @Test
    public void TestIsNotNull() {
        QueryWrapper<User> userWrapper = new QueryWrapper<>();
        //邮箱不为空的
        userWrapper.isNotNull("email");
        List<User> list = userService.list(userWrapper);
        list.forEach(System.out::println);
    }

    /**
     * @description: in 值列表 在值列表里的数据
     * @author: Xuan Li
     * @date: 2021/10/17 23:22
     */
    @Test
    public void TestIn() {
        QueryWrapper<User> userWrapper = new QueryWrapper<>();
        //username 是魔王 和 特朗普的
        userWrapper.in("username", "魔王", "特朗普");
        List<User> list = userService.list(userWrapper);
        list.forEach(System.out::println);
    }

    /**
     * @description: notIn 值列表 不在值列表里的数据
     * @author: Xuan Li
     * @date: 2021/10/17 23:22
     */
    @Test
    public void TestNotIn() {
        QueryWrapper<User> userWrapper = new QueryWrapper<>();
        //username 不是魔王 和 特朗普的
        userWrapper.notIn("username", "魔王", "特朗普");
        List<User> list = userService.list(userWrapper);
        list.forEach(System.out::println);
    }

    /**
     * @description: inSql 列名和查询语句 子查询
     * @author: Xuan Li
     * @date: 2021/10/17 23:22
     */
    @Test
    public void TestInSql() {
        QueryWrapper<User> userWrapper = new QueryWrapper<>();
        //username 和 id15 username一样的
        userWrapper.inSql("username", "select username from t_user where id = 15");
        List<User> list = userService.list(userWrapper);
        list.forEach(System.out::println);
    }

    /**
     * @description: notInSql 列名和查询语句 子查询
     * @author: Xuan Li
     * @date: 2021/10/17 23:22
     */
    @Test
    public void TestNotInSql() {
        QueryWrapper<User> userWrapper = new QueryWrapper<>();
        //username 和 id15 username 不一样的
        userWrapper.notInSql("username", "select username from t_user where id = 15");
        List<User> list = userService.list(userWrapper);
        list.forEach(System.out::println);
    }

    /**
     * @description: groupBy 列名列表 分组查询 select 查询列
     * @author: Xuan Li
     * @date: 2021/10/17 23:54
     */
    @Test
    public void TestGroupBy() {
        QueryWrapper<User> userWrapper = new QueryWrapper<>();
        //根据名字分组查询平均工资
        userWrapper.select("username,avg(money)");
        userWrapper.groupBy("username");
        List<User> list = userService.list(userWrapper);
        list.forEach(System.out::println);
    }

    /**
     * @description: orderByAsc 列名列表 升序排序
     * @author: Xuan Li
     * @date: 2021/10/17 23:54
     */
    @Test
    public void orderByAsc() {
        QueryWrapper<User> userWrapper = new QueryWrapper<>();
        //根据工资升序排序
        userWrapper.orderByAsc("money");
        List<User> list = userService.list(userWrapper);
        list.forEach(System.out::println);
    }

    /**
     * @description: orderByDesc 列名列表 降序排序
     * @author: Xuan Li
     * @date: 2021/10/18 00:04
     */
    @Test
    public void orderByDesc() {
        QueryWrapper<User> userWrapper = new QueryWrapper<>();
        //根据工资降序排序
        userWrapper.orderByDesc("money");
        List<User> list = userService.list(userWrapper);
        list.forEach(System.out::println);
    }

    /**
     * @description: orderBy 是否排序，是否升序，列名列表 自定义混合排序
     * @author: Xuan Li
     * @date: 2021/10/18 00:04
     */
    @Test
    public void orderBy() {
        QueryWrapper<User> userWrapper = new QueryWrapper<>();
        //根据username降序排序，相同则金额升序
        userWrapper.orderBy(true, false, "username")
                .orderBy(true, true, "money");
        List<User> list = userService.list(userWrapper);
        list.forEach(System.out::println);
    }

    /**
     * @description: or 或，eq 之间使用
     * @author: Xuan Li
     * @date: 2021/10/18 00:04
     */
    @Test
    public void or() {
        QueryWrapper<User> userWrapper = new QueryWrapper<>();
        //username 是魔王或特朗普
        userWrapper.eq("username", "魔王")
                .or()
                .eq("username", "特朗普");
        List<User> list = userService.list(userWrapper);
        list.forEach(System.out::println);
    }

    /**
     * @description: last sql语句 添加到sql语句最后面
     * @author: Xuan Li
     * @date: 2021/10/18 00:04
     */
    @Test
    public void last() {
        QueryWrapper<User> userWrapper = new QueryWrapper<>();
        //username 是魔王或特朗普 只保留一个
        userWrapper.eq("username", "魔王")
                .or()
                .eq("username", "特朗普")
                .last("limit 1");
        List<User> list = userService.list(userWrapper);
        list.forEach(System.out::println);
    }

    /**
     * EXISTS 用于检查子查询是否至少会返回一行数据，该子查询实际上并不返回任何数据，
     * 而是返回值True或False
     * EXISTS 指定一个子查询，检测 行 的存在。
     * @author: Xuan Li
     * @date: 2021/10/18 00:14
     */
    @Test
    public void exists() {
        QueryWrapper<User> userWrapper = new QueryWrapper<>();
        //exists 子查询满足添加才执行
        userWrapper.exists("select id from t_user where money < 0");
        List<User> list = userService.list(userWrapper);
        list.forEach(System.out::println);
    }

    /**
     * EXISTS 用于检查子查询是否至少会返回一行数据，该子查询实际上并不返回任何数据，
     * 而是返回值True或False
     * notExists 指定一个子查询，检测 行 的存在,不存在才执行
     * @author: Xuan Li
     * @date: 2021/10/18 00:14
     */
    @Test
    public void notExists() {
        QueryWrapper<User> userWrapper = new QueryWrapper<>();
        //exists 子查询不满足添加才执行
        userWrapper.notExists("select id from t_user where money < 0");
        List<User> list = userService.list(userWrapper);
        list.forEach(System.out::println);
    }

}
