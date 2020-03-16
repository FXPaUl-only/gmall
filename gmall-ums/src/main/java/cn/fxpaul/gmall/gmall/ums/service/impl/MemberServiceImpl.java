package cn.fxpaul.gmall.gmall.ums.service.impl;

import cn.fxpaul.gmall.gmall.ums.mapper.MemberMapper;
import cn.fxpaul.gmall.ums.entity.Member;
import cn.fxpaul.gmall.ums.service.MemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author fxpaul
 * @since 2020-03-17
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

}
