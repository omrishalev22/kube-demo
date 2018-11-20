package com.demo.kubernetes.springcloud.service;

import java.util.logging.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZipcodeServer {

	protected Logger logger = Logger.getLogger(ZipcodeServer.class.getName());

	public static void main(String[] args) {
		System.setProperty("server.port", "3000");
		System.setProperty("spring.config.name", "zipcode-service");

		SpringApplication.run(ZipcodeServer.class, args);
	}
}
