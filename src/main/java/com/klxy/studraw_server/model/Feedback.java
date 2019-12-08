package com.klxy.studraw_server.model;

import java.util.Date;

public class Feedback {
    private int id;
    private int sumid;
    private Date createtime;
    private String content;
    private int userid;
    private Summary summary;
    private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSumid() {
        return sumid;
    }

    public void setSumid(int sumid) {
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

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "id=" + id +
                ", sumid=" + sumid +
                ", createtime=" + createtime +
                ", content='" + content + '\'' +
                ", userid=" + userid +
                ", summary=" + summary +
                ", user=" + user +
                '}';
    }
}
