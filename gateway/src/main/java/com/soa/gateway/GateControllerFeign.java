package com.soa.gateway;

import com.soa.gateway.microservices.DemoAppClient;
import com.soa.gateway.microservices.RecruitmentClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GateControllerFeign {

    @Autowired
    private DiscoveryClient discoveryClient;
    @Autowired
    private DemoAppClient demoAppClient;
    @Autowired
    private RecruitmentClient recruitmentClient;

    @GetMapping("/services")
    public List<String> services() {
        return this.discoveryClient.getServices();
    }

    @GetMapping("/services/{serviceId}/instances")
    public List<ServiceInstance> serviceInstances(@PathVariable String serviceId) {
        return this.discoveryClient.getInstances(serviceId);
    }

    @GetMapping("/hello")
    public String greeting() {
        String hello1 = this.demoAppClient.getHello();
        String hello2 = this.recruitmentClient.getHello();

        return String.format("Got demo-app answer: %s , and recruitment app answer: %s", hello1, hello2);
    }

    @GetMapping("/hello-from-recruitment")
    public String helloFromRecruitment() {
        return recruitmentClient.getHello();
    }

    @GetMapping("/hello-from-demo-app")
    public String helloFromDemoApp() {
        return demoAppClient.getHello();
    }

}
