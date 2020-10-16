package com.cssl.mapper;

import com.cssl.entity.Vote_item;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author .
 * @since 2020-10-09
 */
public interface Vote_itemMapper extends BaseMapper<Vote_item> {

    Vote_item voteitem(Map<String,Object>map);

    int voteadd(Vote_item item);

}
