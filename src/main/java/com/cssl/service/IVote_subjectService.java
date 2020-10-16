package com.cssl.service;

import com.cssl.entity.Vote_subject;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author .
 * @since 2020-10-09
 */
public interface IVote_subjectService extends IService<Vote_subject> {
    List<Vote_subject> subjectlist();

}
