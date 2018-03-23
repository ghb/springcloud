package com.suneee.cloud.springconsumerfeign.controller;

import com.suneee.cloud.springconsumerfeign.service.SchedualUserPorv;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:shangwen
 * @Description
 * @Date: Created in 14:26 2018/3/22
 * @Modifired By:
 */
@RestController
public class SchedualUserController {
    private static Logger logger = LoggerFactory.getLogger(SchedualUserController.class);

    //@Qualifier("SPRINGCLOUD-USER-PROVIDER")
    @Autowired
    SchedualUserPorv schedualUserPorv;

    @RequestMapping(value = "getUserInfoFeign",method = RequestMethod.GET)
    public String getUserInfoFeign(@RequestParam String userId){
        logger.info("调用feign");
        return schedualUserPorv.getUserInfoFromClient(userId);
    }
}
