package cn.sixlab.learn.spring.cloud.learnscservice04.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class Service04Controller {
    private static final Logger LOG = Logger.getLogger(Service04Controller.class.getName());
    
    @Autowired
    private RestTemplate restTemplate;
    
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
    
    @RequestMapping("/hi")
    public String home() {
        LOG.log(Level.INFO, " 04/hi is being called ");
        return "hi is service from 04";
    
    }
    
    @RequestMapping("/hi04")
    public String info() {
        LOG.log(Level.INFO, " 04/hi04 is being called, next-> ");
        return restTemplate.getForObject("http://localhost:8103/hi03", String.class);
    }
}
