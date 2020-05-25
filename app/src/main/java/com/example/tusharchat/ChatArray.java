package com.example.tusharchat;

public class ChatArray {
    public int user;
    public String msg;
    public int msgtype;
    public int image= 0;

    public ChatArray(int user, String msg, int msgtype, int image) {
        this.user = user;
        this.msg = msg;
        this.msgtype = msgtype;
        this.image = image;
    }

    public ChatArray() {
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getMsgtype() {
        return msgtype;
    }

    public void setMsgtype(int msgtype) {
        this.msgtype = msgtype;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
