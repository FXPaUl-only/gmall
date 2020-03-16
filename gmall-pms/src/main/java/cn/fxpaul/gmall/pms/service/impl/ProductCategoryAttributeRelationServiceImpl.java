package cn.fxpaul.gmall.pms.service.impl;

import cn.fxpaul.gmall.pms.entity.ProductCategoryAttributeRelation;
import cn.fxpaul.gmall.pms.mapper.ProductCategoryAttributeRelationMapper;
import cn.fxpaul.gmall.pms.service.ProductCategoryAttributeRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品的分类和属性的关系表，用于设置分类筛选条件 服务实现类
 * </p>
 *
 * @author fxpaul
 * @since 2020-03-17
 */
@Service
public class ProductCategoryAttributeRelationServiceImpl extends ServiceImpl<ProductCategoryAttributeRelationMapper, ProductCategoryAttributeRelation> implements ProductCategoryAttributeRelationService {

}
