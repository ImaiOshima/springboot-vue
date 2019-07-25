package com.wyh.demo.test;

import com.wyh.demo.domain.User;
import org.apache.ibatis.annotations.One;

import javax.jws.Oneway;
import java.util.*;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<Person> person = new LinkedList<>();
        person.add(new Person("张三",11));
        person.add(new Person("李四",23));
        person.add(new Person("王五",34));
        person.add(new Person("张三",47));
        person.add(new Person("李四",58));
        person.add(new Person("王五",62));
    }
}
