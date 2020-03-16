package cn.fxpaul.gmall.gmall.oms.service.impl;

import cn.fxpaul.gmall.gmall.oms.mapper.CartItemMapper;
import cn.fxpaul.gmall.oms.entity.CartItem;
import cn.fxpaul.gmall.oms.service.CartItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 购物车表 服务实现类
 * </p>
 *
 * @author fxpaul
 * @since 2020-03-17
 */
@Service
public class CartItemServiceImpl extends ServiceImpl<CartItemMapper, CartItem> implements CartItemService {

}
