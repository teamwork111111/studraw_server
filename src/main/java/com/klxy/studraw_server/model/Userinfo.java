package com.klxy.studraw_server.model;

public class Userinfo {
    private int id;
    private String name;
    private int sex;
    private String desc;
    private String image;
    private String qq;
    private String no;
    private int schid;
    private int majid;
    private String remark;
    private School school;
    private Major major;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
        return "Userinfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", desc='" + desc + '\'' +
                ", image='" + image + '\'' +
                ", qq='" + qq + '\'' +
                ", no='" + no + '\'' +
                ", schid=" + schid +
                ", majid=" + majid +
                ", remark='" + remark + '\'' +
                ", school=" + school +
                ", major=" + major +
                '}';
    }
}
