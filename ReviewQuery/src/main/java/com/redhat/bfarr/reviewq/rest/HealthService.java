package com.redhat.bfarr.reviewq.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ws/health")
public class HealthService {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String health() {
        return "OK";
    }
}
