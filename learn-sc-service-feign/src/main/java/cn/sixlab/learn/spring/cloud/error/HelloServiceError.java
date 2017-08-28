package cn.sixlab.learn.spring.cloud.error;

import cn.sixlab.learn.spring.cloud.inter.IHelloService;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceError implements IHelloService{
    @Override
    public String sayHiFromClientOne(String name) {
        return "Hello," + name + ", feign error!";
    }
}
