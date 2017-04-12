package com.qida.gdufs.base.action;

import com.qida.gdufs.user.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zqy on 2017/3/28.
 */

@Controller
public class PublicAction extends BaseAction {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/")
    public String index() {
//        userDao.getUserById(15L);
        return "index";
    }
}
