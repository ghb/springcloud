package com.suneee.cloud.springconsumerfeign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author:shangwen
 * @Description
 * @Date: Created in 11:49 2018/3/22
 * @Modifired By:
 */
@FeignClient(value = "SPRINGCLOUD-USER-PROVIDER",fallback = SchedualServiceHiHystric.class)
public interface SchedualUserPorv {

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    String getUserInfoFromClient(@RequestParam(value = "userId") String userId);

}
