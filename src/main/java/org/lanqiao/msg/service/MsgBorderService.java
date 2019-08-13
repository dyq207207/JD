package org.lanqiao.msg.service;

import org.lanqiao.msg.entity.Msg;
import org.lanqiao.msg.entity.MsgBorder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MsgBorderService {
    public List<MsgBorder> getAllList(int pageNum,int pageSize);
    public int insertMsg(Msg msg);
    public int calcPageCount(int pageSize);
    public List<Msg> getAll(int pageNum,int pageSize);
}
