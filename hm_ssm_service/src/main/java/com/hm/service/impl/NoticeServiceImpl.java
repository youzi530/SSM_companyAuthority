package com.hm.service.impl;

import com.hm.dao.NoticeDao;
import com.hm.dao.ProductDao;
import com.hm.domain.Notice;
import com.hm.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lq
 * @date 2020/5/26
 */
@Service("noticeService")
public class NoticeServiceImpl implements NoticeService {

    @Autowired
    private NoticeDao noticeDao;

    @Override
    public List<Notice> findAll() throws Exception {
        return noticeDao.findAll();
    }

    @Override
    public void save(Notice notice) {
        noticeDao.save(notice);
    }

    @Override
    public Notice findById(String noticeId) {
        return noticeDao.findById(noticeId);
    }


}
