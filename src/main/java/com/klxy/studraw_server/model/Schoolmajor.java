package com.klxy.studraw_server.model;

public class Schoolmajor {
    private int id;
    private int schid;
    private int majid;
    private School school;//1个schid对1个学校信息
    private Major major;//1个majid对1个专业信息

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSchid() {
        return schid;
    }

    public void setSchid(int schid) {
        this.schid = schid;
    }

    public int getMajid() {
        return majid;
    }

    public void setMajid(int majid) {
        this.majid = majid;
    }

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

    @Override
    public String toString() {
        return "Schoolmajor{" +
                "id=" + id +
                ", schid=" + schid +
                ", majid=" + majid +
                ", school=" + school +
                ", major=" + major +
                '}';
    }
}
