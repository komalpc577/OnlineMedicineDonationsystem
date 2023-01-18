package com.NGO;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class NgoApplication {

	public static void main(String[] args) {
		SpringApplication.run(NgoApplication.class, args);
	}
	
	 @Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();//IOC container
		//resttemplate bean object created and register bean inside the ioc container
		
	}

}
