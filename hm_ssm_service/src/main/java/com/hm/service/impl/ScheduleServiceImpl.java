package com.hm.service.impl;

import com.hm.dao.ProductDao;
import com.hm.dao.ScheduleDao;
import com.hm.domain.Schedule;
import com.hm.domain.Vote;
import com.hm.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lq
 * @date 2020
 */
@Service("scheduleService")
public class ScheduleServiceImpl implements ScheduleService {

    @Autowired
    private ScheduleDao scheduleDao;

    @Override
    public List<Schedule> findAll() throws Exception {
        return scheduleDao.findAll();
    }

    @Override
    public void save(Schedule schedule) {
        scheduleDao.save(schedule);
    }

    @Override
    public Schedule findId(String scheduleId) {
        return scheduleDao.findById(scheduleId);
    }

    @Override
    public Vote detailById(String scheduleNum) {
        return scheduleDao.detailById(scheduleNum);
    }

//    @Override
//    public void choose(Schedule schedule) {
//        scheduleDao.choose(schedule);
//    }
}
