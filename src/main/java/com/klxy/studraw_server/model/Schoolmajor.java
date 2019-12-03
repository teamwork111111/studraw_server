package com.klxy.studraw_server.model;

public class Schoolmajor {
    private String id;
    private String schid;
    private String majid;

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
        return "Schoolmajor{" +
                "id='" + id + '\'' +
                ", schid='" + schid + '\'' +
                ", majid='" + majid + '\'' +
                '}';
    }
}
