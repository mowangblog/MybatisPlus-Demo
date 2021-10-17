package top.mowang.mybatisplus.pojo;

import java.io.Serializable;
import java.time.LocalDate;
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
@ApiModel(value = "Emp对象", description = "")
public class Emp implements Serializable {

    private static final long serialVersionUID = 1L;

      private Integer empno;

    private String ename;

    private String job;

    private Integer mgr;

    private LocalDate hiredate;

    private Double sal;

    private Double comm;

    private Integer deptno;


}
