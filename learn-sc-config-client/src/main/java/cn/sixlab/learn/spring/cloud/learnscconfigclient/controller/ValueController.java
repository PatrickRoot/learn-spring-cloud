package cn.sixlab.learn.spring.cloud.learnscconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValueController {
    
    @Value("${foo}")
    String foo;
    
    @Value("${hello.message}")
    String hello;
    
    @RequestMapping(value = "/foo")
    public String foo() {
        return foo;
    }
    
    @RequestMapping(value = "/hello")
    public String hello() {
        return hello;
    }
}
