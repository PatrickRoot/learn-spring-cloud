package cn.sixlab.learn.spring.cloud.learnscconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class LearnScConfigServerApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(LearnScConfigServerApplication.class, args);
    }
}
