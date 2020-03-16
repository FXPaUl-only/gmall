package cn.fxpaul.gmall.ums.service.impl;

import cn.fxpaul.gmall.ums.entity.AdminLoginLog;
import cn.fxpaul.gmall.ums.mapper.AdminLoginLogMapper;
import cn.fxpaul.gmall.ums.service.AdminLoginLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户登录日志表 服务实现类
 * </p>
 *
 * @author fxpaul
 * @since 2020-03-17
 */
@Service
public class AdminLoginLogServiceImpl extends ServiceImpl<AdminLoginLogMapper, AdminLoginLog> implements AdminLoginLogService {

}
