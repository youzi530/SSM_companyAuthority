package com.hm.service;

import com.hm.domain.Schedule;
import com.hm.domain.Services;

import java.util.List;

/**
 * @author lq
 * @date 2020/5/27
 */
public interface ServicesService {

    public List<Services> findAll() throws Exception;

    public void save(Services services);

    public Services findId(String servicesId);

    public void order(String servicesId);

    public void lend(String servicesId);
}
