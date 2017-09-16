package cn.sixlab.learn.spring.cloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @Value("${server.port}")
    String port;
    
    @HystrixCommand
    @RequestMapping("/hello")
    public String home(@RequestParam String name) {
        return "Hello, " + name + " from " + port;
    }
    
}
