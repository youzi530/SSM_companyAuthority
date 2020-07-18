package com.hm.domain;

import com.hm.utils.DateFormatUtils;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author lq
 * @date 2020/
 */
public class Schedule {

    private String id; // 主键
    private String scheduleNum; // 编号 唯一
    private String title;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm")
    private Date begindate; // 开始投票时间
    private String begindateStr;  //方便展示开始投票时间

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm")
    private Date endtime; // 结束投票时间
    private String endtimeStr;  //方便展示结束投票时间

    private Integer participant; //表示小区民称的：1：小区1，2：小区2，3：小:3
    private String participantStr;

    private Integer isvote; //代表投票的状态 0：未投票  ，1表示已赞同  ，2表示已反对
    private String isvoteStr;

    private String content; //投票细则


    public String getScheduleNum() {
        return scheduleNum;
    }

    public void setScheduleNum(String scheduleNum) {
        this.scheduleNum = scheduleNum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getEndtimeStr() {
        if(endtime != null){
            endtimeStr = DateFormatUtils.dateToString(endtime,"yyyy-MM-dd HH:mm:ss");
        }
        return endtimeStr;
    }

    public void setEndtimeStr(String endtimeStr) {
        this.endtimeStr = endtimeStr;
    }

    public Integer getParticipant() {
        return participant;
    }

    public void setParticipant(Integer participant) {
        this.participant = participant;
    }

    public String getParticipantStr() {

        if(participant == 1){
            participantStr = "华府龙源居民区一";
        }
        if(participant == 2){
            participantStr = "华府龙源居民区二";
        }
        if(participant == 3){
            participantStr = "山水文园居民区一";
        }
        if(participant == 4){
            participantStr = "山水文园居民区二";
        }
        if(participant == 5){
            participantStr = "山水文园居民区三";
        }
        if(participant == 6){
            participantStr = "山水文园居民区四";
        }
        if(participant == 7){
            participantStr = "水印康桥居民区一";
        }
        return participantStr;
    }

    public void setParticipantStr(String participantStr) {
        this.participantStr = participantStr;
    }

    public Integer getIsvote() {
        return isvote;
    }

    public void setIsvote(Integer isvote) {
        this.isvote = isvote;
    }

    public String getIsvoteStr() {
        if(isvote == 0){
            isvoteStr = "未开始投票";
        }
        if(isvote == 1){
            isvoteStr = "开始投票";
        }
        if(isvote == 2){
            isvoteStr = "投票已结束";
        }
        return isvoteStr;
    }

    public void setIsvoteStr(String isvoteStr) {
        this.isvoteStr = isvoteStr;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
