package com.suneee.cloud.springconsumerribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient //向服务中心注册
@EnableHystrix //开启Hystrix
@EnableHystrixDashboard
public class SpringConsumerRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConsumerRibbonApplication.class, args);
	}

	//http://localhost:8764/hystrix页面出来之后，
	// 表单处填写http://localhost:8764/hystrix.stream然后title随便给个值，点击按钮，就可以了

	@Bean
	@LoadBalanced
	RestTemplate restTemplate(){
		return  new RestTemplate();
	}
}
