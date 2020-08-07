package com.neusoft.elmboot.po;

public class Figure {

    private Integer id;
    private String username;
    private String password;

    public Figure() {}
    public Figure(Integer id, String username, String password) {
        this.id = id;
        this.password = password;
        this.username = username;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
}