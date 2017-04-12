package com.qida.gdufs.user.dao;

import com.qida.gdufs.user.po.User;
import com.qida.gdufs.user.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by zqy on 2017/3/28.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-context.xml")
public class UserDaoTest {

    @Autowired
    private UserService userService;

    @Test
    @Transactional // 测试完成后自动回滚数据
    public void testGetUser() {
        User user = new User();
        user.setName("测试");
        int result = userService.addUser(user);
        Assert.assertEquals(result, 1);
    }
}
