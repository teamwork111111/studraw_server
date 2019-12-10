package com.klxy.studraw_server.model;

import java.util.Date;

public class Loger {
    private int id;
    private int userid;
    private Date logtime;
    private String logip;
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public Date getLogtime() {
        return logtime;
    }

    public void setLogtime(Date logtime) {
        this.logtime = logtime;
    }

    public String getLogip() {
        return logip;
    }

    public void setLogip(String logip) {
        this.logip = logip;
    }

    @Override
    public String toString() {
        return "LogerDao{" +
                "id=" + id +
                ", userid=" + userid +
                ", logtime=" + logtime +
                ", logip='" + logip + '\'' +
                ", user=" + user +
                '}';
    }
}
