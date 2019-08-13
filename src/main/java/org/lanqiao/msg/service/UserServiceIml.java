package org.lanqiao.msg.service;

import org.lanqiao.msg.dao.UserDao;
import org.lanqiao.msg.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceIml implements UserService {

    @Autowired
    UserDao userDao;
    @Override
    public List<User> getAllUserList(){
        return userDao.getAllUserList();
    }
    @Override
    public boolean checkUser(User user){
        return userDao.checkUser(user);
    }
}
