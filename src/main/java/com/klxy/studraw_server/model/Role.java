package com.klxy.studraw_server.model;

public class Role {
    private int id;
    private String rolename;
    private String permition;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getPermition() {
        return permition;
    }

    public void setPermition(String permition) {
        this.permition = permition;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", rolename='" + rolename + '\'' +
                ", permition='" + permition + '\'' +
                '}';
    }
}
