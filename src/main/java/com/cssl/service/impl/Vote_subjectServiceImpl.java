package com.cssl.service.impl;

import com.cssl.entity.Vote_subject;
import com.cssl.mapper.Vote_subjectMapper;
import com.cssl.service.IVote_subjectService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

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
public class Vote_subjectServiceImpl extends ServiceImpl<Vote_subjectMapper, Vote_subject> implements IVote_subjectService {
    @Resource
    Vote_subjectMapper subjectMapper;

    @Override
    public List<Vote_subject> subjectlist() {
        return subjectMapper.subjectlist();
    }
}
