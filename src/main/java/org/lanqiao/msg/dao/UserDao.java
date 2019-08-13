package org.lanqiao.msg.dao;

import org.lanqiao.msg.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    public List<User> getAllUserList();
    public boolean checkUser(User user);
    //获得总数据条数
    public int getUserCount();
}
