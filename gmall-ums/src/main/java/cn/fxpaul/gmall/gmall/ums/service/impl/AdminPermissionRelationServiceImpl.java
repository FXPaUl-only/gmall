package cn.fxpaul.gmall.gmall.ums.service.impl;

import cn.fxpaul.gmall.ums.entity.AdminPermissionRelation;
import cn.fxpaul.gmall.ums.mapper.AdminPermissionRelationMapper;
import cn.fxpaul.gmall.ums.service.AdminPermissionRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限) 服务实现类
 * </p>
 *
 * @author fxpaul
 * @since 2020-03-17
 */
@Service
public class AdminPermissionRelationServiceImpl extends ServiceImpl<AdminPermissionRelationMapper, AdminPermissionRelation> implements AdminPermissionRelationService {

}
