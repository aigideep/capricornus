package com.ryanbao.capricornus.ribbonservice.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created with IntelliJ IDEA.
 *
 * @author zlyan
 * @date: 2018/11/22
 * @time: 11:21
 * @description:
 **/
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hasError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://BETA-SERVICE/hi?name=" + name, String.class);
    }

    public String hasError(String name) {
        return "hi " + name + ", error!";
    }
}
