package com.klxy.studraw_server.model;

public class User {
    private int id;
    private String username;
    private String password;
    private int userinfoid;
    private int roleid;
    private int status;
    private Userinfo userinfo;
    private Role role;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getUserinfoid() {
        return userinfoid;
    }

    public void setUserinfoid(int userinfoid) {
        this.userinfoid = userinfoid;
    }

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Userinfo getUserinfo() {
        return userinfo;
    }

    public void setUserinfo(Userinfo userinfo) {
        this.userinfo = userinfo;
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
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", userinfoid=" + userinfoid +
                ", roleid=" + roleid +
                ", status=" + status +
                ", userinfo=" + userinfo +
                ", role=" + role +
                '}';
    }
}
