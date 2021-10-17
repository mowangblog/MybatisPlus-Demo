package top.mowang.mybatisplus.service.impl;

import top.mowang.mybatisplus.pojo.Dept;
import top.mowang.mybatisplus.mapper.DeptMapper;
import top.mowang.mybatisplus.service.IDeptService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Xuan li
 * @since 2021-10-18
 */
@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements IDeptService {

}
