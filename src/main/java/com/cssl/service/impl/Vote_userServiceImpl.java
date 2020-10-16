package com.cssl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cssl.entity.Vote_user;
import com.cssl.mapper.Vote_userMapper;
import com.cssl.service.IVote_userService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author .
 * @since 2020-10-09
 */
@Service
public class Vote_userServiceImpl extends ServiceImpl<Vote_userMapper, Vote_user> implements IVote_userService {
    @Resource
    Vote_userMapper userMapper;

    @Override
    public Vote_user voteuser(Vote_user user) {
        return userMapper.voteuser(user);
    }

    @Override
    public boolean adduser(Vote_user user) {
        if (userMapper.adduser(user)>=1) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean showuser(String name) {
        if (userMapper.showuser(name)==null){
            return true;
        }else {
            return false;
        }

    }
}
