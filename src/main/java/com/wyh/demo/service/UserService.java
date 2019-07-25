package com.wyh.demo.service;

import com.wyh.demo.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    User findOneUserById(int id);

    List<User> findAllUser();

    List<User> findOneUserJob(int id);

    void saveUser(User user);
}
