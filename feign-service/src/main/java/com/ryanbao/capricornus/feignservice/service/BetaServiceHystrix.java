package com.ryanbao.capricornus.feignservice.service;

import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 *
 * @author zlyan
 * @date: 2018/11/27
 * @time: 11:13
 * @description:
 **/
@Component
public class BetaServiceHystrix implements BetaService {

    @Override
    public String sayHi(String name) {
        return "hi " + name + " error!";
    }
}
