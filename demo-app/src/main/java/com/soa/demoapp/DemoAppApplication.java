package com.soa.demoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class DemoAppApplication {

	private static long COUNTER = 0;

		@RequestMapping("/")
		public String home() {
			return "Hello from demo app, counter = " + COUNTER++;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoAppApplication.class, args);
	}
}
