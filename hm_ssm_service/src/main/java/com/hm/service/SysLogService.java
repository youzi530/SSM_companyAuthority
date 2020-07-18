package com.hm.service;

import com.hm.domain.SysLog;

import java.util.List;

public interface SysLogService {

    public void save(SysLog sysLog);

    public List<SysLog> findAll();
}
