package com.suneee.cloud.springconsumerribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author:shangwen
 * @Description
 * @Date: Created in 17:36 2018/3/19
 * @Modifired By:
 */
@Service
public class UserService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getUserInfoError")
    public String getUserInfo(String userId){
        return restTemplate.getForObject("http://SPRINGCLOUD-USER-PROVIDER/user?userId="+userId,String.class);
    }

    public String getUserInfoError(String name){
        return "getUserInfo:"+name+",sorry,error!";
    }
}
