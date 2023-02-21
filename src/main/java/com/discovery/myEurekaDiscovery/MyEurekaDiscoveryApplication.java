package com.discovery.myEurekaDiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //TODO to make this SpringBoot application a Eureka Server
public class MyEurekaDiscoveryApplication {
	public static void main(String[] args) {
		SpringApplication.run(MyEurekaDiscoveryApplication.class, args);
	}

}
//TODO to bring up Eureka dashboard- http://localhost:8010/