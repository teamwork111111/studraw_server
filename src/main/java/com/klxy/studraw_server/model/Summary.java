package com.klxy.studraw_server.model;

import java.util.Date;

public class Summary {
    private String id;
    private String userid;
    private Date createtime;
    private String content;
    private int hide;


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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getHide() {
        return hide;
    }

    public void setHide(int hide) {
        this.hide = hide;
    }

    @Override
    public String toString() {
        return "Summary{" +
                "id='" + id + '\'' +
                ", userid='" + userid + '\'' +
                ", createtime=" + createtime +
                ", content='" + content + '\'' +
                ", hide=" + hide +
                '}';
    }
}
