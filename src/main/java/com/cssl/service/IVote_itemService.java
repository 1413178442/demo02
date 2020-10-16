package com.cssl.service;

import com.cssl.entity.Vote_item;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author .
 * @since 2020-10-09
 */
public interface IVote_itemService extends IService<Vote_item> {

    boolean voteitem(Map<String,Object> map);

    int voteadd(Vote_item item);

}
