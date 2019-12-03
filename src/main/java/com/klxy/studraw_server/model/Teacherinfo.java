package com.klxy.studraw_server.model;

public class Teacherinfo {
    private String id;
    private String no;
    private String schid;
    private String remark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getSchid() {
        return schid;
    }

    public void setSchid(String schid) {
        this.schid = schid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Teacherinfo{" +
                "id='" + id + '\'' +
                ", no='" + no + '\'' +
                ", schid='" + schid + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
