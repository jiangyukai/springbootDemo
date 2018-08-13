package com.zzj.service;/**
 * @Auther: yk
 * @Date: 2018-8-13 11:55
 * @Description:
 */

import com.zzj.entity.User;

/**
 *@className UserService
 *@Description TODO
 *@Author yk
 *@Date 2018-8-13 11:55
 *@Version 1.0
 **/
public interface UserService {
    User findUserByName(String name);
}
