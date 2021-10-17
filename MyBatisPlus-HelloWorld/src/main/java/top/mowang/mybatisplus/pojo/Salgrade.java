package top.mowang.mybatisplus.pojo;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author Xuan li
 * @since 2021-10-18
 */
@Getter
@Setter
@ApiModel(value = "Salgrade对象", description = "")
public class Salgrade implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer grade;

    private Integer losal;

    private Integer hisal;


}
