package com.example.bttuan6;

public class ContactModel {
    String fullname;
    String subname;
    String time;
    Boolean isSlected;

    public ContactModel(String fullname, String subname, String time, Boolean isSlected) {
        this.fullname = fullname;
        this.subname = subname;
        this.time = time;
        this.isSlected = isSlected;
    }

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Boolean getSlected() {
        return isSlected;
    }

    public void setSlected(Boolean slected) {
        isSlected = slected;
    }
}
