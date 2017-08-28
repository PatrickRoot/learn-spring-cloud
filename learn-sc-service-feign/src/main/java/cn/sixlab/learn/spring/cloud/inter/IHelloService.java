package cn.sixlab.learn.spring.cloud.inter;

import cn.sixlab.learn.spring.cloud.error.HelloServiceError;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "learn-sc-service", fallback = HelloServiceError.class)
public interface IHelloService {
    @RequestMapping("/hello")
    String sayHiFromClientOne(@RequestParam(value = "name")String name);
}
