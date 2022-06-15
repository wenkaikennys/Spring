package com.example.pojo;

/**
 * @author:洪文锴
 * @date:Created in 21:19 2022/6/5
 */
public class Users {
    private int uid;
    private String uname;
    private String uage;

    @Override
    public String toString() {
        return "Users{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", uage='" + uage + '\'' +
                '}';
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUage() {
        return uage;
    }

    public void setUage(String uage) {
        this.uage = uage;
    }

    public Users(int uid, String uname, String uage) {
        this.uid = uid;
        this.uname = uname;
        this.uage = uage;
    }

    public Users() {
    }
}
