package com.example.login.bean;

public class User {

    private Long id;

    private String username;

    private String password;

    //... getter and setter
public String getUsername(){
    return username;
}
    public long getId(){
        return id;
    }
    public String getPassword(){
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
