package com.springclouddemo.microservice.limitservice.controller;

import com.springclouddemo.microservice.limitservice.Configuration;
import com.springclouddemo.microservice.limitservice.bean.LimitsConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitConfiguration {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitsConfiguration retrieveLimitFromConfigurations() {
    //return new LimitsConfiguration(1000,1);
        return new LimitsConfiguration(configuration.getMaximum(),configuration.getMinimum());
    }
}
