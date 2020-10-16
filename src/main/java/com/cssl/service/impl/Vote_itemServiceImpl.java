package com.cssl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cssl.entity.Vote_item;
import com.cssl.mapper.Vote_itemMapper;
import com.cssl.service.IVote_itemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author .
 * @since 2020-10-09
 */
@Service
public class Vote_itemServiceImpl extends ServiceImpl<Vote_itemMapper, Vote_item> implements IVote_itemService {

    @Resource
    Vote_itemMapper itemMapper;

    @Override
    public int voteadd(Vote_item item) {
        return itemMapper.voteadd(item);
    }

    @Override
    public boolean voteitem(Map<String, Object> map) {
        return itemMapper.voteitem(map)==null?true:false;
    }
}
