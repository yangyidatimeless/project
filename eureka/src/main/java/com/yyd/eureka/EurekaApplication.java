package com.yyd.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {
	public static void main(String[] args) {
		//eureka hello local  print
		SpringApplication.run(EurekaApplication.class, args);
		System.out.println("I'm started");
	}

}
