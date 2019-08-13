package org.lanqiao.msg.service;

import org.lanqiao.msg.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    public List<User> getAllUserList();
    public boolean checkUser(User user);
}
