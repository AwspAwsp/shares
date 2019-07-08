package com.example.login.bean;

public class Result<T> {
    //返回信息
    private String msg;
    //数据是否正常请求
    private boolean success;
    //具体返回的数据
    private T detail;
    //... getter and setter
    public String getMsg(){
        return msg;
    }
    public boolean getSuccess(){
        return success;
    }
    public T getDetail(){
        return detail;
    }
    public void setDetail(T detail) {
        this.detail = detail;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}

