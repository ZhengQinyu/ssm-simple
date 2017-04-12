package com.qida.gdufs.user.service;

import com.qida.gdufs.user.po.User;

/**
 * Created by zqy on 2017/3/28.
 */
public interface UserService {

    User getUserById(Long id);

    int addUser(User user);
}
