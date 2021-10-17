package top.mowang.mybatisplus.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * MyBatis-Demo
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/17 18:07
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_user")
@SuppressWarnings("all")
public class User extends Model<User> {

    //value主键字段的名称,如果是id，
    // 可以不用写，type指定主键类型，auto表示自动增长
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private String username;
    private String password;
    private String email;
    private Double money;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(String username, String password, String email, Double money) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.money = money;
    }
}
