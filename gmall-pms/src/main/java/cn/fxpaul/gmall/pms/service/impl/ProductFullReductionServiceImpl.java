package cn.fxpaul.gmall.pms.service.impl;

import cn.fxpaul.gmall.pms.entity.ProductFullReduction;
import cn.fxpaul.gmall.pms.mapper.ProductFullReductionMapper;
import cn.fxpaul.gmall.pms.service.ProductFullReductionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品满减表(只针对同商品) 服务实现类
 * </p>
 *
 * @author fxpaul
 * @since 2020-03-17
 */
@Service
public class ProductFullReductionServiceImpl extends ServiceImpl<ProductFullReductionMapper, ProductFullReduction> implements ProductFullReductionService {

}
