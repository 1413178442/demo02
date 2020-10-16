package com.cssl.service;

import com.cssl.entity.Vote_user;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author .
 * @since 2020-10-09
 */
public interface IVote_userService extends IService<Vote_user> {
    Vote_user voteuser(Vote_user user);

    boolean adduser(Vote_user user);

    boolean showuser(String name);

}
