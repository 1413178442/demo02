package com.cssl.service.impl;

import com.cssl.entity.Vote_option;
import com.cssl.entity.Vote_subject;
import com.cssl.mapper.Vote_optionMapper;
import com.cssl.service.IVote_optionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
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
@Transactional(propagation= Propagation.REQUIRED,isolation= Isolation.DEFAULT,readOnly = false,rollbackFor=Exception.class)
public class Vote_optionServiceImpl extends ServiceImpl<Vote_optionMapper, Vote_option> implements IVote_optionService {

    @Resource
    Vote_optionMapper optionMapper;

    @Override
    public List<Vote_option> optionlist(Integer vsid) {
        return optionMapper.optionlist(vsid);
    }

    @Override
    public Vote_subject subject(Integer vsid) {
        return optionMapper.subject(vsid);
    }

    @Override
    public Map<String, Object> optionmap(Integer vsid) {
        return optionMapper.optionmap(vsid);
    }
}
