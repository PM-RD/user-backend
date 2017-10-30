package com.unity.server.controller;

import com.unity.server.dao.UserDao;
import com.unity.server.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by admin on 2017/10/27.
 */
@RestController
public class HelloController {


    @Resource
    UserDao userDao;

    @RequestMapping("/hello")
    public String say(){
        User user = new User();
        user.setPassword("321");
        user.setUserName("kky");
        int id= userDao.insert(user);
        return "Hello World,"+id;
    }


}
