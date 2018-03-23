package com.suneee.cloud.springconsumerfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients //开启Feign的功能
@EnableHystrixDashboard //开启Hystrix 仪表盘
@EnableCircuitBreaker //解决报的unable to connect错误
public class SpringConsumerFeignApplication {

	//Hystrix 仪表盘访问地址： http://localhost:8765/hystrix
	//表单处填写http://localhost:8765/hystrix.stream然后title随便给个值，点击按钮，就可以了

	public static void main(String[] args) {
		SpringApplication.run(SpringConsumerFeignApplication.class, args);
	}
}
