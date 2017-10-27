package com.unity.server.controller;

import com.unity.server.dao.UserDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2017/10/27.
 */
@RestController
public class HelloController {


    UserDao userDao;

    @RequestMapping("/hello")
    public String say(){

        return "Hello World";
    }
}
