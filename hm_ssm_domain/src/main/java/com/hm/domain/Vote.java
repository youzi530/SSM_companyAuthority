package com.hm.domain;

/**
 * @author lq
 * @date 2020/5/27
 */
public class Vote {

    private String id; // 主键
    private String voteNum; // 编号 唯一
    private String scheduleNum; //具体的投票编号
    private String title;
    private String username;  //投票人
    private Integer state;  //投票的结果
    private String stateStr;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVoteNum() {
        return voteNum;
    }

    public void setVoteNum(String voteNum) {
        this.voteNum = voteNum;
    }

    public String getScheduleNum() {
        return scheduleNum;
    }

    public void setScheduleNum(String scheduleNum) {
        this.scheduleNum = scheduleNum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getStateStr() {

        if(state == 0){
            stateStr = "赞同";
        }
        if(state == 1){
            stateStr = "反对";
        }
        return stateStr;
    }

    public void setStateStr(String stateStr) {
        this.stateStr = stateStr;
    }
}
