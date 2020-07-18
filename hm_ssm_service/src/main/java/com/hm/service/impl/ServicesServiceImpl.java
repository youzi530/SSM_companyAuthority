package com.hm.service.impl;

import com.hm.dao.ServicesDao;
import com.hm.domain.Services;
import com.hm.service.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lq
 * @date 2020/5/27
 */
@Service("servicesService")
public class ServicesServiceImpl implements ServicesService {

    @Autowired
    private ServicesDao servicesDao;

    @Override
    public List<Services> findAll() throws Exception {
        return servicesDao.findAll();
    }

    @Override
    public void save(Services services) {
        servicesDao.save(services);
    }

    @Override
    public Services findId(String servicesId) {
        return servicesDao.findById(servicesId);
    }

    @Override
    public void order(String servicesId) {
        servicesDao.order(servicesId);
    }

    @Override
    public void lend(String servicesId) {
        servicesDao.lend(servicesId);
    }
}
