package com.qida.gdufs.user.dao;

import com.qida.gdufs.user.po.User;
import org.springframework.stereotype.Repository;

/**
 * Created by zqy on 2017/3/28.
 */
public interface UserDao {

    User getUserById(Long id);

    int insertUser(User user);
}
