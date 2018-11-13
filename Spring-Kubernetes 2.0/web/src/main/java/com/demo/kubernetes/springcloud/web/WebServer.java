package com.demo.kubernetes.springcloud.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(useDefaultFilters = false)
public class WebServer {
	
	public static String web_service_url = null;

	public static void main(String[] args) {

		web_service_url = "zipcode-service";
		if(args.length > 0){
			System.out.println(args[0]);
			System.out.println(args[0]);
			web_service_url = args[0];
		}
		System.setProperty("server.port", "8085");
		System.setProperty("spring.config.name", "web-server");
		SpringApplication.run(WebServer.class, args);
	}
	
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public WebService service() {
		return new WebService(web_service_url);
	}
	
	@Bean
	public WebController patientController() {
		return new WebController(service());
	}
	
	protected static void errorMessage() {
		System.out.println("Usage: java -jar [jar file name] <zip web service url> <port> OR");
		System.out.println("Usage: java -jar [jar file name] <zip web service url>");
	}
}
