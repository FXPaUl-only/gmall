package cn.fxpaul.gmall.ums.service.impl;

import cn.fxpaul.gmall.ums.entity.Admin;
import cn.fxpaul.gmall.ums.mapper.AdminMapper;
import cn.fxpaul.gmall.ums.service.AdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author fxpaul
 * @since 2020-03-17
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

}
