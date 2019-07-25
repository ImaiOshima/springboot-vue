package com.wyh.demo.dao;

public class SqlProvide {
    public StringBuilder findAllUser(){
        return new StringBuilder("SELECT * FROM USER");
    }
}
