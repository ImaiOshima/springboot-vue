package com.wyh.demo.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Setter
@Getter
public class User {
    private int id;
    private String name;
    private String sex;
    private int age;
    private Job job;
}
