package com.atguigu.cloud.config.beans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
//不改
//@Configuration+@Bean相当于在xml里面配置bean
@Configuration
public class ConfigBean {
	
	@Bean
	@LoadBalanced // 启用Ribbon的负载均衡功能
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}