package com.klxy.studraw_server.model;

import java.util.Date;

public class Summary {
    private int id;
    private int userid;
    private Date createtime;
    private String content;
    private int hide;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
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
                "id=" + id +
                ", userid=" + userid +
                ", createtime=" + createtime +
                ", content='" + content + '\'' +
                ", hide=" + hide +
                '}';
    }
}
