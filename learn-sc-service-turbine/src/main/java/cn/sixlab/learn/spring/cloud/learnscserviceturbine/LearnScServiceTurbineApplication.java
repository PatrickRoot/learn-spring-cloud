package cn.sixlab.learn.spring.cloud.learnscserviceturbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableTurbine
@SpringBootApplication
public class LearnScServiceTurbineApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(LearnScServiceTurbineApplication.class, args);
    }
}
