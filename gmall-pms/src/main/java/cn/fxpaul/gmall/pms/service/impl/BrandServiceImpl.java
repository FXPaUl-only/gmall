package cn.fxpaul.gmall.pms.service.impl;

import cn.fxpaul.gmall.pms.entity.Brand;
import cn.fxpaul.gmall.pms.mapper.BrandMapper;
import cn.fxpaul.gmall.pms.service.BrandService;
import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 品牌表 服务实现类
 * </p>
 *
 * @author fxpaul
 * @since 2020-03-17
 */
@Component
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements BrandService {

}
