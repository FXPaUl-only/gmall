package cn.fxpaul.gmall.pms.service.impl;

import cn.fxpaul.gmall.pms.entity.Product;
import cn.fxpaul.gmall.pms.mapper.ProductMapper;
import cn.fxpaul.gmall.pms.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author fxpaul
 * @since 2020-03-17
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
