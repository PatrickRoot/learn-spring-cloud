package cn.sixlab.learn.spring.cloud.learnscconfigclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class LearnScConfigClientApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(LearnScConfigClientApplication.class, args);
    }
}
