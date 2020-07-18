package com.hm.service;

import com.hm.domain.Product;
import com.hm.domain.Vote;

import java.util.List;

/**
 * @author lq
 * @date 2020/5/27
 */
public interface VoteService {

    public List<Vote> findAll() throws Exception;

    public void save(Vote vote);
}
