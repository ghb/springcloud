package com.suneee.cloud.springconsumerribbon.controller;

import com.suneee.cloud.springconsumerribbon.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:shangwen
 * @Description
 * @Date: Created in 17:41 2018/3/19
 * @Modifired By:
 */
@RestController
public class UserController {
    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @RequestMapping(value = "/getUserInfo")
    public String getUserInfo(@RequestParam String userId){
        logger.info("调用ribbon");
        return userService.getUserInfo(userId);
    }
}
