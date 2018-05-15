package com.soa.gateway.microservices;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("recruitment")
public interface RecruitmentClient {

    @GetMapping(value = "/hello")
    String getHello();

    @GetMapping(value = "/protected")
    String getProtected();
}
