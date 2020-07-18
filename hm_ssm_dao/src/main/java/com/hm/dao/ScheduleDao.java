package com.hm.dao;

import com.hm.domain.Product;
import com.hm.domain.Schedule;
import com.hm.domain.Vote;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author lq
 * @date 2020
 */
public interface ScheduleDao {

    //查询所有的议程信息
    @Select("select * from schedule")
    public List<Schedule> findAll();

    //保存方法：
    @Insert("insert into schedule(scheduleNum,title,begindate,endtime,participant,isvote,content) values(#{scheduleNum},#{title},#{begindate},#{endtime},#{participant},#{isvote},#{content})")
    public void save(Schedule schedule);

    //根据id来查询议程信息
    @Select("select * from schedule where id = #{id}")
    public Schedule findById(String id);

//    @Update("update schedule set isvote = #{isvote} and owener= #{owener} where id = #{id}")
//    public void choose(Schedule schedule);

    //根据id来查询议程信息
    @Select("select * from vote where scheduleNum = #{scheduleNum}")
    public Vote detailById(String scheduleNum);

}
