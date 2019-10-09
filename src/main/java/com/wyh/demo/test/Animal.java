package com.wyh.demo.test;

import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class Animal {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> helloClass = Class.forName("com.wyh.demo.test.Person");
        System.out.println(helloClass.getClassLoader());
    }
}
