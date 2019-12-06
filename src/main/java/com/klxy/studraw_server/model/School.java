package com.klxy.studraw_server.model;

public class School {
    private int id;
    private String schoolname;
    private String code;
    private String desc;
    private String logo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Override
    public String toString() {
        return "School{" +
                "id=" + id +
                ", schoolname='" + schoolname + '\'' +
                ", code='" + code + '\'' +
                ", desc='" + desc + '\'' +
                ", logo='" + logo + '\'' +
                '}';
    }
}
