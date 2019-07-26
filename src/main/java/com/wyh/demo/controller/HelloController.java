package com.wyh.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }
    @GetMapping("/user/hello")
    public String user(){
        return "hello user";
    }
    @GetMapping("/db/hello")
    public String dba(){
        return "hello dba";
    }
    @GetMapping("/admin/hello")
    public String admin(){
        return "hello admin";
    }

}
