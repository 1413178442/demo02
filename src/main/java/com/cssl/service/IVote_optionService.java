package com.cssl.service;

import com.cssl.entity.Vote_option;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cssl.entity.Vote_subject;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author .
 * @since 2020-10-09
 */
public interface IVote_optionService extends IService<Vote_option> {

    Map<String,Object> optionmap(Integer vsid);

    List<Vote_option> optionlist(Integer vsid);

    Vote_subject subject(Integer vsid);

}
