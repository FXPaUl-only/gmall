package cn.fxpaul.gmall.gmall.oms.service.impl;

import cn.fxpaul.gmall.oms.entity.OrderItem;
import cn.fxpaul.gmall.oms.mapper.OrderItemMapper;
import cn.fxpaul.gmall.oms.service.OrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单中所包含的商品 服务实现类
 * </p>
 *
 * @author fxpaul
 * @since 2020-03-17
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService {

}
