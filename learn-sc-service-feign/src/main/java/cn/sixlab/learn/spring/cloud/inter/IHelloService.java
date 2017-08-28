package cn.sixlab.learn.spring.cloud.inter;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "learn-sc-service")
public interface IHelloService {
    @RequestMapping("/hello")
    String sayHiFromClientOne(@RequestParam(value = "name")String name);
}
