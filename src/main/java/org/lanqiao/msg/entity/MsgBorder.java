package org.lanqiao.msg.entity;

import java.sql.Timestamp;

public class MsgBorder {
    private int id;
    private String author;
    private String msg;
    private Timestamp date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "MsgBorder{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", msg='" + msg + '\'' +
                ", date=" + date +
                '}';
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }
}
