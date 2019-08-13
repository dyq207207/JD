package org.lanqiao.msg.dao;

import org.lanqiao.msg.entity.Msg;
import org.lanqiao.msg.entity.MsgBorder;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MsgBorderDao {
    //获得信息
    public List<MsgBorder> getAllList(int pageNum,int pageSize);
    public List<Msg> getAll(int startNum,int pageSize);
    //插入信息
    public int insertMsg(MsgBorder msgBorder);
    public int insertMsg(Msg msg);
    //获得总数据条数
    public int getMsgCount();
}
