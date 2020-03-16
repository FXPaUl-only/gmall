package cn.fxpaul.gmall.pms.service.impl;

import cn.fxpaul.gmall.pms.entity.Comment;
import cn.fxpaul.gmall.pms.mapper.CommentMapper;
import cn.fxpaul.gmall.pms.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品评价表 服务实现类
 * </p>
 *
 * @author fxpaul
 * @since 2020-03-17
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
