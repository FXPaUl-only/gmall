package cn.fxpaul.gmall.pms.service.impl;

import cn.fxpaul.gmall.pms.entity.ProductLadder;
import cn.fxpaul.gmall.pms.mapper.ProductLadderMapper;
import cn.fxpaul.gmall.pms.service.ProductLadderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品阶梯价格表(只针对同商品) 服务实现类
 * </p>
 *
 * @author fxpaul
 * @since 2020-03-17
 */
@Service
public class ProductLadderServiceImpl extends ServiceImpl<ProductLadderMapper, ProductLadder> implements ProductLadderService {

}
