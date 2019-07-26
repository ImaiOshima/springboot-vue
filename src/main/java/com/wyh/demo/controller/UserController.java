package com.wyh.demo.controller;

import com.wyh.demo.domain.User;
import com.wyh.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value="api/getUser")
    public User findOneCity(@RequestParam(value="id") int id){
        return userService.findOneUserById(id);
    }

    @GetMapping(value="api/getAllUser")
    public List<User> findAllUser(){
        return userService.findAllUser();
    }

    @GetMapping(value="api/getOneUserJob/{id}")
    public List<User> getOneUserJob(@PathVariable(value="id") int id){
        return userService.findOneUserJob(id);
    }

    @PostMapping(value="api/city")
    public void createCity(User user){
        user.setName("黎振升");
        user.setSex("男");
        user.setAge(18);
        userService.saveUser(user);
        System.out.println(user.getId());
    }

    @PostMapping(value="api/login")
    public void getLoginUser(@RequestBody User user){
        System.out.println(user.getName());
        System.out.println(user.getPassword());
    }
}
