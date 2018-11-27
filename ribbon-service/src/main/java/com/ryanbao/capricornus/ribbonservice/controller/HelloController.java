package com.ryanbao.capricornus.ribbonservice.controller;

import com.ryanbao.capricornus.ribbonservice.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @author zlyan
 * @date: 2018/11/22
 * @time: 14:17
 * @description:
 **/
@RestController
@Slf4j
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloService.hiService(name);
    }
}
