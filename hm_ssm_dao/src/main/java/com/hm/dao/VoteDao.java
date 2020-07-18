package com.hm.dao;

import com.hm.domain.Product;
import com.hm.domain.Vote;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author lq
 * @date 2020/5/27
 */
public interface VoteDao {

    //查询所有的产品信息
    @Select("select * from vote")
    public List<Vote> findAll();

    //保存方法：
    @Insert("insert into vote(voteNum,scheduleNum,title,username,state) values(#{voteNum},#{scheduleNum},#{title},#{username},#{state})")
    public void save(Vote vote);

    //根据id来查询产品信息
    @Select("select * from vote where id = #{id}")
    public Vote findById(String id);

}
