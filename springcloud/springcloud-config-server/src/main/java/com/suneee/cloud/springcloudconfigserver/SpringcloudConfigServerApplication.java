package com.suneee.cloud.springcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class SpringcloudConfigServerApplication {

	/*
		文件名称：config-client-dev.properties
				  config-client-test.properties
		          config-client-pro.properties

	    启动后测试访问git远程文件信息 http://localhost:8888/config-client/dev
	    config-client 为文件名称，dev对应的环境
    */
	public static void main(String[] args) {
		SpringApplication.run(SpringcloudConfigServerApplication.class, args);
	}
}
