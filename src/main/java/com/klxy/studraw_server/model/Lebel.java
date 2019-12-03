package com.klxy.studraw_server.model;

import java.util.Date;

public class Lebel {
    private String id;
    private String userid;
    private Date createtime;
    private String lebellist;
    private String remark;

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

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getLebellist() {
        return lebellist;
    }

    public void setLebellist(String lebellist) {
        this.lebellist = lebellist;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Lebel{" +
                "id='" + id + '\'' +
                ", userid='" + userid + '\'' +
                ", createtime=" + createtime +
                ", lebellist='" + lebellist + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
