package com.klxy.studraw_server.model;

public class User {
    private String id;
    private String username;
    private String password;
    private String userinfoid;
    private String roleid;
    private int status;
    private Userinfo userinfo;
    private Role role;

    public Userinfo getUserinfo() {
        return userinfo;
    }

    public void setUserinfo(Userinfo userinfo) {
        this.userinfo = userinfo;
    }

    public String getUserinfoid() {
        return userinfoid;
    }

    public void setUserinfoid(String userinfoid) {
        this.userinfoid = userinfoid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", userinfoid='" + userinfoid + '\'' +
                ", roleid='" + roleid + '\'' +
                ", status=" + status +
                ", userinfo=" + userinfo +
                ", role=" + role +
                '}';
    }
}
