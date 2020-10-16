package com.cssl.mapper;

import com.cssl.entity.Vote_option;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cssl.entity.Vote_subject;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author .
 * @since 2020-10-09
 */
public interface Vote_optionMapper extends BaseMapper<Vote_option> {

    Map<String,Object>optionmap(Integer vsid);

    List<Vote_option>optionlist(Integer vsid);

    Vote_subject subject(Integer vsid);

}
