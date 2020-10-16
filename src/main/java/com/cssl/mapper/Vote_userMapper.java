package com.cssl.mapper;

import com.cssl.entity.Vote_user;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author .
 * @since 2020-10-09
 */
public interface Vote_userMapper extends BaseMapper<Vote_user> {

    Vote_user voteuser(Vote_user user);

    int adduser(Vote_user user);

    Vote_user showuser(String name);

}
