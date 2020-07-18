package com.hm.service.impl;

import com.hm.dao.VoteDao;
import com.hm.domain.Vote;
import com.hm.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lq
 * @date 2020/5/27
 */
@Service("voteService")
public class VoteServiceImpl implements VoteService {

    @Autowired
    private VoteDao voteDao;

    @Override
    public List<Vote> findAll() throws Exception {
        return voteDao.findAll();
    }

    @Override
    public void save(Vote vote) {
        voteDao.save(vote);
    }
}
