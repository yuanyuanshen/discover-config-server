package com.syy.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

public class ConfigApplicationServer {
	@EnableEurekaServer
	@SpringBootApplication
	public class EurekaServiceApplication {
		public void main(String[] args) {
			SpringApplication.run(EurekaServiceApplication.class, args);
		}

	}
}
