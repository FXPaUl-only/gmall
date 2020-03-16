package cn.fxpaul.gmall.oms.service.impl;

import cn.fxpaul.gmall.oms.entity.Order;
import cn.fxpaul.gmall.oms.mapper.OrderMapper;
import cn.fxpaul.gmall.oms.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author fxpaul
 * @since 2020-03-17
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
