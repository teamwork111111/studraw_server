package com.klxy.studraw_server.model;

public class Studentinfo {
    private String id;
    private String no;
    private String smid;

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

    public String getSmid() {
        return smid;
    }

    public void setSmid(String smid) {
        this.smid = smid;
    }

    @Override
    public String toString() {
        return "Studentinfo{" +
                "id='" + id + '\'' +
                ", no='" + no + '\'' +
                ", smid='" + smid + '\'' +
                '}';
    }
}
