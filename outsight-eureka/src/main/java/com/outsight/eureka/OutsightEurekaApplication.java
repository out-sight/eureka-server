package com.outsight.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class OutsightEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(OutsightEurekaApplication.class, args);
	}
}
