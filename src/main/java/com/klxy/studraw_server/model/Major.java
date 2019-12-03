package com.klxy.studraw_server.model;

public class Major {
    private String id;
    private String majname;
    private String remark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMajname() {
        return majname;
    }

    public void setMajname(String majname) {
        this.majname = majname;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Major{" +
                "id='" + id + '\'' +
                ", majname='" + majname + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
