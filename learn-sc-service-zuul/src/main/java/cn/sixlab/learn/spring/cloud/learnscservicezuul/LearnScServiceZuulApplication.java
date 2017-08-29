package cn.sixlab.learn.spring.cloud.learnscservicezuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class LearnScServiceZuulApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(LearnScServiceZuulApplication.class, args);
    }
}
