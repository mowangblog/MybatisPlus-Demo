package top.mowang.mybatisplus.service.impl;

import top.mowang.mybatisplus.pojo.TUser;
import top.mowang.mybatisplus.mapper.TUserMapper;
import top.mowang.mybatisplus.service.ITUserService;
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
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements ITUserService {

}
