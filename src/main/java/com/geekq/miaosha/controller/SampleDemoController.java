package com.geekq.miaosha.controller;

import com.geekq.miaosha.common.resultbean.ResultGeekQ;
import com.geekq.miaosha.domain.User;
import com.geekq.miaosha.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 测试Demo
 *
 * @author jaclon
 * @date 2019/7/20 20:52
 */
@Controller
@RequestMapping("/demo")
public class SampleDemoController {
    /*@Autowired
    private UserService userService;*/

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/queryAdminUser")
    @ResponseBody
    public String queryUser() {
        User user = userService.getById(1);
        return user.getName();
    }

    @RequestMapping("/insertUser")
    @ResponseBody
    public boolean insertUser() {
            return userService.insertUser();
    }
}
