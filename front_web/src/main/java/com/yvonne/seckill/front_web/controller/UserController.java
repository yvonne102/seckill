package com.yvonne.seckill.front_web.controller;

import com.yvonne.seckill.pojo.User;
import com.yvonne.seckill.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findUser")
    public User findUser(Integer id){
        return userService.findByPrimaryKey(id);
    }

}
