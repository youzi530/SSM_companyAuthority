package com.hm.service;

import com.hm.domain.Notice;
import com.hm.domain.Product;

import java.util.List;

/**
 * @author lq
 * @date 2020/5/26
 */
public interface NoticeService {

    public List<Notice> findAll() throws Exception;

    public void save(Notice notice);

    public Notice findById(String noticeId);
}
