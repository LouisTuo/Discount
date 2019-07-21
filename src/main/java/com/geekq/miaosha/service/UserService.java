package com.geekq.miaosha.service;

import com.geekq.miaosha.dao.UserDao;
import com.geekq.miaosha.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User getById(int id) {
        return userDao.getById(id);
    }

    @Transactional
    public boolean insertUser() {
        User user2 = new User(2, "zz");
        User user1 = new User(1, "gg");
        userDao.insert(user2);
        userDao.insert(user1);

        return true;
    }

}
