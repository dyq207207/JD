package org.lanqiao.msg.dao;

import org.lanqiao.msg.entity.Classes;

public interface ClassesMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Classes record);

    int insertSelective(Classes record);

    Classes selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Classes record);

    int updateByPrimaryKey(Classes record);
}