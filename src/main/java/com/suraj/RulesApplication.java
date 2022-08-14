package com.suraj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients
@ComponentScan({"com.suraj.controller"})
public class RulesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RulesApplication.class, args);
	}

}
