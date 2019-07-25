package com.wyh.demo.service.impl;

import com.wyh.demo.config.ds.DataBase;
import com.wyh.demo.dao.UserDao;
import com.wyh.demo.domain.User;
import com.wyh.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;

    @Override
    public User findOneUserById(int id) {
        return userDao.findOneUserById(id);
    }

    @Override
    @DataBase("db2")
    public List<User> findAllUser() {
        return userDao.findAllUser();
    }

    @Override
    public List<User> findOneUserJob(int id) {
        return userDao.getOneUserJob(id);
    }

    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

}
