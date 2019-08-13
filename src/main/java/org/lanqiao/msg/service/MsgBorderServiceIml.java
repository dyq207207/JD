package org.lanqiao.msg.service;

import org.lanqiao.msg.dao.MsgBorderDao;
import org.lanqiao.msg.entity.Msg;
import org.lanqiao.msg.entity.MsgBorder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MsgBorderServiceIml implements MsgBorderService{
    @Autowired
    MsgBorderDao msgBorderDao;
    @Override
    public List<MsgBorder> getAllList(int pageNum,int pageSize){
        List<MsgBorder> list = msgBorderDao.getAllList(pageNum,pageSize);
        return list;
    }
    public int insertMsg(Msg msg){
        return msgBorderDao.insertMsg(msg);
    }
    @Override
    public int calcPageCount(int pageSize){
        int rowCount = msgBorderDao.getMsgCount();
        if(rowCount%pageSize==0){
            return rowCount/pageSize;
        }else
            return rowCount/pageSize+1;
    }
    @Override
    public List<Msg> getAll(int pageNum,int pageSize){
        int startNum = (pageNum-1)*pageSize;
        return msgBorderDao.getAll(startNum,pageSize);
    }

}
