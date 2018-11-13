package com.demo.kubernetes.springcloud.service;

import java.util.logging.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZipcodeServer {

	protected Logger logger = Logger.getLogger(ZipcodeServer.class.getName());

	public static void main(String[] args) {
		SpringApplication.run(ZipcodeServer.class, args);
	}
}
