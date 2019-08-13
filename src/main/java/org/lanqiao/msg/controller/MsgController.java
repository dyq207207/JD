package org.lanqiao.msg.controller;

import org.lanqiao.msg.entity.Msg;
import org.lanqiao.msg.entity.MsgBorder;
import org.lanqiao.msg.service.MsgBorderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class MsgController {
    @Autowired
    MsgBorderService msgBorderService;

    @RequestMapping("/getMsg")
    public Map getAllMsg(int pageNum,int pageSize){
        List<Msg> msgBorders=msgBorderService.getAll(pageNum,pageSize);
        int pageCount = msgBorderService.calcPageCount(pageSize);
        Map map=new HashMap();
        map.put("pageCount",pageCount);
        map.put("msgBorders",msgBorders);
        return map;
    }

    @RequestMapping("/get1")
    public Map getAllList(int pageNum,int pageSize){
        List<MsgBorder> msgBorders=msgBorderService.getAllList(pageNum,pageSize);
        int pageCount = msgBorderService.calcPageCount(pageSize);
        Map map=new HashMap();
        map.put("pageCount",pageCount);
        map.put("msgBorders",msgBorders);
        return map;
    }
    @RequestMapping("/insert")
    public int insertMsg(Msg msg){return msgBorderService.insertMsg(msg);}

}
