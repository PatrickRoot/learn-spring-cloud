package cn.sixlab.learn.spring.cloud.learnscserverzipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@EnableZipkinServer
@SpringBootApplication
public class LearnScServerZipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnScServerZipkinApplication.class, args);
	}
}
