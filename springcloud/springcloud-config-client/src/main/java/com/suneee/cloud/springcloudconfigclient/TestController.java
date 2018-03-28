package com.suneee.cloud.springcloudconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:shangwen
 * @Description
 * @Date: Created in 11:56 2018/3/27
 * @Modifired By:
 */
@RestController
@RefreshScope //使用该注解的类，会在接到SpringCloud配置中心配置刷新的时候，自动将新的配置更新到该类对应的字段中。
@EnableDiscoveryClient
public class TestController {

    @Value("${spring.datasource.url}")
    private String dataSourceUrl;

    @RequestMapping("/fromGit")
    public String fromGit(){
        return this.dataSourceUrl;
    }
}
