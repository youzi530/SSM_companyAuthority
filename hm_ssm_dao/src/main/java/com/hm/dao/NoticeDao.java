package com.hm.dao;

import com.hm.domain.Notice;
import com.hm.domain.Schedule;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author lq
 * @date 2020/5/26
 */
public interface NoticeDao {

    //查询所有的议程信息
    @Select("select * from notice")
    public List<Notice> findAll();

    //保存方法：
    @Insert("insert into notice(noticeNum,title,begindate,content) values(#{noticeNum},#{title},#{begindate},#{content})")
    public void save(Notice notice);

    //根据id来查询议程信息
    @Select("select * from notice where id = #{id}")
    public Notice findById(String id);
}
