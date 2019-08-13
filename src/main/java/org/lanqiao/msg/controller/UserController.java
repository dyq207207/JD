package org.lanqiao.msg.controller;


import org.lanqiao.msg.entity.User;
import org.lanqiao.msg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/* 写下面注解的原因
    1：类需要实例化对象 @Controller
    2：类中方法返回的是json @ResponseBody
 */
@RestController //两个标签的组合
public class UserController {

    @Autowired
    UserService userService;
    @RequestMapping("/get")
    public List<User> getAll(){
        return userService.getAllUserList();
    }
    @RequestMapping("/check")
    public boolean check(User user){
//        System.out.println(user.getUserName());
        return userService.checkUser(user);
    }
    //设置请求路径
    @RequestMapping("/hello")
    public String hello(){
        return "Hello";
    }
}
