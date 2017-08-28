package cn.sixlab.learn.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class LearnScService01Application {
    
    public static void main(String[] args) {
        SpringApplication.run(LearnScService01Application.class, args);
    }
}
