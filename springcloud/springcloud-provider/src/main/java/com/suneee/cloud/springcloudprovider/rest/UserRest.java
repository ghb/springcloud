package com.suneee.cloud.springcloudprovider.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:shangwen
 * @Description
 * @Date: Created in 15:59 2018/3/19
 * @Modifired By:
 */
@RestController
public class UserRest {

    private static Logger logger = LoggerFactory.getLogger(UserRest.class);

    @Value("${server.port}")
    String port;

    @RequestMapping("/user")
    public String getUser(@RequestParam String userId){
        logger.info("调用的端口{}",port);
        return "测试用户:"+userId;
    }
}
