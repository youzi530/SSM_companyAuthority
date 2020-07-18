package com.hm.domain;

import com.hm.utils.DateFormatUtils;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author lq
 * @date 2020/5/26
 */
public class Notice {

    private String id; // 主键
    private String noticeNum; // 编号 唯一
    private String title;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm")
    private Date begindate; // 出发时间
    private String begindateStr;  //方便展示数据--出发时间

    private String content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNoticeNum() {
        return noticeNum;
    }

    public void setNoticeNum(String noticeNum) {
        this.noticeNum = noticeNum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getBegindate() {
        return begindate;
    }

    public void setBegindate(Date begindate) {
        this.begindate = begindate;
    }

    public String getBegindateStr() {
        if(begindate != null){
            begindateStr = DateFormatUtils.dateToString(begindate,"yyyy-MM-dd HH:mm:ss");
        }
        return begindateStr;
    }

    public void setBegindateStr(String begindateStr) {
        this.begindateStr = begindateStr;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
