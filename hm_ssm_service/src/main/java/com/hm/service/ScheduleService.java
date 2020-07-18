package com.hm.service;

import com.hm.domain.Product;
import com.hm.domain.Schedule;
import com.hm.domain.Vote;

import java.util.List;

/**
 * @author lq
 * @date 2020
 */
public interface ScheduleService {

    public List<Schedule> findAll() throws Exception;

    public void save(Schedule schedule);

    public Schedule findId(String scheduleId);

    //public void choose(Schedule schedule);

    public Vote detailById(String scheduleNum);
}
