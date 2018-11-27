package com.ryanbao.capricornus.alphaservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @author zlyan
 * @date: 2018/11/22
 * @time: 09:41
 * @description:
 **/
@RestController
@Slf4j
public class AlphaController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "alpha") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }
}
