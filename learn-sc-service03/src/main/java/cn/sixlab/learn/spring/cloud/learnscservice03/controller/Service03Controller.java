package cn.sixlab.learn.spring.cloud.learnscservice03.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class Service03Controller {
    private static final Logger LOG = Logger.getLogger(Service03Controller.class.getName());
    
    @Autowired
    private RestTemplate restTemplate;
    
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
    
    @RequestMapping("/hi")
    public String callHome() {
        LOG.log(Level.INFO, " 03/hi is being called, next-> ");
        return restTemplate.getForObject("http://localhost:8104/hi04", String.class);
    }
    
    @RequestMapping("/hi03")
    public String info() {
        LOG.log(Level.INFO, " 03/hi03 is being called ");
        
        return "hi03 is service from 03";
    }
    
    @Bean
    public AlwaysSampler defaultSampler() {
        return new AlwaysSampler();
    }
}
