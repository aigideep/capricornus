package com.ryanbao.capricornus.feignservice.controller;

import com.ryanbao.capricornus.feignservice.service.BetaService;
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
 * @time: 15:05
 * @description:
 **/
@RestController
@Slf4j
public class HiController {

    @Autowired
    BetaService betaService;

    @RequestMapping(value = "/hi")
    public String sayHi(@RequestParam(value = "name") String name) {
        return betaService.sayHi(name);
    }
}
