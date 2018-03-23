package com.suneee.cloud.springconsumerfeign.service;

import org.springframework.stereotype.Component;

/**
 * @Author:shangwen
 * @Description
 * @Date: Created in 15:50 2018/3/22
 * @Modifired By:
 */
@Component
public class SchedualServiceHiHystric implements SchedualUserPorv{

    public String getUserInfoFromClient(String userId) {
        return "sorry "+ userId;
    }
}
