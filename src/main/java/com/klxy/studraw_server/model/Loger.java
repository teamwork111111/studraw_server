package com.klxy.studraw_server.model;

import java.util.Date;

public class Loger {
    private String id;
    private String userid;
    private Date logtime;
    private String logip;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
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
        return "Loger{" +
                "id='" + id + '\'' +
                ", userid='" + userid + '\'' +
                ", logtime=" + logtime +
                ", logip='" + logip + '\'' +
                '}';
    }
}
