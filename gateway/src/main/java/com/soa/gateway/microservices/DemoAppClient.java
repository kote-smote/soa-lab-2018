package com.soa.gateway.microservices;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("demo-app")
public interface DemoAppClient {

    @GetMapping(value = "/")
    String getHello();
}
