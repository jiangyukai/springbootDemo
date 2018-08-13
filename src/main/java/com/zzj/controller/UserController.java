package com.zzj.controller;/**
 * @Auther: yk
 * @Date: 2018-8-13 11:54
 * @Description:
 */

import com.zzj.entity.User;
import com.zzj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *@className UserController
 *@Description TODO
 *@Author yk
 *@Date 2018-8-13 11:54
 *@Version 1.0
 **/
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/index")
    public String index(){
        return "user/index";
    }

    @RequestMapping(value = "/show")
    @ResponseBody
    public String show(@RequestParam(value = "name")String name){
        User user = userService.findUserByName(name);
        if(null != user)
            return user.getId()+"/"+user.getUsername()+"/"+user.getPassword();
        else return "null";
    }
}
