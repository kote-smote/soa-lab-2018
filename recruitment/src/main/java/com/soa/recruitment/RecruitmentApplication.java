package com.soa.recruitment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@EnableEurekaClient
@RestController
public class RecruitmentApplication {

    private static long COUNTER = 0;

    @GetMapping("/hello")
    public String home() {
        return "Hello from Recruitment app, counter = " + COUNTER++;
    }

    @GetMapping("/protected")
    public String protectedResource() {
        return "this is some protected resource";
    }

    public static void main(String[] args) {
        SpringApplication.run(RecruitmentApplication.class, args);
    }
}
