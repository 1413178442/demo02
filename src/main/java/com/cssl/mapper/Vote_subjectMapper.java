package com.cssl.mapper;

import com.cssl.entity.Vote_subject;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author .
 * @since 2020-10-09
 */
public interface Vote_subjectMapper extends BaseMapper<Vote_subject> {

    List<Vote_subject>subjectlist();

}
