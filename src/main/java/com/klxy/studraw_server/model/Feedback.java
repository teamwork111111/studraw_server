package com.klxy.studraw_server.model;

import java.util.Date;

public class Feedback {
    private String id;
    private String sumid;
    private Date createtime;
    private String content;
    private String userid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSumid() {
        return sumid;
    }

    public void setSumid(String sumid) {
        this.sumid = sumid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "id='" + id + '\'' +
                ", sumid='" + sumid + '\'' +
                ", createtime=" + createtime +
                ", content='" + content + '\'' +
                ", userid='" + userid + '\'' +
                '}';
    }
}
