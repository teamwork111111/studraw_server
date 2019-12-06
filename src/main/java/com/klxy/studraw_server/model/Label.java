package com.klxy.studraw_server.model;

import java.util.Date;

public class Label {
    private String id;
    private String userid;
    private Date createtime;
    private String labellist;
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
                "id='" + id + '\'' +
                ", userid='" + userid + '\'' +
                ", createtime=" + createtime +
                ", labellist='" + labellist + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
