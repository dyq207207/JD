package org.lanqiao.msg.entity;

import java.util.Date;

public class Msg {
    private Integer id;

    private String author;

    private String msg;

    private Date date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg == null ? null : msg.trim();
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", msg='" + msg + '\'' +
                ", date=" + date +
                '}';
    }

    public void setDate(Date date) {
        this.date = date;
    }
}