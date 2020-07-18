package com.hm.dao;

import com.hm.domain.Schedule;
import com.hm.domain.Services;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author lq
 * @date 2020/5/27
 */
public interface ServicesDao {

    //查询所有的便民信息
    @Select("select * from services")
    public List<Services> findAll();

    //保存方法：
    @Insert("insert into services(servicesNum,title,content,state) values(#{servicesNum},#{title},#{content},#{state})")
    public void save(Services services);

    //根据id来查询议程信息
    @Select("select * from services where id = #{id}")
    public Services findById(String id);

    //根据id来更改信息
    @Update("update services set state = 1 where id = #{id}")
    public void order(String id);

    //根据id来更改信息
    @Update("update services set state = 2 where id = #{id}")
    public void lend(String id);

}
