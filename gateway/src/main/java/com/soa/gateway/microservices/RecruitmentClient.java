package com.soa.gateway.microservices;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("recruitment")
public interface RecruitmentClient {

    @GetMapping(value = "/")
    String getHello();
}
