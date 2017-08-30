package cn.sixlab.learn.spring.cloud.learnscserverconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class LearnScServerConfigApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(LearnScServerConfigApplication.class, args);
    }
}
