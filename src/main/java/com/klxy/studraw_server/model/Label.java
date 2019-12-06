package com.klxy.studraw_server.model;

import java.util.Date;

public class Label {
    private int id;
    private int userid;
    private Date createtime;
    private String labellist;
    private String remark;

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

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getLabellist() {
        return labellist;
    }

    public void setLabellist(String labellist) {
        this.labellist = labellist;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Label{" +
                "id=" + id +
                ", userid=" + userid +
                ", createtime=" + createtime +
                ", labellist='" + labellist + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
