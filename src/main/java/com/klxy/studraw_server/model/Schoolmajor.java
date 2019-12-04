package com.klxy.studraw_server.model;

public class Schoolmajor {
    private String id;
    private String schid;
    private String majid;
    private School school;//1个schid对1个学校信息
    private Major major;//1个majid对1个专业信息

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSchid() {
        return schid;
    }

    public void setSchid(String schid) {
        this.schid = schid;
    }

    public String getMajid() {
        return majid;
    }

    public void setMajid(String majid) {
        this.majid = majid;
    }

    @Override
    public String toString() {
        return "SchoolmajorServcie{" +
                "id='" + id + '\'' +
                ", schid='" + schid + '\'' +
                ", majid='" + majid + '\'' +
                ", school=" + school +
                ", major=" + major +
                '}';
    }
}
