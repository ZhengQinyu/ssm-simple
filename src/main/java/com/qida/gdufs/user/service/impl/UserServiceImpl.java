package com.qida.gdufs.user.service.impl;

import com.qida.gdufs.user.dao.UserDao;
import com.qida.gdufs.user.po.User;
import com.qida.gdufs.user.service.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by zqy on 2017/3/28.
 */
@Service
public class UserServiceImpl implements UserService {

    private static Log logger = LogFactory.getLog(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }

    @Override
    public int addUser(User user) {
        return userDao.insertUser(user);
    }
}
