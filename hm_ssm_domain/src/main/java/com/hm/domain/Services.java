package com.hm.domain;

/**
 * @author lq
 * @date 2020/5/27
 */
public class Services {

    private String id; // 主键
    private String servicesNum; // 编号 唯一
    private String title;
    private String content;

    private Integer state;
    private String stateStr;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServicesNum() {
        return servicesNum;
    }

    public void setServicesNum(String servicesNum) {
        this.servicesNum = servicesNum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getStateStr() {
        if(state == 0){
            stateStr = "无状态";
        }
        if(state == 1){
            stateStr = "已预约";
        }
        if(state == 2){
            stateStr = "已借出";
        }
        if(state == 3){
            stateStr = "已删除";
        }
        return stateStr;
    }

    public void setStateStr(String stateStr) {
        this.stateStr = stateStr;
    }
}
