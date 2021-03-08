package com.universal.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class UniversalDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniversalDiscoveryServiceApplication.class, args);
	}

}
