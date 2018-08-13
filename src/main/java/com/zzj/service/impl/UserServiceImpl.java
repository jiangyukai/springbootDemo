package com.zzj.service.impl;/**
 * @Auther: yk
 * @Date: 2018-8-13 13:36
 * @Description:
 */

import com.zzj.dao.UserDao;
import com.zzj.entity.User;
import com.zzj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *@className UserServiceImpl
 *@Description TODO
 *@Author yk
 *@Date 2018-8-13 13:36
 *@Version 1.0
 **/
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public User findUserByName(String name) {
        return userDao.selectByPrimaryKey(1);
    }
}
