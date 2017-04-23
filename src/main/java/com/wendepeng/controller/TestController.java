package com.wendepeng.controller;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController implements EnvironmentAware {

    private Environment environment = null;

    @RequestMapping("/test")
    public String index(){
        System.out.println(environment);
        return "demo";
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}